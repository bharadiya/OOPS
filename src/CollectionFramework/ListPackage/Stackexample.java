package CollectionFramework.ListPackage;

import java.util.Stack;

public class Stackexample {
	public static void main(String[] args) {
		Stack<Integer>A=new Stack<Integer>();
		//A.setSize(5);
		A.add(1);
		A.add(2);
		A.add(3);
		System.out.println(A.peek());
		System.out.println(A.size());
	}
}
