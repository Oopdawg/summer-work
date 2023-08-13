package edx.lesson_7_casting;

public class CastingPractice {
    public static void main(String[] args) {
        int x = 6, y = 10;
        float z;

        z = (float)x / (float)y;

        System.out.println("The result of " + x + " / " + y + " is " + z);
    }
}