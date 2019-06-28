package Abstraction;

public class Test {

	public static void main(String[] args) {
		EvenOperation even = new EvenOperation();
		OddOperation odd = new OddOperation();
		System.out.println(even.additon(12, 24));
		
	}
}
