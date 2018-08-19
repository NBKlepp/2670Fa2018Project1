package RegularMachines;

/**
 * The Tuple class represents a mathematical tuple (2-tuple). 
 * @author Nick Klepp
 * @version 1.0.0
 * @since 8/13/18
 * 
 * */
// * Note: The Java unicode escape character for the lower case epsilon symbol is '\u03B5'

public class Tuple <T,U>{
	
	private T t;
	private U u;
	
	/**
	 * The constructor for the tuple is generic. 
	 * There is no restriction on what data types are allowed in the triple. 
	 * The data types, specifically, may be mixed.
	 * @param t the first member of the Tuple
	 * @param u the second member of the Tuple*/
	public Tuple(T t, U u){
		this.t = t;
		this.u = u;
	}
	
	/**
	 * Accessor method for the first member of the tuple. 
	 * @return The first member of the tuple*/
	public T t(){
		return t;
	}
	
	/**
	 * Accessor method for the second member of the tuple. 
	 * @return The second member of the tuple*/
	public U u(){
		return u;
	}
}
