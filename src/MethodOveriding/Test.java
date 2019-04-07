package MethodOveriding;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle a=new Rectangle();
		Figures b=new Figures();
		System.out.println(a.calculation(2));
		System.out.println(a.calculation(25, 15));
		System.out.println(a.calculation(2, 3, 6));
		System.out.println(b.calculation(5, 3, 2));
		
		

	}

}
