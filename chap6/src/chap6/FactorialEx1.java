package chap6;

public class FactorialEx1 {

	public static void main(String[] args) {
		System.out.println("4! = " + factorial(4));
	}
	
	private static int factorial(int i) {
		return (i==1)?1:i*factorial(i-1);
	}

}
