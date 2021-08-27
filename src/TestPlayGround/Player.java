package TestPlayGround;

public class Player {

    private final String name;
    private String coinOption = "";

    private final String [] coinValue = {"Head","Tail"};

    Player(String newName){
        name = newName;
    }

    public String getCoinOption(){
        return coinOption;
    }

    public void setCoinOption(String opponentFlip){
        coinOption = (opponentFlip == "Head")? "Tail" : "Head";
    }

    public String getRandCoinOption(){
        int randNum = (Math.random() < 0.5)? 0 : 1;
        coinOption = coinValue[randNum];
        return coinValue[randNum];
    }

    public void didPlayerWin(String winningFlip){
        if(coinOption == winningFlip){
            System.out.println(name + " won with a flip of " + coinOption);
        }else{
            System.out.println(name + " lost with a flip of " + coinOption);
        }

    }
}
