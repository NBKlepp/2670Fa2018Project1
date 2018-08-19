package RegularMachines;

/**
 * The Triple class represents a mathematical triple (3-tuple). 
 * @author Nick Klepp
 * @version 1.0.0
 * @since 8/13/18
 * 
 * */
// * Note: The Java unicode escape character for the lower case epsilon symbol is '\u03B5'

public class Triple<T,U,V> {
	
	private T t;
	private U u;
	private V v;
	
	/**
	 * The constructor for the triple is generic. 
	 * There is no restriction on what data types are allowed in the triple. 
	 * The data types, specifically, may be mixed.
	 * @param t the first member of the Triple
	 * @param u the second member of the Triple 
	 * @param v the third member of the Triple*/
	public Triple(T t, U u, V v){
		this.t  = t;
		this.u = u;
		this.v  = v;
	}
	
	/**
	 * Accessor method for the first member of the triple. 
	 * @return The first member of the triple*/
	public T t(){
		return t;
	}
	
	/**
	 * Accessor method for the second member of the triple. 
	 * @return The second member of the triple*/
	public U u(){
		return u;
	}
	
	/**
	 * Accessor method for the third member of the triple. 
	 * @return The third member of the triple*/
	public V v(){
		return v;
	}

}
