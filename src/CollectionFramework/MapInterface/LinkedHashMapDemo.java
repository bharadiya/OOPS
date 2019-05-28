package CollectionFramework.MapInterface;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/***
 * Backend data structure is doublyLinkedList and Hash table preserves insertion
 * order duplicate keys are not allowed duplicate values are allowed null key
 * and values are allowed Expandable
 * 
 * @author sb
 *
 */
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap m = new LinkedHashMap();
		m.put("test", "MH");
		m.put(4.56, "C");
		m.put(5, "MH");
		m.put(6, "MH");
		m.put(true, false);
		Set<Map.Entry> Keys=m.entrySet();
		for (Map.Entry entry : Keys) {
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
	}

}
