package MyersBriggsProject;

import java.util.Objects;

public class Question {
   private String optionA;
    private String optionB;
    private String[] responses;

    public Question(String optionA, String optionB) {
        this.optionA = optionA;
        this.optionB = optionB;
    }

    public String getOptionA() {
        return optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String[] getResponses() {
        return responses;
    }

    public void setResponses(String... responses) {
        this.responses = responses;
    }

    @Override
    public String toString() {
        return String.format("%s\t%s%n%s%n",optionA,optionB,responses);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return Objects.equals(optionA, question.optionA) && Objects.equals(optionB, question.optionB);
    }

    @Override
    public int hashCode() {
        return Objects.hash(optionA, optionB);
    }
}

