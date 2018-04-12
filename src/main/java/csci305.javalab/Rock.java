package csci305.javalab;

public class Rock extends Element {

    public Rock(){ super("Rock"); }

    // Method that defines what Rock wins and loses against. Returns the results as a string
    public String compareTo(Element element){
        if(element.getName().equals("Rock")){
            Outcome outcome = new Outcome("Rock equals Rock", "Tie");
            return outcome.printOutcome();
        }
        if(element.getName().equals("Paper")){
            Outcome outcome = new Outcome("Paper covers Rock", "Lose");
            return outcome.printOutcome();
        }
        if(element.getName().equals("Scissors")){
            Outcome outcome = new Outcome("Rock crushes Scissors", "Win");
            return outcome.printOutcome();
        }
        if(element.getName().equals("Lizard")){
            Outcome outcome = new Outcome("Rock crushes Lizard", "Win");
            return outcome.printOutcome();
        }
        if(element.getName().equals("Spock")){
            Outcome outcome = new Outcome("Spock vaporizes Rock", "Lose");
            return outcome.printOutcome();
        }
        return "ERROR";
    }
}
