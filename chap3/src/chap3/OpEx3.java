package chap3;
/*
 * 산술연산자 : +, -, *, /, %(나머지)
 * 
 * */

public class OpEx3 {

	public static void main(String[] args) {
		int x=10, y=8;
		System.out.println("10+8=" + (x+y));
		System.out.println("10-8=" + (x-y));
		System.out.println("10*8=" + (x*y));
		System.out.println("10/8=" + (x/y));	//1
		System.out.println("10%8=" + (x%y));	//2

		
		System.out.println(10/8);	//1
		System.out.println(-10/8);	//-1
		System.out.println(10/-8);	//-1
		System.out.println(-10/-8);	//1
		
		System.out.println(10%8);	//2
		System.out.println(-10%8);	//-2
		System.out.println(10%-8);	//2
		System.out.println(-10%-8);	//-2
	}

}
