package RegularMachines;
/*
 * The NFA class represents a Non-deterministic Finite Automaton. 
 * @author Nick Klepp
 * @version 1.0.0
 * @since 8/13/18
 * 
 * Note: The Java unicode escape character for the lower case epsilon symbol is '\u03B5'
 * */

import java.util.HashMap;
import java.util.HashSet;

public class NFA {
	/************************************************************
	 * The static fields and methods                            *
	 ************************************************************/
	
	private static final String EPSILON  = "\u03B5";	
	private static final String NULL_SET = "\u2205";
	private static final String UNION	 = "\u222A";
	
	/************************************************************
	 * The class fields                                         *
	 ************************************************************/
	//TODO: Implement 
	
	/************************************************************
	 * The accessor methods                                     *
	 ************************************************************/
	//TODO: Implement
	
	/************************************************************
	 * The class constructors                                   *
	 ************************************************************/
	//TODO: Implement
	
	/************************************************************
	 * The rest of th epublic API                               *
	 ************************************************************/
	
	/*
	 * "Computes" the string on this NFA.
	 * @param s the string to compute on this NFA 
	 * @return true if the string is accepted by the NFA, false otherwise.
	 * */
	public boolean compute(String s){
		//TODO: Implement
		return true;
	}
	
	/*
	 * Creates an new NFA which recognizes the union of the language of this NFA 
	 * and language of another DFA using the nondeterministic method.
	 * @param m2 the machine with which to union this machine
	 * @returns a new NFA object which recognizes the appropriate language*/
	public NFA union(DFA m2){
		//TODO: Implement
		return this;
	}
	
	/*
	 * Creates an NFA which recognizes the union of the language of this NFA 
	 * and language of another NFA using the nondeterministic method.
	 * @param m2 the machine with which to union this machine
	 * @returns a new NFA object which recognizes the appropriate language*/
	public NFA union(NFA m2){
		//TODO: Implement
		return this;
	}
	
	/*
	 * Creates an NFA which recognizes the union of the language of this NFA 
	 * and language of another machine NFA using the nondeterministic method.
	 * @param m2 the machine with which to union this machine
	 * @returns a new NFA object which recognizes the appropriate language*/
	public NFA concat(NFA m2){
		//TODO: Implement
		return this;
	}
	
	/*
	 * Creates an NFA which recognizes the union of the language of this NFA 
	 * and language of another DFA using the nondeterministic method.
	 * @param m2 the machine with which to union this machine
	 * @returns a new NFA object which recognizes the appropriate language*/
	public NFA concat(DFA m2){
		//TODO: Implement
		return this;
	}
	
	/*
	 * Creates an NFA which recognizes the intersection of the language of this NFA
	 * and the language of another NFA using the nondeterministic method.
	 * @param m2 the machine with which to intersect this machine
	 * @return a new DFA object which recognizes the appropriate language */
	public NFA intersect(NFA m2){
		//TODO: Implement
		return this;
	}
	
	/*
	 * Creates an NFA which recognizes the intersection of the language of this NFA
	 * and the language of another DFA using the nondeterministic method.
	 * @param m2 the machine with which to intersect this machine
	 * @return a new DFA object which recognizes the appropriate language */
	public NFA intersect(DFA m2){
		//TODO: Implement
		return this;
	}
	
	/*
	 * Creates an NFA which recognizes the Kleene star of the language recognized by this DFA
	 * @return a new NFA object which recognizes the Kleene star of the language recognized by this DFA.*/
	public NFA kleeneStar(){
		//TODO: Implement
		return new NFA();
	}
	
	/*
	 * Creates a DFA which recognizes the same language as this NFA. 
	 * @return a new DFA object which recognizes the same language as this NFA.*/
	public DFA DFAify(){
		//TODO: Implement
		return new DFA("", 
				       new HashSet<String>(), 
				       new HashSet <String>(), 
				       new HashMap <Tuple<String,String>,String>(), 
				       "", 
				       new HashSet<String>()
				      );
	}
	
	/*
	 * Creates the minimal DFA which recognizes the same language as this DFA. 
	 * @return a new DFA object which is the minimal DFA that recognizes the language that this DFA recognizes.*/
	public DFA minimize(){
		//TODO: Implement
		return new DFA("", 
			       new HashSet<String>(), 
			       new HashSet <String>(), 
			       new HashMap <Tuple<String,String>,String>(), 
			       "", 
			       new HashSet<String>()
			      );
	}

	/*
	 * Creates a new NFA which recognizes the complement of the language 
	 * recognized by this NFA.  
	 * @return a new DFA object which recognizes the complement of the language that this DFA recognizes */
	public NFA complement(){
		return this;
	}
	
	/************************************************************
	 * These methods are not required for project 1.            *
	 ************************************************************/
	/*
	 * Tells whether or not this machine recognizes the empty language.
	 * @return true if this machine recognizes the empty language, false otherwise.*/
	public boolean recognizesEmptyLanguage(){
		//TODO: Implement
		return true;
	}

	/*
	 * Tests whether the language recognized by this DFA is equal to the language recognized by some other DFA. 
	 * @param m2 the other DFA to test for equality with this machine
	 * @return true if this DFA recognizes the same language as m2, false otherwise.*/
	public boolean equals(DFA m2){
		//TODO: Implement
		return true;
	}
	
	/*
	 * Tests whether the language recognized by this DFA is equal to the language recognized by some other NFA. 
	 * @param m2 the NFA to test for equality with this machine
	 * @return true if this DFA recognizes the same language as m2, false otherwise.*/
	public boolean equals(NFA m2){
		//TODO: Implement
		return true;
	}
	
}
