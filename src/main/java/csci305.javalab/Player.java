package csci305.javalab;

public abstract class Player {

    private String name;        // Stores the name of the type of player
    public Element myLast;      // Stores the players last move
    public Element oppLast;     // Stores the opponents last move
    public boolean wonLast = false;        // Boolean to check if MyBot won the last round or not


    public Player(String name){
        this.name = name;
    }

    // Returns the name of the player
    public String getName(){
        return name;
    }

    // Method for the players to play a move
    public abstract Element play();

    // Stores the players move for use in the decision of future moves
    public void storeMyLast(Element last){
        this.myLast = last;
    }

    // Stores the opponents move for use in the decision of future moves
    public void storeOppLast(Element last){
        this.oppLast = last;
    }

    // Set wonLast variable
    public void setWonLast(boolean last){
        wonLast = last;
    }
}
