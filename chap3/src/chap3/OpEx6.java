package chap3;

import java.util.Scanner;

/*
 * 조건연산자 (삼항연산자) => 조건문으로 변경 가능
 * 
 * (조건문)
 * 
 * 조건문 : 결과가 boolean(true|false)
 * 
 * 
 * */


public class OpEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("정수를 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		int score =scan.nextInt();
		System.out.println(score + "정은" + ((score>=60)?"합격":"불합격")+"입니다.");
		
		String result = (score>=60)?"합격":"불합격";
		System.out.println(score + "점은 " +result + "입니다.");
		
		//70점이상 합격입니다 60점이상 재시험대상입니다
		//60미만 탈락입니다.
		
		System.out.println((score>=70)?"합격입니다.":(score>=60)?"재시험대상입니다.":"불합격입니다.");
	}

}
