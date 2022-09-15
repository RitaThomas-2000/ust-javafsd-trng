package enumeration.ust;

import java.util.*;

public class Demo {
	public static void main(String args[]) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("P");
		hs.add("Q");
		hs.add("R");
		
		Enumeration e=Collections.enumeration(hs);
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
	}
}
