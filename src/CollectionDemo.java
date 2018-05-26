import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String obj = "vismay";
		String obj1 = "PATILP";
		String res = "";

		if (obj.length() > obj1.length()) {
			int j = 0;
			for (int i = 0; i < obj.length(); i++) {
				res += obj.charAt(i);
				while (j < obj1.length()) {
					res += obj1.charAt(i);
					j++;
					break;
				}
			}
		} else if (obj.length() < obj1.length()) {
			int j = 0;
			for (int i = 0; i < obj1.length(); i++) {
				while (j < obj.length()) {
					res += obj.charAt(j);
					j++;
					break;
				}
				res += obj1.charAt(i);
			}
		} else {
			for (int i = 0; i < obj.length(); i++) {
				System.out.print(obj.charAt(i));
				System.out.print(obj1.charAt(i));
			}
		}
		System.out.println(res);

		// Collection does not support index numbers.
		Collection values = new ArrayList();
		values.add(4);
		values.add(3);
		values.add(6);

		Iterator iterator = values.iterator();

		System.out.println("Using Collection interface");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		// With list interface we can add values at specific index. (Collection does not
		// allows it)
		//List of objects
		//<Generics>
		List<Integer> values1 = new ArrayList<>(); // List is Mutable
		values1.add(404); // Integer v = new Integer(4); Wraper class object
		values1.add(306);
		values1.add(608);
		values1.add(202);
		
		System.out.println("Using list interface");
		for(int i=0; i<values1.size(); i++) {
			System.out.println(values1.get(i));
		}
		
		System.out.println("List interface using enhanced for loop");

		for(Object o : values1) {
			System.out.println(o);
		}
		
		System.out.println("List interface using enhanced for loop - sorting elements");
		
		Collections.sort(values1);
//		Collections.reverse(values1);
//		Collections.shuffle(values1);
		for(Object o : values1) {
			System.out.println(o);
		}

	}
}
