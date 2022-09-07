package sba.ust;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
	
	public static void main(String args[]) {
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(101);
		numbers.add(102);
		numbers.add(103);
		numbers.add(104);
		numbers.add(105);
		numbers.add(106);
		numbers.add(107);
		numbers.add(108);
		numbers.add(109);
		numbers.add(110);
		numbers.add(111);
		numbers.add(112);
		numbers.add(113);
		numbers.add(114);
		numbers.add(115);
		numbers.add(116);
		numbers.add(117);
		numbers.add(118);
		numbers.add(119);
		numbers.add(120);
		ArrayList<String> name=new ArrayList<>();
		name.add("Anu");
		name.add("Binu");
		name.add("Cinu");
		name.add("Duke");
		name.add("Elsa");
		name.add("Fara");
		name.add("Glory");
		name.add("Honey");
		name.add("Indu");
		name.add("Jeeva");
		name.add("King");
		name.add("Lisna");
		name.add("Meeena");
		name.add("Nahla");
		name.add("Omna");
		name.add("Pinky");
		name.add("Queen");
		name.add("Rita");
		name.add("Sneha");
		name.add("Tom");
		Iterator<Integer> iterator=numbers.iterator();
		Iterator<String> itr=name.iterator();
		int i;
	
				while(iterator.hasNext()) {
					for(i=1;i<=20;i++) {
						System.out.print("Employee "+i+": ");
						System.out.print(iterator.next()+" "+itr.next());
						System.out.println("\n");
						}
			
		}
		
		
	}	
}
