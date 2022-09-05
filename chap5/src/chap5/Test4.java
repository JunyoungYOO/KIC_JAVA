package chap5;

import java.util.Scanner;

/*
 * 1~100 사이의 임의의 값 출력
 * 저장된 숫자를 맞추는 프로그램

 * 
 * 1~100사이값 이력 : 50
 * 더작은수
 * 1~100사이값 이력 : 30
 * 더큰수
 * .
 * .
 * .
 * 맞췄습니다.
 * 
 * 시도 횟수는 7입니다.
 * */
public class Test4 {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*100)+1;
		int count=0;
		int ans;
		boolean isTrue=false;
		
		Scanner scan = new Scanner(System.in);
		
		while(!isTrue) {
			count++;
			System.out.println("1~100사이값 입력");
			ans = scan.nextInt();
			
			if(ans==num) {
				System.out.println("맞췄습니다.");
				isTrue=true;
				break;
			} else if(ans>num) System.out.println("더 작은수");
			else System.out.println("더 큰수");
			
			
		}
		
		System.out.println("시도 횟수는 "+count+"입니다.");
	}

}
