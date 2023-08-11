package edx.projects;

public class AboutMe {
    
    public static void main(String[] args) {
        System.out.println("Hey, hows it going?");
        AboutMe am = new AboutMe();
        System.out.println("My name is " + am.myName() + ", and I attend " 
        + am.mySchool() + ". I am " + am.myAge() + " years old.");
    }

    String myName() {
        return "Mr Potato";
    }

    String mySchool() {
        return "Spy school";
    }

    int myAge() {
        return 37;
    }
}