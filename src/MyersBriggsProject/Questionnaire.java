package MyersBriggsProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Questionnaire {

    private final List<Question> question;
    private final List<Question> reArrangedQuestions;
    private final List<PersonalityType> enumValue;
    private int chosenGroupOfQuestions;


    public Questionnaire() {
        this.reArrangedQuestions = new ArrayList<>();
        this.enumValue = new ArrayList<>();

     this.question = List.of(
                new Question("A.Expend energy, enjoy group", "B.Conserve energy, enjoy one-on-one"),
                new Question("A.Interpret literally", "B.Look for meaning and possibilities"),
                new Question("A.Logic,thinking,questioning", "B.Empathetic,feeling,accommodating"),
                new Question("A.Organize,orderly", "B.Flexible,adaptable"),
                new Question("A.More outgoing,think out loud", "B.More reserve,think to yourself"),
                new Question("A.Practical,realistic,experiential", "B.Imaginative,innovative,theoretical"),
                new Question("A.Candid,straight forward,frank", "B.Tactful,kind,encouraging"),
                new Question("A.Plan,schedule", "B.Unplanned, spontaneous"),
                new Question("A.Seek many tasks,public activities,interaction with others", "B.Seek private,solitary activities with quiet to concentrate"),
                new Question("A.Standard,usual,conventional","B.Different,novel,unique"),
                new Question("A.firm tend to criticize, hold the line", "B.Gentle,tend to appreciate,conciliate"),
                new Question("A.Regulated,structured", "B.Easygoing,\"live\" and \"let live\""),
                new Question("A.External,communicative,express yourself", "B.Internal,reticent,keep to yourself"),
                new Question("A.Focus on here-and-now", "B.Look to the future, global perspective,big picture"),
                new Question("A.Tough-minded,just", "B.Tender-hearted,merciful"),
                new Question("A.Preparation,plan ahead", "B.Go with the flow,adapt as you go"),
                new Question("A.Active,initiate", "B.reflective,deliberate"),
                new Question("A.Facts,things,\"what is\"","B.Ideas,dreams,what could be,philosophical"),
                new Question("A.Matter of fact,issue-oriented", "B.Sensitive,people oriented,compassionate"),
                new Question("A.Control,govern", "B.Latitude,freedom")
        );

    }

       public int getAllQuestions(){
        return question.size();
    }

    public void selectGroupOfQuestions(int chosenGroupOfQuestions){

        if(chosenGroupOfQuestions < 1 || chosenGroupOfQuestions > 4){
            throw new IllegalArgumentException("Selected option should be within 1 and 4");
        }
        for(int i = chosenGroupOfQuestions - 1; i < question.size(); i+=4){
            reArrangedQuestions.add(question.get(i));
        }
        System.out.println(reArrangedQuestions);
        this.chosenGroupOfQuestions = chosenGroupOfQuestions;
    }

    public List<Question> getSelectedGroupOfQuestion(){
        return reArrangedQuestions;
    }

    public void selectOptions(char [] selectedOption){
            int optionACounter = 0;
            int optionBCounter = 0;
        for(int i = 0; i < selectedOption.length; i++){
            if(selectedOption[i] == 'A'){
                optionACounter++;
            }else if(selectedOption [i] == 'B'){
                optionBCounter++;
            }else throw new IllegalArgumentException("option must be either A or B");
            if(selectedOption.length > 5){
                throw new IllegalArgumentException("Array must not contain more than 5 elements");
            }
        }
        System.out.println(Arrays.toString(selectedOption));

        switch (chosenGroupOfQuestions) {
            case 1:
                if (optionACounter > optionBCounter) {
                    enumValue.add(PersonalityType.E);
                } else if (optionBCounter > optionACounter) {
                    enumValue.add(PersonalityType.I);
                }
                System.out.println(enumValue);
                break;
            case 2:
                if (optionACounter > optionBCounter) {
                    enumValue.add(PersonalityType.S);
                } else if (optionBCounter > optionACounter) {
                    enumValue.add(PersonalityType.N);
                }
                System.out.println(enumValue);
                break;
            case 3:
                if (optionACounter > optionBCounter) {
                    enumValue.add(PersonalityType.T);
                } else if (optionBCounter > optionACounter) {
                    enumValue.add(PersonalityType.F);
                }
                System.out.println(enumValue);
                break;
            case 4:
                if (optionACounter > optionBCounter) {
                    enumValue.add(PersonalityType.J);
                } else if (optionBCounter > optionACounter) {
                    enumValue.add(PersonalityType.P);
                }
                System.out.println(enumValue);


        }

    }
    public List<PersonalityType> getEnumValue(){
        return enumValue;
    }
}
