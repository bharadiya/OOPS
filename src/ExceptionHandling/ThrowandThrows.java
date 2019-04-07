package ExceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowandThrows {
	public static void main(String[] args)   {
		System.out.println("Main method");
			first();
	}
	private static void first()  {
		// TODO Auto-generated method stub
		System.out.println("First Method");
		try {
		second();
		}
		catch(FileNotFoundException f) {
			System.err.println("Sorry File not found . Make sure the file is present");
	 }
	}
	private static void second() throws FileNotFoundException  {
		// TODO Auto-generated method stub
		System.out.println("Second Method");
		third();
	}
	private static void third() throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Third Method");
		File f=new File("//home//shashank//Desktop//Rege.txt");
		try {
		BufferedReader buffer=new BufferedReader(new FileReader(f));
		throw new FileNotFoundException("File not found");
		}
		catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}
	}
}
