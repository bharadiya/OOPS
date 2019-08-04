package CollectionFramework.MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearningMap {
	public static void main(String[] args) {
		// To achieve key,value pairing we need a map
		// Map is a interface
		// Unique key and multiple values possible
		Map<String, String> one = new HashMap<>();
		one.put("Name", "Name");
		one.put("Names", "Pankaj");
		one.put("Middle Name", "VijayKumar");
		one.put("Last Name", "Bharadiya");
		one.put("Hobbies", "Reading");
		one.put("Fav sport", "Badminton");
		//System.out.println(one);
//		for (Entry m:one.entrySet()) {
//			if(m.getKey().equals(m.getValue())) {
//				System.out.println(m.getKey() +" "+m.getValue());
//			}
//				
//		}
//		System.out.println(one);
//		System.out.println();
		// System.out.println(one.get("Name"));
		Set<String> aSET = one.keySet();
//		System.out.println(aSET);
//		System.out.println();
//		for (String key : aSET) {
//			System.out.println(key+" "+one.get(key));
//		}
		Iterator ir = aSET.iterator();
		while (ir.hasNext()) {
			for (String key : aSET) {
				if (one.get(key).equals(ir.next()))
					System.out.println(key + " " + one.get(key));
			}
		}

	}
}
