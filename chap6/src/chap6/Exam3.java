package chap6;

import java.util.Scanner;

/*
 * 
 * Circ1e1 클래스 구현하기
 * 1. 면적함수 : area(반지름)
 * 2. 둘레함수 : length(반지름)
 * 
 * 
 */
class Circle1{
	
	double area(int r) {
		
		return Math.PI*r*r;
	}
	
	double length(int r) {
		return Math.PI*r*2;
	}
	void area1(int r) {
		System.out.println("면적은 " + Math.PI*r*r);
	}
	void length1(int r) {
		System.out.println("둘레는 " + Math.PI*r*2);
	}
}


public class Exam3 {

	public static void main(String[] args) {
		// ctrl+shift+F : 소스 정렬
		// 여러줄 주석처리 :  ctrl+/		=> //로 처리. 토글키임
		int a=0;	// line 이동		alt+방향키
		
		Circle1 c1 = new Circle1();
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("반지름 입력");
		int r = scan.nextInt();
		
		double ans1=c1.area(r);
		System.out.println("면적은 " + ans1);
		double ans2=c1.length(r);
		System.out.println("둘레는 " + ans2);
		
		c1.area1(r);
		c1.length1(r);
		
		
	}

}
