package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.Map;

@Component
public class ResultsProcessor {

    @Value( "${answer.score1_4}" )
    private int score1_4;

    @Value( "${answer.score5_8}" )
    private int score5_8;

    @Value( "${answer.score9_10}" )
    private int score9_10;

    public ResultsProcessor() {
    }

    /**
     * Вычислить сумму баллов.
     * @return сумму баллов
     */
    int getTotalScore(Map<Integer, String> correctAnswer, Map<Integer, String> verifyAnswers) {
        int score = 0;
        for (Map.Entry entry : correctAnswer.entrySet()) {
            int key = (int) entry.getKey();
            if (verifyAnswers.get(key).equals(entry.getValue())) {
                score += (key <= 4) ? score1_4 : 0;
                score += (key >= 5 && key <= 8) ? score5_8 : 0;
                score += (key >= 9 && key <= 10) ? score9_10 : 0;
            }
        }
        return score;
    }
}