package enumeration.ust;

import java.util.*;

public class Enum_Example {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(14);
		list.add(2);
		list.add(73);
		
		Enumeration en = Collections.enumeration(list);
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}
}