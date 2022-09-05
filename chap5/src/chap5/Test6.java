package chap5;

import java.util.Scanner;

/*
 * 이등변 삼각혐 만들기
 * 삼각형 높이 입력
 * 3
 *    *  
 *   ***
 *  *****
 * *******
 * */
public class Test6 {

	public static void main(String[] args) {
		
		System.out.println("삼각형 높이 입력");
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		
		int m = 2*h-1;
		int k = m/2;
		
		System.out.println("1.====유준영식");
		for (int i=1;i<=h;i++) {
			for(int j=0;j<m;j++) {
				
				if(j>k-i && j<k+i) {
					System.out.print("*");
					continue;
				}				
				System.out.print(" ");
			}
			System.out.println();
			
		}
		
		
		
		
		System.out.println("2.=====");
		
		for(int i=1;i<=h;i++) {
			for(int j=1;j<h-j;j++) {	//3-3: 세번째 줄 공백 0
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {		// 2*1-1:첫번째 줄 * 2*2-1:두번째 줄 *** 2*3-1:세번째 줄 *****
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
