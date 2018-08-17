package RegularMachines;

/*
 * The Triple class represents a mathematical triple (3-tuple). 
 * @author Nick Klepp
 * @version 1.0.0
 * @since 8/13/18
 * 
 * Note: The Java unicode escape character for the lower case epsilon symbol is '\u03B5'
 * */

public class Triple<T,U,V> {
	
	private T t;
	private U u;
	private V v;
	
	public Triple(T t, U u, V v){
		this.t  = t;
		this.u = u;
		this.v  = v;
	}
	
	public T t(){
		return t;
	}
	
	public U u(){
		return u;
	}
	
	public V v(){
		return v;
	}

}
