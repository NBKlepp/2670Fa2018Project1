package RegularMachines;
/*
 * The DFA class represents a Deterministic Finite Automaton. 
 * @author Nick Klepp
 * @version 1.0.0
 * @since 8/13/18
 * 
 * Note: The Java unicode escape character for the lower case epsilon symbol is '\u03B5'
 * */
import java.util.Set;
import java.util.Map;
import java.util.HashSet;
import java.util.HashMap;
public class DFA {
	
	/************************************************************
	 * The static fields                                        *
	 ************************************************************/
	
	private static final String EPSILON  = "\u03B5";
	private static final String NULL_SET = "\u2205";
	
	/************************************************************
	 * The class fields                                         *
	 ************************************************************/
	
	private String 								    name;
	private HashSet<String> 						States;
	private HashSet<String> 					    alphabet;
	private HashMap<Tuple<String,String>,String>    delta;
	private String 								    start;
	private HashSet<String> 					 	accept;

	/************************************************************
	 * The class constructors                                   *
	 ************************************************************/
	
	public DFA(String 								    name, 
			   HashSet <String>                         States, 
			   HashSet <String>                      alphabet, 
			   HashMap <Tuple<String,String>,String> delta, 
			   String                                   start, 
			   HashSet<String>                          accept){
		
		this.name     = name;
		this.States   = States;
		this.alphabet = alphabet;
		this.delta    = delta;
		this.start    = start;
		this.accept   = accept;
	}
	
	public DFA(HashSet <String>                         String, 
			   HashSet <String>                         alphabet, 
			   HashMap <Tuple<String,String>,String>    delta, 
			   String                                   start, 
			   HashSet<String>                          accept){
		
		this("M",String,alphabet,delta,start,accept);
	}
	
	/************************************************************
	 * The class accessor methods                               *
	 ************************************************************/
	
	public String getName(){
		return this.name;
	}
	
	public Set<String> getStates(){
		return this.States;
	}
	
	public Set<String> getAlphabet(){
		return this.alphabet;
	}
	
	public Map getDelta(){
		return this.delta;
	}
	
	public String getStart(){
		return this.start;
	}
	
	public Set<String> getAccept(){
		return this.accept;
	}
	
	/************************************************************
	 * The rest of the public methods                           *
	 ************************************************************/
	
	/*
	 * "Computes" a string on this DFA, i.e. - decides membership in the language of the machine. 
	 * @param input the input string for computation
	 * @return true if the string is in the language of the machine, false otherwise
	 * */
	public boolean compute(String input){
		//TODO: Implement
		return true;
	}
	
	/*
	 * Creates a DFA which recognizes the union of the language of this DFA 
	 * and language of another DFA using the cross product method.
	 * @param m2 the DFA with which to union this machine
	 * @returns a new DFA object which recognizes the appropriate language*/
	public DFA union(DFA m2){
		//TODO: Implement
		return this;
	}
	
	/*
	 * Creates a DFA which recognizes the union of the language of this DFA 
	 * and language of another NFA.
	 * @param m2 the NFA with which to union this machine
	 * @returns a new DFA object which recognizes the appropriate language*/	

	public DFA union(NFA m2){
		//TODO: Implement
		return this;
	}
	/*
	 * Creates a DFA which recognizes the intersection of the language of this DFA
	 * and the language of another DFA using the cross product method.
	 * @param m2 the machine with which to intersect this machine
	 * @return a new DFA object which recognizes the appropriate language */
	public DFA intersect(DFA m2){
		//TODO: Implement
		return this;
	}
	
	/*
	 * Creates a DFA which recognizes the intersection of the language of this DFA
	 * and the language of another NFA.
	 * @param m2 the machine with which to intersect this machine
	 * @return a new DFA object which recognizes the appropriate language */
	public DFA intersect(NFA m2){
		//TODO: Implement
		return this;
	}
	
	/*
	 * Creates a DFA which recognizes the concatenation of the language of this DFA 
	 * and the language of another DFA.
	 * @param m2 the machine with which to union this machine
	 * @returns a new DFA object which recognizes the appropriate language*/
	public DFA concat(DFA m2){
		//TODO: Implement
		return this;
	}
	
	/* 
	 * Creates a DFA which recognizes the concatenation of the language of this DFA 
	 * and language of another NFA.
	 * @param m2 the machine with which to union this machine
	 * @returns a new DFA object which recognizes the appropriate language*/
	public DFA concat(NFA m2){
		//TODO: Implement
		return this;
	}

	/*
	 * Creates a DFA which recognizes the Kleene star of the language recognized by this DFA
	 * @return a new NFA object which recognizes the Kleene star of the language recognized by this DFA.*/
	public DFA kleeneStar(){
		//TODO: Implement
		return this;
	}
	
	/*
	 * Creates a DFA which recognizes the complement of the language recognized by this DFA.  
	 * @return a new DFA object which recognizes the complement of the language that this DFA recognizes */
	public DFA complement(){
		//TODO: Implement
		return this;
	}
	
	/*
	 * Creates the minimal DFA which recognizes the same language as this DFA. 
	 * @return a new DFA object which is the minimal DFA recognizes the language that this DFA recognizes.*/
	public DFA minimize(){
		//TODO: Implement
		return this;
	}
	
	/*
	 * Creates an NFA which recognizes the same language as this DFA.
	 * @return a new NFA which recognizes the same language as this DFA.
	 * */
	 public NFA NFAify(){
		 	//TODO: Implement
	  		return new NFA();
	 }
	 
	 /************************************************************
	  * These methods are not required for project one.          *
	  ************************************************************/
	/*
	 * Tells whether or not this machine recognizes the empty language.
	 * @return true if this machine recognizes the empty language, false otherwise.*/
	public boolean recognizesEmptyLanguage(){
		//TODO: Implement
		return true;
	}
	
	/*
	 * Tests whether the language recognized by this DFA is equal to 
	 * the language recognized by some other DFA. 
	 * @param m2 the other DFA to test for equality with this machine
	 * @return true if this DFA recognizes the same language as m2, false otherwise.*/
	public boolean equals(DFA m2){
		//TODO: Implement
		return true;
	}
	
	/*
	 * Tests whether the language recognized by this DFA is equal to 
	 * the language recognized by some other NFA. 
	 * @param m2 the NFA to test for equality with this machine
	 * @return true if this DFA recognizes the same language as m2, false otherwise.*/
	public boolean equals(NFA m2){
		//TODO: Implement
		return true;
	}
	
}
