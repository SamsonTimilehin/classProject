package TicTacToeProject;

import static TicTacToeProject.BoardStatus.*;

public class TicTacToe {
    private static final BoardStatus [][] board = new BoardStatus[3][3];
    private boolean isWon;


    public BoardStatus[][] createEmptyGameBoard(){
        for(int row = 0; row < board.length; row++){

            for(int column = 0; column < board[row].length; column++){
                board[row][column] = EMPTY;

            }
        }
        return board;
    }
    public void fillGameBoard(int playPosition, String player){
        BoardStatus status = EMPTY;
        if(player.equals("player1")){
            status = X;
        }
        if(player.equals("player2")){
            status = O;
        }

        switch(playPosition){
            case 1:
               board[0][0] = status;
                break;
            case 2:
                board[0][1] = status;
                break;
            case 3:
                board[0][2] = status;
                break;
            case 4:
                board[1][0] = status;
                break;
            case 5:
                board[1][1] = status;
                break;
            case 6:
                board[1][2] = status;
                break;
            case 7:
                board[2][0] = status;
                break;
            case 8:
                board[2][1] = status;
                break;
            case 9:
                board[2][2] = status;
                break;
            default:
                break;
        }

    }


    public BoardStatus[][] getFillGameBoard() {
        return board;
    }

    public boolean gameIsWon() {
    boolean checkForWinning1 = board[0][0].equals(X) && board[0][1].equals(X) && board[0][2].equals(X) ||
                             board[1][0].equals(X) && board[1][1].equals(X) && board[1][2].equals(X) ||
                            board[2][0].equals(X) && board[2][1].equals(X) && board[2][2].equals(X) ||
                            board[0][0].equals(X) && board[1][1].equals(X) && board[2][0].equals(X) ||
                            board[0][1].equals(X) && board[1][1].equals(X) && board[2][1].equals(X) ||
                            board[0][2].equals(X) && board[1][2].equals(X) && board[2][2].equals(X) ||
                            board[0][0].equals(X) && board[1][1].equals(X) && board[2][2].equals(X) ||
                            board[0][2].equals(X) && board[1][1].equals(X) && board[2][0].equals(X) ;

        boolean checkForWinning2 = board[0][0].equals(O) && board[0][1].equals(O) && board[0][2].equals(O) ||
                board[1][0].equals(O) && board[1][1].equals(O) && board[1][2].equals(O) ||
                board[2][0].equals(O) && board[2][1].equals(O) && board[2][2].equals(O) ||
                board[0][0].equals(O) && board[1][1].equals(O) && board[2][0].equals(O) ||
                board[0][1].equals(O) && board[1][1].equals(O) && board[2][1].equals(O) ||
                board[0][2].equals(O) && board[1][2].equals(O) && board[2][2].equals(O) ||
                board[0][0].equals(O) && board[1][1].equals(O) && board[2][2].equals(O) ||
                board[0][2].equals(O) && board[1][1].equals(O) && board[2][0].equals(O) ;

        if(checkForWinning1){
            isWon = true;
    }else if(checkForWinning2){
            isWon = true;
        }
        return isWon;
    }

}
