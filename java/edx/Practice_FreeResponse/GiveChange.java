package edx.Practice_FreeResponse;

import java.util.Scanner;

public class GiveChange {
    private double changeAmount;

    public GiveChange(double changeAmount) {
        this.changeAmount = changeAmount;
    }

    public void calculateChange() {
        int changeInPennies = (int) (changeAmount * 100);
        
        int quarters = getQuarters(changeInPennies);
        int dimes = getDimes(changeInPennies - quarters * 25);
        int nickels = getNickels(changeInPennies - quarters * 25 - dimes * 10);
        int remainingPennies = getPennies(changeInPennies - quarters * 25 - dimes * 10 - nickels * 5);
        
        System.out.println("Change breakdown: " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, " + remainingPennies +" pennies.");
    }

    public static int getQuarters(int changeInPennies) {
        return changeInPennies / 25;
    }
    
    public static int getDimes(int pennies) {
        return pennies / 10;
    }
    
    public static int getNickels(int pennies) {
        return pennies / 5;
    }
    
    public static int getPennies(int pennies) {
        return pennies;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the change amount in dollars and cents: ");
        double changeAmount = scanner.nextDouble();
        
        GiveChange giveChange = new GiveChange(changeAmount);
        giveChange.calculateChange();
        
        scanner.close();
    }
}
