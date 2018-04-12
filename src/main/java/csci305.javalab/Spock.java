package csci305.javalab;

public class Spock extends Element {

    public Spock(){
        super("Spock");
    }

    // Method that defines what Spock wins and loses against. Returns the results as a string
    public String compareTo(Element element){
        if(element.getName().equals("Rock")){
            Outcome outcome = new Outcome("Spock vaporizes Rock", "Win");
            return outcome.printOutcome();
        }
        if(element.getName().equals("Paper")){
            Outcome outcome = new Outcome("Paper disproves Spock", "Lose");
            return outcome.printOutcome();
        }
        if(element.getName().equals("Scissors")){
            Outcome outcome = new Outcome("Spock smashes Scissors", "Win");
            return outcome.printOutcome();
        }
        if(element.getName().equals("Lizard")){
            Outcome outcome = new Outcome("Lizard poisons Spock", "Lose");
            return outcome.printOutcome();
        }
        if(element.getName().equals("Spock")){
            Outcome outcome = new Outcome("Spock equals Spock", "Tie");
            return outcome.printOutcome();
        }
        return "ERROR";
    }
}
