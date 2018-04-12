package csci305.javalab;

public class RandomBot extends Player {

    public RandomBot(){super("RandomBot");}

    // RandomBot chooses a completely random element to play each move
    public Element play(){
        int rand = (int )(Math.random() * 5 + 1);
        if(rand == 1){
            return new Rock();
        }
        else if(rand == 2){
            return new Paper();
        }
        else if(rand == 3){
            return new Scissors();
        }
        else if(rand == 4){
            return new Lizard();
        }
        else
            return new Spock();
    }
}
