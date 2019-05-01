
public class SecondChild extends Parent {
	public void m2() {
		System.out.println("Hi I am second Child");
	}

	public static void main(String[] args) {
		Parent P = new SecondChild();
		SecondChild Q = (SecondChild) new Parent();
		P.m1();
		P.m1(5); // Only parent methods visible as it is the reference made
		Q.m1();
		Q.m1(5);
		Q.m2(); // Both child and parent methods are visible as referece is made by child and
				// then type casted but still private methods of any class cant be accesed.
	}
}
