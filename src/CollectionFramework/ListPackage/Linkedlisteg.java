package CollectionFramework.ListPackage;

import java.util.LinkedList;

public class Linkedlisteg {
	public static void main(String[] args) {
		LinkedList A=new LinkedList();
		A.add(0, 1);
		A.add(1, "hi");
		A.add(2,1);
		A.add(1);
		A.add(2);
		A.add(1, 5);
		System.out.println(A.get(0));
		System.out.println(A);
	}
}
