package csci305.javalab;

import java.util.HashMap;

public abstract class Element {

    private String name;        // Store name of element

    public Element(String name){
        this.name = name;
    }

    public String getName(){        // Return name of element
        return name;
    }

    public abstract String compareTo(Element element);      // Compare 2 elements to see which wins

    public static final HashMap moves;      // Hash of all the elements
    static{
        moves = new HashMap<Integer,Element>();
        moves.put(1,new Rock());
        moves.put(2,new Paper());
        moves.put(3,new Scissors());
        moves.put(4,new Lizard());
        moves.put(5,new Spock());
    }
}
