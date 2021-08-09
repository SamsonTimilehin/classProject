package MyersBriggsProjectTest;


import MyersBriggsProject.PersonalityType;
import MyersBriggsProject.Question;
import MyersBriggsProject.Questionnaire;
import org.junit.jupiter.api.Test;

import java.util.List;

import static MyersBriggsProject.PersonalityType.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyersBriggsTest {
    @Test
    void questionsCanBeCreated() {
        Questionnaire questionnaire = new Questionnaire();
        assertNotNull(questionnaire);
    }

    @Test
    void testThatTheQuestionnaireContains20Questions() {
        Questionnaire questionnaire = new Questionnaire();
        assertEquals(20, questionnaire.getAllQuestions());
    }

    @Test
    void testThatRespondentsCanSelectQuestions() {
        Questionnaire questionnaire = new Questionnaire();
        questionnaire.selectGroupOfQuestions(1);

        List<Question> expectedValue = List.of(
                new Question("A.Expend energy, enjoy group", "B.Conserve energy, enjoy one-on-one"),
                new Question("A.More outgoing,think out loud", "B.More reserve,think to yourself"),
                new Question("A.Seek many tasks,public activities,interaction with others", "B.Seek private,solitary activities with quiet to concentrate"),
                new Question("A.External,communicative,express yourself", "B.Internal,reticent,keep to yourself"),
                new Question("A.Active,initiate", "B.reflective,deliberate")
        );
        assertEquals(expectedValue, questionnaire.getSelectedGroupOfQuestion());
    }

    @Test
    void testThatEveryGroupOfQuestionWillReturnAnExpectedScale() {
        Questionnaire questionnaire = new Questionnaire();
        questionnaire.selectGroupOfQuestions(3);
        questionnaire.selectOptions(new char[]{'B', 'B', 'A', 'B', 'B'});

        List<PersonalityType> expectedEnumValue = List.of(PersonalityType.F);

        assertEquals(expectedEnumValue, questionnaire.getEnumValue());
    }

    @Test
    void testThatTheArrayMustNotContainMoreThanFiveElement() {
        Questionnaire questionnaire = new Questionnaire();

        assertThrows(IllegalArgumentException.class, () -> questionnaire.selectOptions(new char[]{'A', 'B', 'A', 'B', 'B', 'B'}));
    }

    @Test
    void testThatTheProgramWillReturnFourDifferentExpectedScale() {
        Questionnaire questionnaire = new Questionnaire();

        questionnaire.selectGroupOfQuestions(1);
        questionnaire.selectOptions(new char[]{'A', 'B', 'A', 'B', 'B'});

        questionnaire.selectGroupOfQuestions(2);
        questionnaire.selectOptions(new char[]{'B', 'B', 'A', 'B', 'B'});

        questionnaire.selectGroupOfQuestions(3);
        questionnaire.selectOptions(new char[]{'B', 'B', 'A', 'B', 'B'});

        questionnaire.selectGroupOfQuestions(4);
        questionnaire.selectOptions(new char[]{'B', 'B', 'A', 'B', 'B'});

        List<PersonalityType> expectedEnumValue = List.of(I,N,F,P);

        assertEquals(expectedEnumValue, questionnaire.getEnumValue());
    }
}