import board.Board;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import players.Player;
import enumCell.CellValue;
import tictactoeGame.TicTacToe;

import static org.junit.jupiter.api.Assertions.*;
import static enumCell.CellValue.*;

public class TicTacToeTest {
    @Test
    public void testThatTheGameBoardShouldStartEmpty(){
      Board board = new Board();
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                   assertEquals(board.getCellValues()[row][column], CellValue.EMPTY);
            }
        }
//        CellValue[][] cellValues = {{EMPTY,EMPTY,EMPTY},{EMPTY,EMPTY,EMPTY},{EMPTY,EMPTY,EMPTY}};
//        assertArrayEquals(board.getCellValues(), cellValues);
    }

    @Test
    @DisplayName("Test That Two people should be able to play the game")
    public void testThatGameIsCreated_OnlyTwoPlayersAreAllowedPlayTheGame(){
        Player[] players = {
                new Player("PlayerName", X),
                new Player("PlayerName", O),
                new Player("PlayerName", X),
                new Player("PlayerName", O),
        };
        assertThrows(RuntimeException.class, ()->{
            TicTacToe newGame = new TicTacToe(players);
        }, "Hey There, 2 People Are Required To Play This Game");
    }

    @Test
    @DisplayName("Test That Players Can Play The Game Once The Game Starts")
    public void gameStarts_PlayersCanPlayGame() {
        Player player1 = new Player("Daniel", X);
        Player player2 = new Player("Abdulmalik", O);
        Player[] players = {player1, player2};
        TicTacToe newGame = new TicTacToe(players);
        newGame.startToPlay();
        newGame.play(player1, 9);
        newGame.play(player2, 7);
        newGame.play(player2, 8);
        newGame.play(player2, 2);
        newGame.play(player2, 5);
        newGame.play(player2, 7);
        newGame.play(player2, 1);
        System.out.println(newGame.getBoard());
    }

    @Test
    public void testThatPlayersCannotPlayIfGameHasNotStarted(){
        Player player1 = new Player("Daniel", X);
        Player player2 = new Player("Abdulmalik", O);
        Player[] players = {player1, player2};
        TicTacToe newGame = new TicTacToe(players);
        newGame.unableToPlay();
        newGame.startToPlay();
    }
    @Test
    public void testThatFirstPlayerAlwaysUseXTest(){
        Player player1 = new Player("Daniel", X);
        player1.setValue(X);
        assertEquals(X, player1.getValue());
    }

    @Test
    public void testThatSecondPlayerAlwaysUseOTest(){
        Player player2 = new Player("Abdulmalik", O);
        player2.setValue(O);
        System.out.println(player2);
        assertEquals(O, player2.getValue());
    }

    @Test
    public void PlayersOnlyPlayOnEmptySpaces(){
        Player player1 = new Player("Daniel", X);
        Player player2 = new Player("Abdulmalik", O);
        Player[] players = {player1, player2};
        TicTacToe newGame = new TicTacToe(players);
        newGame.startToPlay();

        assertThrows(RuntimeException.class, ()->{
            newGame.play(player1, 1);
            newGame.play(player2, 1);
        }, "Hey, It already been played");
    }

    @Test
    public void IfAPlayerWinsOrIfItIsADrawAfterEachMoveTest(){
        Player player1 = new Player("Daniel", X);
        Player player2 = new Player("Abdulmalik", O);
        Player[] players = {player1, player2};
        TicTacToe newGame = new TicTacToe(players);
        newGame.startToPlay();
        newGame.play(player1, 4);
        newGame.play(player2, 1);
        newGame.play(player1, 5);
        newGame.play(player2, 2);
        newGame.play(player1, 6);
        newGame.play(player2, 7);
        Player playerOne = newGame.won(player1);
        Player playerTwo = newGame.won(player2);
        System.out.println(playerOne);
        System.out.println(playerTwo);
    }

    @Test
    public void PlayerCanChooseWhoGoesFirstOrSecondTest(){
        Player player1 = new Player("Daniel", X);
        Player player2 = new Player("Abdulmalik", O);
        Player[] players = {player1, player2};
        TicTacToe newGame = new TicTacToe(players);
        newGame.chooseWhoPlaysFirst(players);
        newGame.startToPlay();
        newGame.play(player1, 4);
        newGame.play(player2, 1);
        newGame.play(player1, 5);
        newGame.play(player2, 2);
        newGame.play(player1, 6);
        newGame.play(player2, 7);
        Player playerOne = newGame.won(player1);
        Player playerTwo = newGame.won(player2);
        System.out.println(playerOne);
        System.out.println(playerTwo);
    }
}

