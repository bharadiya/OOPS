package UsingCursors;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

public class UsingIterator {
	public static <E> void main(String[] args) {
		List<Integer> digits = new ArrayList<Integer>();
		for (int j = 0; j < 9; j++) {
			digits.add(j);
		}
		Hashtable tb = new Hashtable();
		for (int i = 0; i < 9; i++) {
			tb.put(i, i);
		}
		
		Enumeration e=tb.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
//		Iterator<Integer>i=digits.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
//		ListIterator<Integer>j=digits.listIterator();
//		while(j.hasNext())
//		{
//			System.out.println(j.next());
//		}
		Set<Integer> k = new HashSet<Integer>(digits);
//		Iterator<Integer> p=k.iterator();
//		while(p.hasNext())
//		{
//			System.out.println(p.next());
//		}
//		ListIterator<Integer>j=k.listIterator();
//		while(j.hasNext())
//		{
//			System.out.println(j.next());
//		}
//		
//		Enumeration<Integer>p=k.elements();
//		while(j.hasNext())
//		{
//			System.out.println(j.next());
//		}

	}
}