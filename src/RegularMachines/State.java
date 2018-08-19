package RegularMachines;

/**
 * The State class represents a state in a finite automaton. 
 * @author Nick Klepp
 * @version 1.0.0
 * @since 8/13/18
 * 
 * */
// * Note: The Java unicode escape character for the lower case epsilon symbol is '\u03B5'

public class State {
	private String name;
	
	/**
	 * The constructor for the State object.
	 * @param name the name of the State*/
	public State(String name){
		this.name = name;
	}
	
	/**
	 * A secondary constructor with no specification for the name of the state. 
	 * */
	public State(){
		this("S");
	}
	
	/**
	 * Accessor method for the name of the State. 
	 * @return the name of the state*/
	public String name(){
		return this.name;
	}
}
