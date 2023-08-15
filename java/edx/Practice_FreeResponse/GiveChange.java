package edx.Practice_FreeResponse;

import java.util.Scanner;

public class GiveChange {
    private double changeAmount;

    public GiveChange(double changeAmount) {
        this.changeAmount = changeAmount;
    }

    public void calculateChange() {
        int pennies = (int) (changeAmount * 100);
        
        int quarters = getQuarters(pennies);
        int dimes = getDimes(pennies - quarters * 25);
        int nickels = getNickels(pennies - quarters * 25 - dimes * 10);
        int remainingPennies = getPennies(pennies - quarters * 25 - dimes * 10 - nickels * 5);
        
        System.out.println("Change breakdown:");
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + remainingPennies);
    }

    public static int getQuarters(int pennies) {
        return pennies / 25;
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
