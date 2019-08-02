package Scenarios;

public class IncrementOp {
	public static void main(String[] args) {
		int i = 0, a;
		a = i++;  // i=1 , a=0
		a = ++i + i++ + ++i + i++; 
		System.out.println(i + " " + a);
	}
}
