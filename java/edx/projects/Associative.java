package edx.projects;

import java.util.Scanner;

public class Associative {
    
    int x, y, z;

    public Associative(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 3 ints: ");
        Associative a = new Associative(s.nextInt(), s.nextInt(), s.nextInt());
        s.close();

        System.out.println("Grouping the first two terms, " + a.firstTwo());
        System.out.println("Grouping the last two terms, " + a.lastTwo());
    }

    int firstTwo(){
        return (x+y)*z;
    }

    int lastTwo(){
        return x+(y*z);
    }

}
