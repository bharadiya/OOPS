package Constructers;

public class Child extends Parent{
	public Child() {
		//super();
		System.out.println("Child");
	}
	public static void main(String[] args) {
		Child c=new Child();
	}
}
