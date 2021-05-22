package chapterFive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GlobalWarmingTest {
    @Test
    void questionsCanBeCreated(){
        GlobalWarming globalWarming = new GlobalWarming();
        globalWarming.setQuestionOne("1. what is his name?\n A. John\n B. Rose\n C. Jane\n D. Queen");
        assertEquals("1. what is his name?\n A. John\n B. Rose\n C. Jane\n D. Queen",globalWarming.getQuestionOne());

        globalWarming.setQuestionTwo("2. what is her name?\n A. John\n B. Peter\n C. Jane\n D. Michael");
        assertEquals("2. what is her name?\n A. John\n B. Peter\n C. Jane\n D. Michael",globalWarming.getQuestionTwo());

        globalWarming.setQuestionThree("3. what is his color?\n A. Blue\n B. Green\n C. Yellow\n D. Purple");
        assertEquals("3. what is his color?\n A. Blue\n B. Green\n C. Yellow\n D. Purple",globalWarming.getQuestionThree());

        globalWarming.setQuestionFour("4. what is her color?\n A. Brown\n B. White\n C. Black\n D. Yellow");
        assertEquals("4. what is her color?\n A. Brown\n B. White\n C. Black\n D. Yellow",globalWarming.getQuestionFour());

        globalWarming.setQuestionFive("5. what state is he from?\n A. Oyo\n B. Kano\n C. Abuja\n D. Jos");
        assertEquals("5. what state is he from?\n A. Oyo\n B. Kano\n C. Abuja\n D. Jos",globalWarming.getQuestionFive());

    }
    @Test
    void setAnswersOfQuestions(){
        GlobalWarming globalWarming = new GlobalWarming();
        globalWarming.setQuestionOneAnswer("A");
        assertEquals("A", globalWarming.getQuestionOneAnswer());

        globalWarming.setQuestionTwoAnswer("C");
        assertEquals("C", globalWarming.getQuestionTwoAnswer());

        globalWarming.setQuestionThreeAnswer("B");
        assertEquals("B", globalWarming.getQuestionThreeAnswer());

        globalWarming.setQuestionFourAnswer("D");
        assertEquals("D", globalWarming.getQuestionFourAnswer());

        globalWarming.setQuestionFiveAnswer("B");
        assertEquals("B", globalWarming.getQuestionFiveAnswer());
    }
    @Test
    void testIfAnswerIsCorrect(){
        GlobalWarming globalWarming = new GlobalWarming();
        globalWarming.setScore(0);
        assertEquals(0, globalWarming.getScore());

    globalWarming.gradeUser1("1. what is his name?\n A. John\n B. Rose\n C. Jane\n D. Queen","A");
    assertEquals(1, globalWarming.getScore());

    globalWarming.gradeUser2("2. what is her name?\n A. John\n B. Peter\n C. Jane\n D. Michael","C");
    assertEquals(2, globalWarming.getScore());

    globalWarming.gradeUser3("3. what is his color?\n A. Blue\n B. Green\n C. Yellow\n D. Purple","B");
    assertEquals(3, globalWarming.getScore());

    globalWarming.gradeUser4("4. what is her color?\n A. Brown\n B. White\n C. Black\n D. Yellow","A");
    assertEquals(4, globalWarming.getScore());

    globalWarming.gradeUser5("5. what state is he from?\n A. Oyo\n B. Kano\n C. Abuja\n D. Jos","B");
    assertEquals(5, globalWarming.getScore());
    }

}