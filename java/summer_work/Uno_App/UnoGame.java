package Uno_App;

import java.util.Scanner;

public class UnoGame {
    
    public void playerSetup(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many players are there?");
        int numOfPlayers = scanner.nextInt();
        for (int i = 0; i <= numOfPlayers; i++){
            System.out.println("What is the name of player " + i + "?");
            Player player = new Player(scanner.nextLine());
        }
        Player winningPlayer = new Player("Default Player");
        scanner.close();
    }

    public void runNewRound(){

    }
}
