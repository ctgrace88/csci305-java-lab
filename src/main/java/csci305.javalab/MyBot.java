package csci305.javalab;

public class MyBot extends Player {

    private int round = 1;

    public MyBot(){super("MyBot");}

    // Plays Rock first. If MyBot wins, it replays the opponents last move. If MyBot loses, it plays the same move.
    public Element play(){
        if (round == 1) {
            round++;
            return new Rock();
        }
        else if (super.wonLast)
            return super.oppLast;
        else
            return super.myLast;
    }
}
