package Scenarios;

import java.io.IOException;

public class Tieto3 {
	public static void main(String[] args) {
		try {
			throw new IOException("hello");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
