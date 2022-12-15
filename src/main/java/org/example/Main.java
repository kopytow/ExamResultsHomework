package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ResultsProcessorConfiguration.class);
        var processor = context.getBean(ResultsProcessor.class);
        var answerReader = context.getBean(AnswerReader.class);
        Path pathCorrectAnswers = new ClassPathResource("Keys.txt").getFile().toPath();;
        Path pathVerifyAnswers = new ClassPathResource("Answers.txt").getFile().toPath();;
        var correctAnswers = answerReader.readFromFile(pathCorrectAnswers);
        var verifyAnswers = answerReader.readFromFile(pathVerifyAnswers);
        int totalScore = processor.getTotalScore(correctAnswers, verifyAnswers);
        System.out.println("суммарное количества баллов = " + totalScore);
    }
}