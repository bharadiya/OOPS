package CollectionFrameWork.SetPackage;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearningLinkedHashSet {
	public static void main(String[] args) {
		Set set=new LinkedHashSet();
		set.add(1);
		set.add(1);
		set.add(1);
		set.add(1);
		set.add(5);
		set.add(-1);
		set.add(-13);
		set.add(15);
		
		System.out.println(set);
	}
}
