package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ResultsProcessorConfigurationTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void resultsProcessor() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ResultsProcessorConfiguration.class);
        var rp = context.getBean(ResultsProcessor.class);
        var score = rp.getTotalScore(Collections.EMPTY_MAP, Collections.EMPTY_MAP);
        assertEquals(0, score);
    }

    @Test
    void answerReader() {
        var rpc = new ResultsProcessorConfiguration();
        var ar = rpc.answerReader();
        assertNotEquals(null, ar);
        System.out.println(ar.getClass().toString());
    }
}