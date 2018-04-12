package csci305.javalab;

public class IterativeBot extends Player {

    private int iter = 1;       // iter counts from 1 to 5 and repeats

    public IterativeBot(){super("IterativeBot");}

    // IterativeBot starts playing one move, then cycles through the other moves. After all 5 moves it will repeat the
    // sequence over again
    public Element play(){
        if(iter == 1){
            iter++;
            return new Rock();
        }
        else if(iter == 2){
            iter++;
            return new Paper();
        }
        else if(iter == 3){
            iter++;
            return new Scissors();
        }
        else if(iter == 4){
            iter++;
            return new Lizard();
        }
        else {
            iter = 1;
            return new Spock();
        }
    }
}
