package Scenarios;

public class Tieto {
	public static void main(String[] args) {
		int i = 0;
		boolean t = true;
		boolean f = false, b;
		b = (t || ((i++) == 0));
		b = (f || ((i += 7) == 0));
		System.out.println(i);
//		System.out.println(b);
//		System.out.println(t);
//		System.out.println(f);
	}
}
