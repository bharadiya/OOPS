package LearnEncapsulation;

public class DemoTest {
	public static void main(String[] args) {
		LearnEncapsulation a = new LearnEncapsulation();
		a.setGeekName("Titu");
		a.setGeekAge(25);
		a.setGeekRoll(23);

		System.out.println(a.getGeekName());
		System.out.println(a.getGeekAge());
		System.out.println(a.getGeekRoll());
	}
}
