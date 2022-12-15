package org.example;

import java.util.Objects;

public class Answer {
    private int number;
    private String answer;

    public Answer(int number, String answer) {
        this.number = number;
        this.answer = answer;
    }

    public int getNumber() {
        return number;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer1 = (Answer) o;
        return number == answer1.number && answer.equals(answer1.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, answer);
    }

    @Override
    public String toString() {
        return "" + number +
                " - " + answer;
    }
}
