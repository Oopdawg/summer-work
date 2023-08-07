package Uno_App;

public class Player {
    String name = "Default Player";
    int score;

    Player(String name){
        this.name = name;
        score = 0;
    }

    public int score(){
        return score;
    }

    public String name(){
        return name;
    }

}
