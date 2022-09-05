package chap5;

import java.util.Scanner;

public class ArrEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nums = "0123456789ABCDEF";
		char[] numarr = nums.toCharArray();
		char[] hexa = new char[10];
		
		System.out.println("10진수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num, index=0;
		
		while(divnum !=0) {
			hexa[index++] = numarr[divnum%16];
			divnum/=16;
			 
		}	
				
		System.out.println(num +"의 16진수: ");
		for (int i=index-1;i>=0;i--) {
			System.out.print(hexa[i]);
		}
		System.out.println();
	}

}

/*
 * 1. java소슼 ㅗ딩
 * 2. class 바이트 생성., => javac
 * 3. 실행 -> java인터프리터
 * - jvm환경생성
 * - 바이트 코드 로딩 검증
 * - main 메서드 시작
 * - main 메서드 종료되면 프로그래 ㅁ종료
 * - jvm 환경 삭제
 * 
 * jvm 메모리 구조
 * 클래스 영역
 * 	바이트코드 로딩 영역
 *  API 로딩
 * 스택 영역 
 * */
 