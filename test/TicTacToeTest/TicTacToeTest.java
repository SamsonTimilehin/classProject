package TicTacToeTest;

import TicTacToeProject.BoardStatus;
import TicTacToeProject.TicTacToe;
import org.junit.jupiter.api.Test;

import static TicTacToeProject.BoardStatus.*;
import static org.junit.jupiter.api.Assertions.*;


public class TicTacToeTest {
    @Test
    void ticTacToeGameIsCreate(){
        TicTacToe ticTacGame = new TicTacToe();
        assertNotNull(ticTacGame);
    }
    @Test
    void ticTacToeCanDisplayEmptyBoardGame(){
        TicTacToe ticTacGame = new TicTacToe();

        BoardStatus[][] expected = {
                        {EMPTY, EMPTY, EMPTY},
                        {EMPTY, EMPTY, EMPTY},
                        {EMPTY, EMPTY, EMPTY}
        };
       assertArrayEquals(expected, ticTacGame.createEmptyGameBoard());
    }
    @Test
    void testThatGameBoardCanBeFilled(){
        TicTacToe ticTacToeGame = new TicTacToe();

        ticTacToeGame.createEmptyGameBoard();

        ticTacToeGame.fillGameBoard(1, "player1");
        ticTacToeGame.fillGameBoard(4, "player1");
        ticTacToeGame.fillGameBoard(2, "player2");

        BoardStatus[][] expectedResult = {
                {X,O, EMPTY},
                {X, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY}
        };
        assertArrayEquals(expectedResult, ticTacToeGame.getFillGameBoard());
    }
  @Test
    void testThatPlayerCanWinGame(){
      TicTacToe ticTacToeGame = new TicTacToe();

      ticTacToeGame.createEmptyGameBoard();

      ticTacToeGame.fillGameBoard(4, "player2");
      ticTacToeGame.fillGameBoard(5, "player2");
      ticTacToeGame.fillGameBoard(6, "player2");


      assertTrue(ticTacToeGame.gameIsWon());
  }
}
