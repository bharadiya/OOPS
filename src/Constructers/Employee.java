package Constructers;

import java.util.Scanner;

public class Employee {
	String f="Shashank", m="Vijaykumar", l="Bharadiya";
	String p, c, a;
	float salary;
	Scanner sc = new Scanner(System.in);

	public void addEmployee() {
		System.out.println("Enter first name");
		f = sc.nextLine();
		System.out.println("Enter middle name");
		m = sc.nextLine();
		System.out.println("Enter last name");
		l = sc.nextLine();
	}

	public void getEmployeeDetails(String FullName) {
		String actual = f + " " + m + " " + l;
		if (actual.equals(FullName)) {
			System.out.println("Full Name " + actual);

		}
	}

	public Employee(String f,String m,String l)
	{
		this.f=f;
		this.m=m;
		this.l=l;
	}
	
	public static void main(String[] args) {
		Employee accnt = new Employee("s","v","b");
		System.out.println(accnt.f);
		
	}
}
