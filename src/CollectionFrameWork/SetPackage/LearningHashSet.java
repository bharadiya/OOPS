package CollectionFrameWork.SetPackage;

import java.util.HashSet;
import java.util.Set;

public class LearningHashSet {
	public static void main(String[] args) {
		Set<Integer> values = new HashSet<>();
		// eg 1
		System.out.println(values.add(1));// This is a boolean "Hashset.add"
		values.add(1);
		values.add(1);
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(3);
		values.add(4);
		// Duplicates are removed
		System.out.println(values);
		// eg:2
		Set<Integer> values2 = new HashSet<>();
		values2.add(87);
		values2.add(97);
		values2.add(34);
		values2.add(92);
		System.out.println(values2);
		// See how sequence is not getting maintained
	}
}
