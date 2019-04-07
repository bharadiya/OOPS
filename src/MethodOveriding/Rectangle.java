package MethodOveriding;

public class Rectangle extends Figures {
	@Override
	public double calculation(int l, int b, int h) {
		// TODO Auto-generated method stub
		System.out.println("Volume of Cuboid is");
		return l * l * l;
	}
	public double calculation(int l, int b) {
		// TODO Auto-generated method stub
		System.out.println("Perimeter of Rectangle is");
		return 2*(l + b);
	}
	public double calculation(int l) {
		// TODO Auto-generated method stub
		System.out.println("Area of Square is");
		return Math.pow(l, 2);
	}
}
