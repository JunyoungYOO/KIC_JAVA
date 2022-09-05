package chap5;

import java.util.Scanner;

//8진수변환

/*
 * binary :1010
 * octal : 12
 * hexa : A
 * 
 * */
public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] binary = new int[32];
		
		System.out.println("10진수를 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num, index=0;
		
		while(divnum !=0) {
			binary[index++] = divnum%8;
			divnum/=8;
		}		
		
		
		System.out.println(num +"의 8진수: ");
		for (int i=index-1;i>=0;i--) {
			System.out.print(binary[i]);
		}
		System.out.println();
		
	}

}
