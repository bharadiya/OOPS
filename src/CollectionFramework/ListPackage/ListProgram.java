package CollectionFramework.ListPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListProgram {
	public static void main(String[] args) {
		List A=new ArrayList();
		List B=new ArrayList();
		A.add("1");
		A.add("2");
		A.add("3");
		A.add("11");
		
		B.add("11");
		B.add("33");
		B.add("3");
		B.add("4");
		
		A.addAll(B);
		System.out.println(A);
		Collections.sort(A);
		System.out.println(A);
		for (int i = 0; i < A.size()-1; i++) {
			if(A.get(i).equals(A.get(i+1)))
			{
				A.remove(i+1);
				A.remove(i);
			}
		}
		System.out.println(A);

		
		
	}
}
