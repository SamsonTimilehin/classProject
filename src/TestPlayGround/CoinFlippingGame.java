package TestPlayGround;

import java.util.Scanner;

public class CoinFlippingGame {

    public static void main(String[] args) {
        CoinGame theCoinGame = new CoinGame("Peter", "Mark");

        String userAnswer;

        do {
            theCoinGame.startGame();
            System.out.println("play again");
            Scanner playGameAgain = new Scanner(System.in);
            userAnswer = playGameAgain.nextLine();
        } while ((userAnswer.startsWith("y")) || (userAnswer.startsWith("Y")));
    }
}
