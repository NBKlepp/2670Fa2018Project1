package RegularMachines;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.stream.Collectors;
/**
 * The MachineTester class tests NFA and DFA objects. 
 * @author Nick Klepp
 * @version 1.0.0
 * @since 8/13/18
 * 
 * */
//Note: The Java unicode escape character for the lower case epsilon symbol is '\u03B5'
public class MachineTester {
	
	public static void main(String[] args){
		
		///************************************************
		//* We'll make two DFAs:                         *
		//*                                              *
		//* M1=({1,2},{0,1},d,1,{1})                     *
		//* where d(1,0)=d(1,1)=d(2,0)=d(2,1)=1          *
		//* and                                          *
		//* M2=({1,2},{0,1},d,1,{1})                     *
		//* where d(1,0)=d(1,1)=d(2,0)=d(2,1)=2          *
		//************************************************/
		
		String[] accept = {"1"};
		
		DFA m1 = new DFA("m1",
						 "1",
						 accept,
						 new Triple<String,String,String>("1","0","1"),
						 new Triple<String,String,String>("1","1","1"),
						 new Triple<String,String,String>("2","0","1"),
						 new Triple<String,String,String>("2","0","1"));
		
		DFA m2 = new DFA("m1",
						 "2",
						 accept,
						 new Triple<String,String,String>("1","0","2"),
						 new Triple<String,String,String>("1","1","2"),
						 new Triple<String,String,String>("2","0","2"),
						 new Triple<String,String,String>("2","0","2"));
		
		NFA m3 = new NFA();
		NFA m4 = new NFA();
		
		/************************************************
		 * Testing the DFA methods                      *
		 ************************************************/
		
		DFA m1Um2 = m1.union(m2);
		DFA m1Um3 = m1.union(m3);
		DFA m1Im2 = m1.intersect(m2);
		DFA m1Im3 = m1.intersect(m3);
		DFA m1Cm2 = m1.concat(m2);
		DFA m1Cm3 = m1.concat(m3);
		DFA m1K   = m1.kleeneStar();
		DFA m1C	  = m1.complement();
		DFA m1M   = m1.minimize();
		NFA m1N   = m1.NFAify();
				
		/************************************************
		 * Testing the NFA methods                      *
		 ************************************************/
		
		NFA m3Um2 = m3.union(m2);
		NFA m3Um4 = m3.union(m4);
		NFA m3Im2 = m3.intersect(m2);
		NFA m3Im4 = m3.intersect(m4);
		NFA m3Cm2 = m3.concat(m2);
		NFA m3Cm4 = m3.concat(m4);
		NFA m3K	  = m3.kleeneStar();
		NFA m3C	  = m3.complement();
		NFA m3M   = m3.minimize();
		DFA m3D	  = m3.DFAify();
		
		System.out.println(String.format("m1 accepts 010: %s", m1.compute("010")));
		System.out.println(String.format("m2 accepts 010: %s", m2.compute("010")));
		System.out.println(String.format("m3 accepts 010: %s", m3.compute("010")));
		System.out.println(String.format("m4 accepts 010: %s", m4.compute("010")));
		
		System.out.println(String.format("m1Um2 accepts 010: %s", m1Um2.compute("010"))); 
		System.out.println(String.format("m1Um3 accepts 010: %s", m1Um3.compute("010"))); 
		System.out.println(String.format("m1Im2 accepts 010: %s", m1Im2.compute("010"))); 
		System.out.println(String.format("m1Im3 accepts 010: %s", m1Im3.compute("010"))); 
		System.out.println(String.format("m1Cm2 accepts 010: %s", m1Cm2.compute("010")));
		System.out.println(String.format("m1Cm3 accepts 010: %s", m1Cm3.compute("010")));
		System.out.println(String.format("m1K   accepts 010: %s", m1K.compute("010")));  
		System.out.println(String.format("m1C   accepts 010: %s", m1C.compute("010")));	
		System.out.println(String.format("m1M   accepts 010: %s", m1M.compute("010")));   
		System.out.println(String.format("m1N   accepts 010: %s", m1N.compute("010")));
		
		System.out.println(String.format("m3Um2 accepts 010: %s", m3Um2.compute("010"))); 
		System.out.println(String.format("m3Um4 accepts 010: %s", m3Um4.compute("010"))); 
		System.out.println(String.format("m3Im2 accepts 010: %s", m3Im2.compute("010"))); 
		System.out.println(String.format("m3Im4 accepts 010: %s", m3Im4.compute("010"))); 
		System.out.println(String.format("m3Cm2 accepts 010: %s", m3Cm2.compute("010")));
		System.out.println(String.format("m3Cm4 accepts 010: %s", m3Cm4.compute("010"))); 
		System.out.println(String.format("m3K accepts 010: %s", m3K.compute("010")));	  
		System.out.println(String.format("m3C accepts 010: %s", m3C.compute("010")));	 
		System.out.println(String.format("m3M accepts 010: %s", m3M.compute("010")));  
		System.out.println(String.format("m3D accepts 010: %s", m3D.compute("010")));	  
		
	}
}
