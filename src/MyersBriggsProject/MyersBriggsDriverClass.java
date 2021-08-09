package MyersBriggsProject;

public class MyersBriggsDriverClass {

    public static void main(String[] args) {

   Questionnaire test = new Questionnaire();
        test.selectGroupOfQuestions(1);
        test.selectOptions(new char[]{'A','A','B','A','B'});

        test.selectGroupOfQuestions(2);
        test.selectOptions(new char[]{'B','B','A','B','B'});

        test.selectGroupOfQuestions(3);
        test.selectOptions(new char[]{'A','B','A','B','A'});

        test.selectGroupOfQuestions(4);
        test.selectOptions(new char[]{'A','B','B','A','B'});

    }
}
