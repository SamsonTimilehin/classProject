package dataStructureAndAlgorithm;

public class JoinWords {

    public static void main(String[] args) {
        String[] result = {"the ","boy ","left ","early"};
        System.out.println(displayJoinedWord(result));
    }
    public static String displayJoinedWord(String[]words){
        StringBuilder sentence = new StringBuilder();
        for(String word : words){
            sentence.append(word);
        }
        return sentence.toString();
    }
}
