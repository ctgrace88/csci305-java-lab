package csci305.javalab;

public class StupidBot extends Player {

    public StupidBot(){super("StupidBot");}

    // StupidBot plays the same move each round (Rock)
    public Element play(){
        return new Rock();
    }
}
