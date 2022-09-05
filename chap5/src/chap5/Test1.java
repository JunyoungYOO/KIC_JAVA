package chap5;
/*
 * 강아지와 병아리 개체수의 합과 다리수의 합을 입력받아
 * 강아지, 병아리의 각각의 개체수를 출력하는 프로그램 작성하기
 * 
 *[결과]
 *강아지와 병아리 합
 *10
 *강아지와 병아디 다리의 합
 *30
 * 강아지 5마리, 병아리 5마리
 * */

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("강아지와 병아리 합");
		int sum = scan.nextInt();
		System.out.println("강아지와 병아리 다리의 합");
		int sum_leg=scan.nextInt();
		int d=0, c=0;
		boolean isTrue=false;
		
		for (int i=0;i<=sum;i++) {
			for (int j=0;j<=sum;j++) {
				if (sum==i+j && sum_leg==(4*i)+(2*j)) {
					d=i;
					c=j;
					isTrue=true;
				}
			}
		}
		
		if(isTrue) System.out.println("강아지 "+ d +"마리, 병아리 " +c+ "마리" );
		// if(isTrue) : isTrue==true 같은 의미
		// if(!isTrue) : isTrue==false 같은의미
		else System.out.println("잘못 입력했습니다.");
	}

}
