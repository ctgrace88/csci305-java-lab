package csci305.javalab;

public class Paper extends Element {

    public Paper(){
        super("Paper");
    }

    // Method that defines what Paper wins and loses against. Returns the results as a string
    public String compareTo(Element element){
        if(element.getName().equals("Rock")){
            Outcome outcome = new Outcome("Paper covers Rock", "Win");
            return outcome.printOutcome();
        }
        if(element.getName().equals("Paper")){
            Outcome outcome = new Outcome("Paper equals Paper", "Tie");
            return outcome.printOutcome();
        }
        if(element.getName().equals("Scissors")){
            Outcome outcome = new Outcome("Scissors cut Paper", "Lose");
            return outcome.printOutcome();
        }
        if(element.getName().equals("Lizard")){
            Outcome outcome = new Outcome("Lizard eats Paper", "Lose");
            return outcome.printOutcome();
        }
        if(element.getName().equals("Spock")){
            Outcome outcome = new Outcome("Paper disproves Spock", "Win");
            return outcome.printOutcome();
        }
        return "ERROR";
    }
}
