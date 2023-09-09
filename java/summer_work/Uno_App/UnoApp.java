package Uno_App;

import java.util.Scanner; 

public class UnoApp {
    
    public static void main(String[] args){
        UnoApp unoApp = new UnoApp();
        unoApp.runNewGame();
    }

    public void runNewGame(){
        UnoGame game = new UnoGame();

        game.playerSetup();
        while (/*winningPlayer.score < 500*/ true){
            game.runNewRound();
        }
    }
}