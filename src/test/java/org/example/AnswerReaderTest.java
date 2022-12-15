package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class AnswerReaderTest {

    private static Path filePath;

    @BeforeEach
    void setUp() {
        try {
            filePath = new ClassPathResource("Answers.txt").getFile().toPath();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void readFromFile() {
        var answerReader = new AnswerReader(new AnswerParser());
        var results = answerReader.readFromFile(filePath);
        assertEquals("À", results.get(4));
    }
}