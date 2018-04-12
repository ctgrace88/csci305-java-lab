package csci305.javalab;

public class Lizard extends Element {

    public Lizard(){
        super("Lizard");
    }

    // Method that defines what Lizard wins and loses against. Returns the results as a string
    public String compareTo(Element element){
        if(element.getName().equals("Rock")){
            Outcome outcome = new Outcome("Rock crushes Lizard", "Lose");
            return outcome.printOutcome();
        }
        if(element.getName().equals("Paper")){
            Outcome outcome = new Outcome("Lizard eats Paper", "Win");
            return outcome.printOutcome();
        }
        if(element.getName().equals("Scissors")){
            Outcome outcome = new Outcome("Scissors decapitate Lizard", "Lose");
            return outcome.printOutcome();
        }
        if(element.getName().equals("Lizard")){
            Outcome outcome = new Outcome("Lizard equals Lizard", "Tie");
            return outcome.printOutcome();
        }
        if(element.getName().equals("Spock")){
            Outcome outcome = new Outcome("Lizard poisons Spock", "Win");
            return outcome.printOutcome();
        }
        return "ERROR";
    }
}
