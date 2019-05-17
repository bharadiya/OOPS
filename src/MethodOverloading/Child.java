package MethodOverloading;

public class Child extends Parent{
	public  int doMultiplication(int a,int b) {
		System.out.println(super.doMultiplication(8, 2));
		System.out.println("C");
		return a/b;
	}
}
