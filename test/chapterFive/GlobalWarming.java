package chapterFive;

public class GlobalWarming {

    private String question1;
    private String question2;
    private String question3;
    private String question4;
    private String question5;
    private String answerToQuestion1;
    private String answerToQuestion2;
    private String answerToQuestion3;
    private String answerToQuestion4;
    private String answerToQuestion5;
    private int score;



    public void setQuestionOne(String question1) {
        this.question1 = question1;
    }

    public void setQuestionTwo(String question2) {
        this.question2 = question2;
    }

    public void setQuestionThree(String question3) {
        this.question3 = question3;
    }

    public void setQuestionFour(String question4) {
        this.question4 = question4;
    }

    public void setQuestionFive(String question5) {
        this.question5 = question5;
    }

    public String getQuestionOne() {
        return question1;
    }


    public String getQuestionTwo() {
        return question2;
    }

    public String getQuestionThree() {
        return question3;
    }

    public String getQuestionFour() {
        return question4;
    }

    public String getQuestionFive() {
        return question5;
    }

    public void setQuestionOneAnswer(String answerToQuestion1) {
        this.answerToQuestion1 = answerToQuestion1;
    }

    public String getQuestionOneAnswer() {
        return answerToQuestion1;
    }

    public void setQuestionTwoAnswer(String answerToQuestion2) {
        this.answerToQuestion2 = answerToQuestion2;
    }

    public String getQuestionTwoAnswer() {
        return answerToQuestion2;
    }

    public void setQuestionThreeAnswer(String answerToQuestion3) {
        this.answerToQuestion3 = answerToQuestion3;
    }

    public String getQuestionThreeAnswer() {
        return answerToQuestion3;
    }

    public void setQuestionFourAnswer(String answerToQuestion4) {
        this.answerToQuestion4 = answerToQuestion4;
    }

    public String getQuestionFourAnswer() {
        return answerToQuestion4;
    }

    public void setQuestionFiveAnswer(String answerToQuestion5) {
        this.answerToQuestion5 = answerToQuestion5;
    }

    public String getQuestionFiveAnswer() {
        return answerToQuestion5;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public int getScore() {
        return score++;
    }

    public void gradeUser1(String question1,String answerToQuestion1) {
        if(question1.equals(answerToQuestion1)) {
            score++;
        }

    }
    public void gradeUser2(String question2,String answerToQuestion2) {
        if (question2.equals(answerToQuestion2)) {
            score++;
        }
    }
    public void gradeUser3(String question3,String answerToQuestion3) {
        if (question3.equals(answerToQuestion3)) {
            score++;
        }
    }
    public void gradeUser4(String question4,String answerToQuestion4) {
        if (question4.equals(answerToQuestion4)) {
            score++;
        }
    }
    public void gradeUser5(String question5,String answerToQuestion5) {
        if (question5.equals(answerToQuestion5)) {
            score++;
        }
    }
}
