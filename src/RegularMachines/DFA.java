package RegularMachines;
import java.util.Set;
import java.util.Map;
import java.util.HashSet;
import java.util.HashMap;
/**
 * The DFA class represents a Deterministic Finite Automaton. 
 * @author Nick Klepp
 * @version 1.0.0
 * @since 8/13/18
 * 
 * */
//Note: The Java unicode escape character for the lower case epsilon symbol is '\u03B5'
public class DFA {
	
	private static final String EPSILON  = "\u03B5";

	/**
	 * The name of the machine*/
	private String name;
	
	/**
	 * The set of states of the machine.*/
	private HashSet<State> Q;
	
	/**
	 * The alphabet for this machine*/
	private HashSet<String> Sigma;
	
	/**
	 * The transition function for this machine.*/
	private HashMap<Tuple<State,String>,State> delta;
	
	/**
	 * The start state for this machine*/
	private State q0;
	
	/**
	 * The set of accept states for this machine.*/
	private HashSet<State> 					 		accept;

	/** The primary constructor creates a DFA object from a 
	 * HashSet of states (the set of states), a HashSet of 
	 * Strings (the alphabet), a HashMap from Tuples to States 
	 * (the transition function), a State object (the start 
	 * state) and a HashSet of State objects (the set of accept 
	 * states).
	 * 
	 * @param name the name of the machine
	 * @param Q a HashSet of states for the set of states
	 * @param Sigma a HashSet of Strings for the alphabet
	 * @param delta a HashMap from Tuples to States for the transition function
	 * @param q0 the start state for the machine
	 * @param accept a HashSet of States for the transition function*/
	
	public DFA(String 									name, 
			   HashSet <State>                          Q, 
			   HashSet <String>                  	    Sigma, 
			   HashMap <Tuple<State,String>,State>	 	delta, 
			   State                                   	q0, 
			   HashSet<State>                          	accept){
		
		this.name   = name;
		this.Q      = Q;
		this.Sigma  = Sigma;
		this.delta  = delta;
		this.q0     = q0;
		this.accept = accept;
	}
	
	/**
	 * A second constructor which doesn't take a name argument.
	 * @param Q a HashSet of states for the set of states
	 * @param Sigma a HashSet of Strings for the alphabet
	 * @param delta a HashMap from Tuples to States for the transition functione
	 * @param q0 the start state of the machine
	 * @param accept a HashSet of States for the transition function
	 * */
	public DFA(HashSet <State>                         	Q, 
			   HashSet <String>                         Sigma, 
			   HashMap <Tuple<State,String>,State>    	delta, 
			   State                                   	q0, 
			   HashSet<State>                          	accept){
		this("M",Q,Sigma,delta,q0,accept);
	}
	
	/**
	 * The most useful of the constructors which identifies the name of 
	 * the machine, the name of the start state, the names of the accept 
	 * states,  and represents the transition function as a set of triples.
	 * @param name the name of the machine
	 * @param q0 the name of the start state
	 * @param accept the names of the accept states
	 * @param triples the list of triples representing the transition function*/
	public DFA(String name, String q0, String[] accept, Triple<String,String,String> ... triples){
		
		//TODO: Implement
		this(	new HashSet<State>(),
				new HashSet<String>(),
				new HashMap<Tuple<State,String>,State>(),
				new State(""),
				new HashSet<State>());
	}

	/**
	 * The accesor method for the name of this machine.
	 * @return the name of this machine.*/
	public String name(){
		return this.name;
	}
	
	/**
	 * Returns the set of states for this machine.
	 * @return the set of states for this machine.*/
	public Set<State> Q(){
		return this.Q;
	}
	
	/**
	 * Returns the alphabet for this machine.
	 * @return the alphabet for this machine.*/
	public Set<String> Sigma(){
		return this.Sigma;
	}
	
	/**
	 * The accessor method for the transition function for this machine.
	 * @return the transition funtion for this machine.*/
	public Map<Tuple<State,String>,State> getDelta(){
		return this.delta;
	}
	
	/**
	 * The accessor method the start state of this machine.
	 * @return the start state for this machine.*/
	public State q0(){
		return this.q0;
	}
	
	/**
	 * The accessor method for the set of accept states for this machine.
	 * @return the set of accept states for this machine.*/
	public Set<State> getAccept(){
		return this.accept;
	}
		
	/**
	 * "Computes" a string on this DFA, i.e. - decides membership in the language of the machine. 
	 * @param input the input string for computation
	 * @return true if the string is in the language of the machine, false otherwise
	 * */
	public boolean compute(String input){
		//TODO: Implement
		return true;
	}
	
	/**
	 * Creates a DFA which recognizes the union of the language of this DFA 
	 * and language of another DFA using the cross product method.
	 * @param m2 the DFA with which to union this machine
	 * @return a new DFA object which recognizes the appropriate language*/
	public DFA union(DFA m2){
		//TODO: Implement
		return this;
	}
	
	/**
	 * Creates a DFA which recognizes the union of the language of this DFA 
	 * and language of another NFA.
	 * @param m2 the NFA with which to union this machine
	 * @return a new DFA object which recognizes the appropriate language*/	

	public DFA union(NFA m2){
		//TODO: Implement
		return this;
	}
	
	/**
	 * Creates a DFA which recognizes the intersection of the language of this DFA
	 * and the language of another DFA using the cross product method.
	 * @param m2 the machine with which to intersect this machine
	 * @return a new DFA object which recognizes the appropriate language */
	public DFA intersect(DFA m2){
		//TODO: Implement
		return this;
	}
	
	/**
	 * Creates a DFA which recognizes the intersection of the language of this DFA
	 * and the language of another NFA.
	 * @param m2 the machine with which to intersect this machine
	 * @return a new DFA object which recognizes the appropriate language */
	public DFA intersect(NFA m2){
		//TODO: Implement
		return this;
	}
	
	/**
	 * Creates a DFA which recognizes the concatenation of the language of this DFA 
	 * and the language of another DFA.
	 * @param m2 the machine with which to union this machine
	 * @return a new DFA object which recognizes the appropriate language*/
	public DFA concat(DFA m2){
		//TODO: Implement
		return this;
	}
	
	/** 
	 * Creates a DFA which recognizes the concatenation of the language of this DFA 
	 * and language of another NFA.
	 * @param m2 the machine with which to union this machine
	 * @return a new DFA object which recognizes the appropriate language*/
	public DFA concat(NFA m2){
		//TODO: Implement
		return this;
	}

	/**
	 * Creates a DFA which recognizes the Kleene star of the language recognized by this DFA
	 * @return a new NFA object which recognizes the Kleene star of the language recognized by this DFA.*/
	public DFA kleeneStar(){
		//TODO: Implement
		return this;
	}
	
	/**
	 * Creates a DFA which recognizes the complement of the language recognized by this DFA.  
	 * @return a new DFA object which recognizes the complement of the language that this DFA recognizes */
	public DFA complement(){
		//TODO: Implement
		return this;
	}
	
	/**
	 * Creates the minimal DFA which recognizes the same language as this DFA. 
	 * @return a new DFA object which is the minimal DFA recognizes the language that this DFA recognizes.*/
	public DFA minimize(){
		//TODO: Implement
		return this;
	}
	
	/**
	 * Creates an NFA which recognizes the same language as this DFA.
	 * @return a new NFA which recognizes the same language as this DFA.
	 * */
	 public NFA NFAify(){
		 	//TODO: Implement
	  		return new NFA();
	 }
	 
	/**
	 * Tells whether or not this machine recognizes the empty language.
	 * @return true if this machine recognizes the empty language, false otherwise.*/
	public boolean recognizesEmptyLanguage(){
		//TODO: Implement
		return true;
	}
	
	/**
	 * Tests whether the language recognized by this DFA is equal to 
	 * the language recognized by some other DFA. 
	 * @param m2 the other DFA to test for equality with this machine
	 * @return true if this DFA recognizes the same language as m2, false otherwise.*/
	public boolean equals(DFA m2){
		//TODO: Implement
		return true;
	}
	
	/**
	 * Tests whether the language recognized by this DFA is equal to 
	 * the language recognized by some other NFA. 
	 * @param m2 the NFA to test for equality with this machine
	 * @return true if this DFA recognizes the same language as m2, false otherwise.*/
	public boolean equals(NFA m2){
		//TODO: Implement
		return true;
	}
	
}
