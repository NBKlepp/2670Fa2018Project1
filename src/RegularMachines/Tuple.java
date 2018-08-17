package RegularMachines;

/*
 * The Tuple class represents a mathematical tuple (2-tuple). 
 * @author Nick Klepp
 * @version 1.0.0
 * @since 8/13/18
 * 
 * Note: The Java unicode escape character for the lower case epsilon symbol is '\u03B5'
 * */

public class Tuple <T,U>{
	
	private T t;
	private U u;
	
	public Tuple(T t, U u){
		this.t = t;
		this.u = u;
	}
	
	public T t(){
		return t;
	}
	
	public U u(){
		return u;
	}
}
