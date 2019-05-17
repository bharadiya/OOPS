package MethodOverloading;

public class Test {
	public static void main(String[] args) {
		Child p=new GrandChild();
		System.out.println(p.doMultiplication(8, 2));
	}
}
