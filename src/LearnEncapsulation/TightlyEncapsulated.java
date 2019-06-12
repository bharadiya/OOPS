package LearnEncapsulation;

public class TightlyEncapsulated {

	private int a = 2;
	private int b = 4;

	private int doAddition() {
		return a + b;
	}

	public static void main(String[] args) {
		TightlyEncapsulated t=new TightlyEncapsulated();
		t.a=5;
		t.b=8;
		System.out.println(t.doAddition());
	}
}
