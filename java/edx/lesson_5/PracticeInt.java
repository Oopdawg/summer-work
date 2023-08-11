package edx.lesson_5;

import java.util.Scanner;

public class PracticeInt {
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          int a = s.nextInt();
          int b = s.nextInt();
          s.close();

          int x = a+b;
          System.out.println("The answer is " + x);
     }
}