package chapterFour;

public class PlayGround2 {

    private String optionA;
    private String optionB;
    private String responses = " ";
    private static int countResponses;



    public PlayGround2(String optionA, String optionB) {
        this.optionA = optionA;
        this.optionB = optionB;
        ++countResponses;

    }
    public void setResponses(String responsesPara){
        responses += responsesPara;
    }
    public String getResponses(){
        return responses;
    }
    public int getCountResponses(){
        return countResponses;
    }

    @Override
    public String toString() {
        return "PlayGround2{" +
                "optionA='" + optionA + '\'' +
                ", optionB='" + optionB + '\'' +
                '}';
    }
}