package edx.lesson_5;

import java.util.Scanner;

public class PracticeReal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        s.close(); 

        double z = Math.sqrt(a);
        System.out.println("The answer is " + z);
     }
}