package Abstraction;

public abstract class ArithematicOperations implements CommonOperations {
		public abstract int additon(int a,int b) ;
		public abstract int multiplication(int a,int b) ;
		public abstract double division(int a,int b) ;
		public abstract int substraction(int a,int b) ;
		 
		public boolean isOdd(int p) {
			return p%2!=0;
		}
		public boolean isEven(int p) {
			return p%2==0;
		}
		public ArithematicOperations() {
			System.out.println("Hi");
		}
}
