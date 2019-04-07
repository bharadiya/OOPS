package Abstraction;

public class EvenOperation extends ArithematicOperations {

	@Override
	public int additon(int a, int b) {
		if (isEven(a) && isEven(b))
			return a + b;
		return -1;
	}
	@Override
	public int multiplication(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double division(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int substraction(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int convertToEven(int p) {
		// TODO Auto-generated method stub
		return p+1;
	}

	@Override
	public int convertToOdd(int p) {
		// TODO Auto-generated method stub
		return 0;
	}

}
