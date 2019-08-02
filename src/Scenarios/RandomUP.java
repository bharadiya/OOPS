package Scenarios;

public class RandomUP {
	public static void main(String[] args) {
		String randomData = "asdfghjkl;'qwertyuiop[]zxcvbnm,./asdfghjkl;'qwertyuiop[]zxcvbnm,./asdfghjkl;'qwertyuiop[]zxcvbnm,./asdfghjkl;'qwertyuiop[]zxcvbnm,./";
		String uname = "";
		String passw = "";
		//System.out.println(randomData.length());
		for (int i = 0; i < 11; i++) {
			uname += randomData.charAt((int) (Math.random() * 100));
		}
		for (int i = 0; i < 11; i++) {
			passw += randomData.charAt((int) (Math.random() * 100));
		}
		System.out.println(uname);
		System.out.println(passw);
	}
}
