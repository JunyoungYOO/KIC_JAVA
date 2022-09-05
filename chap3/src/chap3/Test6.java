package chap3;

import java.util.Scanner;

//  반지름을 입력받아 원의 둘레와 면적을 구하시오
public class Test6 {
	public static void main(String[] args) {
		double pi = 3.141592;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("반지름");
		int r = scan.nextInt();
		
		System.out.println("원의 둘레 : " + (double)(2*pi*r) + "원의 면적 : " + (double)(pi*r*r));
	}
}