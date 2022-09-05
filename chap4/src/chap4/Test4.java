package chap4;

import java.util.Scanner;

/*
 * 
 * 대칭수 구하기
 * */

public class Test4 {

	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int tmp = num;
		int result = 0;
		
		while(tmp!=0) {
			result *=10;
			result += tmp % 10;
			tmp /= 10;
		}
		
		if (num==result) {
			System.out.println(num + ": 대칭수");
		} else {
			System.out.println(num + ": 대칭수 아님");
		}
		

	}

}
