package tictactoeGame;

import board.Board;
import enumCell.CellValue;
import players.Player;

import static java.math.BigInteger.TWO;
import static java.math.BigInteger.ZERO;

public class TicTacToe{
    private final Player[] players = new Player[TWO.intValue()];
    private Board board;
    private boolean start;
    private boolean winningPlayer;


    public TicTacToe(Player[] players){
        if (players.length == 2) {
            board = new Board();
            System.arraycopy(players, ZERO.intValue(), this.players, ZERO.intValue(), players.length);
        }
        else throw new RuntimeException("Hey There, 2 People Are Required To Play This Game");
    }

    public void unableToPlay() {
        if (!start) {
            System.out.println("Please wait the game will soon come up");
        }
    }

    public void startToPlay() {
        if (start) {
            board.getCellValues();
        }
    }

    public void play(Player player, int position) {
        switch (position) {
            case 1 -> {
                if (board.getCellValues()[0][0] == CellValue.EMPTY) {
                    board.getCellValues()[0][0] = player.getValue();
                }
                else throw new RuntimeException("Hey, It already been played");
            }
            case 2 -> {
                if (board.getCellValues()[0][1] == CellValue.EMPTY) {
                    board.getCellValues()[0][1] = player.getValue();
                }
                else throw new RuntimeException("Hey, It already been played");
            }
            case 3 ->{
                if (board.getCellValues()[0][2] == CellValue.EMPTY) {
                    board.getCellValues()[0][2] = player.getValue();
                }
                else throw new RuntimeException("Hey, It already been played");
            }

            case 4 -> {
                if (board.getCellValues()[1][0] == CellValue.EMPTY) {
                    board.getCellValues()[1][0] = player.getValue();
                }
                else throw new RuntimeException("Hey, It already been played");
            }
            case 5 -> {
                if (board.getCellValues()[1][1] == CellValue.EMPTY) {
                    board.getCellValues()[1][1] = player.getValue();
                }
                else throw new RuntimeException("Hey, It already been played");
            }
            case 6 -> {
                if (board.getCellValues()[1][2] == CellValue.EMPTY) {
                    board.getCellValues()[1][2] = player.getValue();
                }
                else throw new RuntimeException("Hey, It already been played");
            }
            case 7 -> {
                if (board.getCellValues()[2][0] == CellValue.EMPTY) {
                    board.getCellValues()[2][0] = player.getValue();
                }
                else throw new RuntimeException("Hey, It already been played");
            }
            case 8 -> {
                if (board.getCellValues()[2][1] == CellValue.EMPTY) {
                    board.getCellValues()[2][1] = player.getValue();
                }
                else throw new RuntimeException("Hey, It already been played");
            }
            case 9 -> {
                if (board.getCellValues()[2][2] == CellValue.EMPTY) {
                    board.getCellValues()[2][2] = player.getValue();
                }
                else throw new RuntimeException("Hey, It already been played");
            }
            default -> throw new RuntimeException("Please Enter A Number Between 1 and 9!!!");
        }
    }


    public Board getBoard() {
        return board;
    }

    public Player won(Player player) {
        if (player.getValue() == board.getCellValues()[0][0] && player.getValue() == board.getCellValues()[0][1]
                && player.getValue() == board.getCellValues()[0][2]){
            checkWinningCondition(player);
        }

        if (player.getValue() == board.getCellValues()[1][0] && player.getValue() == board.getCellValues()[1][1]
                && player.getValue() == board.getCellValues()[1][2]){
            checkWinningCondition(player);
        }

        if (player.getValue() == board.getCellValues()[2][0] && player.getValue() == board.getCellValues()[2][1]
                && player.getValue() == board.getCellValues()[2][2]){
            checkWinningCondition(player);
        }

        if (player.getValue() == board.getCellValues()[0][0] && player.getValue() == board.getCellValues()[1][0]
                && player.getValue() == board.getCellValues()[2][0]){
            checkWinningCondition(player);
        }

        if (player.getValue() == board.getCellValues()[0][1] && player.getValue() == board.getCellValues()[1][1]
                && player.getValue() == board.getCellValues()[2][1]){
            checkWinningCondition(player);
        }

        if (player.getValue() == board.getCellValues()[0][2] && player.getValue() == board.getCellValues()[1][2]
                && player.getValue() == board.getCellValues()[2][2]){
            checkWinningCondition(player);
        }

        if (player.getValue() == board.getCellValues()[0][0] && player.getValue() == board.getCellValues()[1][1]
                && player.getValue() == board.getCellValues()[2][2]){
            checkWinningCondition(player);
        }

        if (player.getValue() == board.getCellValues()[0][2] && player.getValue() == board.getCellValues()[1][1]
                && player.getValue() == board.getCellValues()[2][0]){
            checkWinningCondition(player);
        }
        return player;
    }

    public Player draw(Player player) {
        if (player.getValue() != board.getCellValues()[0][0] && player.getValue() != board.getCellValues()[0][1]
                && player.getValue() != board.getCellValues()[0][2]){
            checkDrawingCondition(player);
        }
        if (player.getValue() != board.getCellValues()[1][0] && player.getValue() != board.getCellValues()[1][1]
                && player.getValue() != board.getCellValues()[1][2]){
            checkDrawingCondition(player);
        }
        if (player.getValue() != board.getCellValues()[2][0] && player.getValue() != board.getCellValues()[2][1]
                && player.getValue() != board.getCellValues()[2][2]){
            checkDrawingCondition(player);
        }

        if (player.getValue() != board.getCellValues()[0][0] && player.getValue() != board.getCellValues()[1][0]
                && player.getValue() != board.getCellValues()[2][0]){
            checkDrawingCondition(player);
        }

        if (player.getValue() != board.getCellValues()[0][1] && player.getValue() != board.getCellValues()[1][1]
                && player.getValue() != board.getCellValues()[2][1]){
            checkDrawingCondition(player);
        }

        if (player.getValue() != board.getCellValues()[0][2] && player.getValue() != board.getCellValues()[1][2]
                && player.getValue() != board.getCellValues()[2][2]){
            checkDrawingCondition(player);
        }

        if (player.getValue() != board.getCellValues()[0][0] && player.getValue() != board.getCellValues()[1][1]
                && player.getValue() != board.getCellValues()[2][2]){
            checkWinningCondition(player);
        }

        if (player.getValue() == board.getCellValues()[0][2] && player.getValue() == board.getCellValues()[1][1]
                && player.getValue() == board.getCellValues()[2][0]){
            checkDrawingCondition(player);
        }
        return player;
    }

    public boolean checkWinningCondition(Player player){
        CellValue[][] cellValues = board.getCellValues();
        boolean[] winningConditions = new boolean[]{
                cellValues[0][0] == player.getValue() && cellValues[0][1] == player.getValue() && cellValues[0][2]== player.getValue(),
                cellValues[1][0] == player.getValue() && cellValues[1][1] == player.getValue() && cellValues[1][2]== player.getValue(),
                cellValues[2][0] == player.getValue() && cellValues[2][1] == player.getValue() && cellValues[2][2]== player.getValue(),
                cellValues[0][0] == player.getValue() && cellValues[1][0] == player.getValue() && cellValues[2][0]== player.getValue(),
                cellValues[0][1] == player.getValue() && cellValues[1][1] == player.getValue() && cellValues[2][1]== player.getValue(),
                cellValues[0][2] == player.getValue() && cellValues[1][2] == player.getValue() && cellValues[2][2]== player.getValue(),
                cellValues[0][0] == player.getValue() && cellValues[1][1] == player.getValue() && cellValues[2][2]== player.getValue(),
                cellValues[0][2] == player.getValue() && cellValues[1][1] == player.getValue() && cellValues[2][0]== player.getValue(),
        };
        boolean playerWon = false;
        for (boolean winningCondition: winningConditions) {
            if (winningCondition) {
                playerWon = true;
                return playerWon;
            }
        }
        return playerWon;
    }
    public boolean checkDrawingCondition(Player player){
        CellValue[][] cellValues = board.getCellValues();
        boolean[] drawingConditions = new boolean[]{
                cellValues[0][0] != player.getValue() && cellValues[0][1] != player.getValue() && cellValues[0][2]!= player.getValue(),
                cellValues[1][0] != player.getValue() && cellValues[1][1] != player.getValue() && cellValues[1][2]!= player.getValue(),
                cellValues[2][0] != player.getValue() && cellValues[2][1] != player.getValue() && cellValues[2][2]!= player.getValue(),
                cellValues[0][0] != player.getValue() && cellValues[1][0] != player.getValue() && cellValues[2][0]!= player.getValue(),
                cellValues[0][1] != player.getValue() && cellValues[1][1] != player.getValue() && cellValues[2][1]!= player.getValue(),
                cellValues[0][2] != player.getValue() && cellValues[1][2] != player.getValue() && cellValues[2][2]!= player.getValue(),
                cellValues[0][0] != player.getValue() && cellValues[1][1] != player.getValue() && cellValues[2][2]!= player.getValue(),
                cellValues[0][2] != player.getValue() && cellValues[1][1] != player.getValue() && cellValues[2][0]!= player.getValue(),
        };
        boolean playerDraw = false;
        for (boolean drawingCondition: drawingConditions) {
            if (drawingCondition) {
                playerDraw = true;
                return playerDraw;
            }
        }
        return playerDraw;


//        public void chooseWhoPlaysFirst(Player[] player) {
//        for (int count = 0; count < player.length; count++) {
//            if (player[count] == CellValue.X) {
//
//            }
//        }
//    }
    }

//
}
