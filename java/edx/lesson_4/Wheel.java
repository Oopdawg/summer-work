package edx.lesson_4;

import java.util.Scanner;

public class Wheel {
    
    double radius;

    Wheel (double radius){
        this.radius = radius;
    }

    double getCircumference (){
        return 2 * radius * Math.PI;
    }

    double getArea (){
        return radius * radius * Math.PI;
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the radius of your wheel as a real: ");
        Wheel w = new Wheel(scanner.nextDouble());
        scanner.close();

        System.out.println(w.getCircumference());
        System.out.println(w.getArea());

    }
}
