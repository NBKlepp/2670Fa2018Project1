package RegularMachines;

/*
 * The State class represents a state in a finite automaton. 
 * @author Nick Klepp
 * @version 1.0.0
 * @since 8/13/18
 * 
 * Note: The Java unicode escape character for the lower case epsilon symbol is '\u03B5'
 * */

public class State {
	private String name;
	
	public State(String name){
		this.name = name;
	}
	
	public State(){
		this("S");
	}
	
	public String getName(){
		return this.name;
	}
}
