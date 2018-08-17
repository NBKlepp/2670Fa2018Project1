package RegularMachines;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.stream.Collectors;

public class MachineTester {

	/*
	 * Static function to make a set of states from a variable number of string inputs
	 * @param varArgs*/
	public static HashSet<String> mkStateSet(String...states){
		 return new HashSet<String>(Arrays.asList(states));
	}
	/*
	 * Static function to make an alphabet from a variable number of string inputs
	 * @param varArgs*/
	public static HashSet<String> mkAlphabet(String...chars){
		return new HashSet<String>(Arrays.asList(chars));
	}
	
	public static Tuple<Tuple<String,String>,String> mkRelation(String[] strings){
		Tuple<String,String> t_int = new Tuple<>(strings[0],strings[1]);
		return new Tuple<>(t_int,strings[2]);
	}
	
	public static void makeDelta(HashMap<Tuple<String,String>,String> m, String[][] stringArrs){
		Arrays.asList(stringArrs).stream().map(x->mkRelation(x)).forEach(x->m.put(x.t(),x.u()));
	}
	
	public static void main(String[] args){
		
		/************************************************
		 * We'll make a DFA, M=({1,2},{0,1},d,1,{1})    *
		 * where d(1,0)=d(1,1)=d(2,0)=d(2,1)=1          *
		 ************************************************/
		//Making sets of states concisely
		HashSet<String> states1 = new HashSet<String>(new ArrayList<String>(){{add("1");add("2");}});
		
		//Making an alphabet a little less concisely
		String[] alph1_1 = {"0","1"};
		HashSet<String> alph1   = new HashSet<String>(Arrays.asList(alph1_1));
		
		//Making transition functions
		HashMap<Tuple<String,String>,String> d1 = new HashMap<Tuple<String,String>,String>();
		HashMap<Tuple<String,String>,String> d2 = new HashMap<Tuple<String,String>,String>();
		
		String[][] transitions1 = {{"1","0","1"},
								   {"1","1","1"},
								   {"2","0","1"},
								   {"2","1","1"}};
		String[][] transitions2 = {{"1","0","2"},
								   {"1","1","2"},
								   {"2","0","2"},
								   {"2","1","2"}};
		
		makeDelta(d1, transitions1);
		d1.forEach((K,V)->System.out.println(String.format("(%s,%s) -> %s", K.t(),K.u(),V)));
		makeDelta(d2, transitions2);
		d2.forEach((K,V)->System.out.println(String.format("(%s,%s) -> %s", K.t(),K.u(),V)));
		String[] fin1_1 = {"1"};
		HashSet<String> fin1 = new HashSet<String>(Arrays.asList());
				
		DFA m1 = new DFA("m1",states1,alph1,d1,"1",fin1);
		DFA m2 = new DFA("m2",states1,alph1,d2,"1",fin1);
		
		NFA m3 = new NFA();
		
		
		System.out.println(String.format("m1 accepts 010: %s", m1.compute("010")));
		
	}
}
