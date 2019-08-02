
public class ConstructorDemo {
	String s;
	ConstructorDemo(String s){
		this.s=s;
	}
//	public String toString() {
//		return s;
//	}
	public static void main(String[] args) {
		ConstructorDemo d=new ConstructorDemo("hi");
		System.out.println(d.toString());
	}
}
