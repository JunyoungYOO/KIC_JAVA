package chap3;

import java.util.Scanner;

/*
 * 초를 입력 받아 몇시간 몇분 몇초인지 출력하기
 * 1. Scanner 생성
 * 2. second = scan.nextInt(); 
 * 3. h = second/3600
 * 
 * */


public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("숫자를 입력하세요:");
		Scanner scan = new Scanner(System.in);
		int second;
		int h, m, s;		
		
		second = scan.nextInt();
		h= second/3600;
		m = (second%3600)/60;
		s = second%60;
		System.out.println(h+"시간"+m+"분"+s+"초");
				
				
	}

}
