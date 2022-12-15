package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "org.example")
@PropertySource("classpath:answer.properties")
public class ResultsProcessorConfiguration {
    @Bean
    public ResultsProcessor resultsProcessor() {
        return new ResultsProcessor();
    }

    @Bean
    public AnswerReader answerReader() {
        return new AnswerReader(new AnswerParser());
    }
}
