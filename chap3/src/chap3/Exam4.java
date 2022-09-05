package chap3;

import java.util.Scanner;

/*
 * 숫자를 입력 받아서
 * 	1. 양수인경우 "양수",
 * 	   음수인경우 "음수",
 * 	   0인 경우 "영" 출력하기
 * 	2. 짝수인지 홀수인지 출력하기
 * 
 * */
public class Exam4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num;
		
		
		System.out.println("숫자를 입력하세요");
		num = scan.nextInt();
		//1
		System.out.println(num + ":"
				+((num>0)?"양수":(num==0)?"영":"음수") + "이고, "
				+ (num%2==0?"짝수":"홀수"));
		
		
		//2			(num>0)?(num%2==1)?"홀수":(num==0)?"0":"짝수":(num==0)?"영":(-num%2==1)?"홀수":"짝수"
		//					(-num%2==1)?"홀수":"짝수"
		System.out.println(num + "은 "
		+ ((num>0)?(num%2==1)?"홀수":(num==0)?"0":"짝수":(num==0)?"영":(-num%2==1)?"홀수":"짝수"));

	}

}
