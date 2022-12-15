package org.example;

import org.springframework.stereotype.Component;

@Component
public class AnswerParser {
    private static final String SEPARATOR = "-";

    public Answer parseAnswer(String line) {
        var answerParts = line.split(SEPARATOR);
        var number = Integer.valueOf(answerParts[0]);
        var answer = answerParts[1];
        return new Answer(number, answer);
    }
}
