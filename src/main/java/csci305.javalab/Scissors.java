package csci305.javalab;

public class Scissors extends Element {

    public Scissors(){
        super("Scissors");
    }

    // Method that defines what Scissors wins and loses against. Returns the results as a string
    public String compareTo(Element element){
        if(element.getName().equals("Rock")){
            Outcome outcome = new Outcome("Rock crushes Scissors", "Lose");
            return outcome.printOutcome();
        }
        if(element.getName().equals("Paper")){
            Outcome outcome = new Outcome("Scissors cut Paper", "Win");
            return outcome.printOutcome();
        }
        if(element.getName().equals("Scissors")){
            Outcome outcome = new Outcome("Scissors equals Scissors", "Tie");
            return outcome.printOutcome();
        }
        if(element.getName().equals("Lizard")){
            Outcome outcome = new Outcome("Scissors decapitate Lizard", "Win");
            return outcome.printOutcome();
        }
        if(element.getName().equals("Spock")){
            Outcome outcome = new Outcome("Spock smashes Scissors", "Lose");
            return outcome.printOutcome();
        }
        return "ERROR";
    }
}
