package MethodOverloading;

public class GrandChild extends Child {

	public  int doMultiplication(int a,int b) {
		System.out.println(super.doMultiplication(8, 2));
		System.out.println("GC");
		return a+b;
	}

}
