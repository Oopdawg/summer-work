package edx.lesson_4;

public class Robot{
    
    String name;

    Robot(String name){
        this.name = name;
    }

    void speak (String message){
        System.out.println(message + name);
    }

    public static void main (String[] args){
        Robot r = new Robot("Chadwick");
        r.speak("Yo, its: ");
    }
}