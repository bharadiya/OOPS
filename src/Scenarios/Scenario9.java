package Scenarios;

import java.io.File;

public class Scenario9 {
	public static void main(String[] args) {
		try {
			int a=args.length;
			//int b=10/a;
			System.out.println(a);
			System.exit(0);
			try {
				if(a==1) {
					a=a/a-a;
				}
//				if(a==2) {
//					int c= {1};
//					c[8]=9;
//				}
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Type A");
			}
		}
		catch(ArithmeticException e) {
			System.out.println("Type B");
		}
	}
}
