package CollectionFramework.MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
/**
 * In backend , it do autoboxing for int 1 key, it converts it into new Integer(1);
 * HashMap increases by a load factor of 75% 
 * And If we want to decrease this load factor we have to use constructor with customized load factor
 * doesnot preserve insertion order.
 * @author sb
 */
public class HashMapDemo {
	public static void main(String[] args) {
		HashMap m=new HashMap();
		m.put(1,"MH"); 
		m.put(2,"GJ");
		m.put(3,"RJ");
		m.put(null,"HYD");
		m.put(5,"MH");
		//System.out.println(m);
		//System.out.println(m.get(1));
		Set Keys=m.keySet();
		Iterator itr=Keys.iterator();
		while(itr.hasNext())
		{
			System.out.println(m.get(itr.next()));
		}
	}
}
/**
 * How to iterate map
 * 1.entrySet(); 
 * 		a.return type is Set
 * 
 * 2.keySet();
 * 		a.return type is Set
 */

