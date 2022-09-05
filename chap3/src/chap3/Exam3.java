package chap3;

import java.util.Scanner;

/*
 * 화면에서 3자리 정수를 입력 받아 100자리 미만 버리고 출력하기
 * 
 * 1. Scanner 객체 생성
 * 2. num = scan.nextInt();
 * 3. 100으로 나누고, 100곱하기
 * 
 * 
 * 
 * */


public class Exam3 {

	public static void main(String[] args) {
		
		int num;
		int num1, num2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("세자리 정수를 입력하세요");			
		num = scan.nextInt();
		
		num1 = num/100;
		
				
		System.out.println(num1*100);
		System.out.println("세자리 정수를 입력하세요");
		num = scan.nextInt();
		num1 = num/100;
		
		System.out.println(num1*100);


	}

}
