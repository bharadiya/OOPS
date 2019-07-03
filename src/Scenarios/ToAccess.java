package Scenarios;

public class ToAccess {
	public static void main(String arg[]) {
		access obj1 = new access();
		access obj2 = new access();
		obj1.x = 0;
		obj1.increament();
		obj2.increament();
		System.out.print(obj1.x + obj2.x);
		System.out.println();
	}
}
