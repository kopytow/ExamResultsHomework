package org.example;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Path;
import java.util.Map;
import java.util.stream.Collectors;

import static java.nio.file.Files.lines;

@Service
public class AnswerReader {
    private final AnswerParser answerParser;

    public AnswerReader(AnswerParser answerParser) {
        this.answerParser = answerParser;
    }

    public Map<Integer, String> readFromFile(Path filePath) {
        try {
            return lines(filePath)
                    .map(answerParser::parseAnswer)
                    .collect(Collectors.toMap(Answer::getNumber, Answer::getAnswer));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
