package csci305.javalab;

public class LastPlayBot extends Player {

    private int turn = 1;

    public LastPlayBot(){super("LastPlayBot");}

    // LastPlayBot plays a predefined move the first round, then plays the move it's opponent played the last round for
    // the remainder of the rounds.
    public Element play(){
        if(turn == 1){
            turn++;
            return new Paper();
        }
        else{
            return super.oppLast;
        }
    }
}
