package csci305.javalab;

public class Outcome {

    private String event;       // Stores which element beat the other element
    private String result;      // Stores whether round was a win or a loss

    public Outcome(String event, String result){
        this.event = event;
        this.result = result;
    }

    // Prints the outcome of the round
    public String printOutcome(){
        if (result.equals("Lose"))
            return ('\t' + event + "\n\tPlayer 2 won the round");
        else if (result.equals("Win"))
            return ('\t' + event + "\n\tPlayer 1 won the round");
        else
            return ('\t' + event + "\n\tRound was a tie");
    }
}
