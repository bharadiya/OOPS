package UsingCursors;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

// vector can be used with all types of cursors like Iterator , ListIterator, and Enumeration.

public class Enumerator {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		for (int i = 0; i < 10; i++) {
			v.addElement(i);
		}
//		Enumeration<Integer> e = v.elements();
//		while (e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//		}
		ListIterator<Integer> e = v.listIterator();
		while (e.hasNext()) {
			System.out.println(e.next());
		}
	}
}
