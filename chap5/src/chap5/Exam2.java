package chap5;

import java.util.Scanner;

//8������ȯ

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
		
		System.out.println("10������ �Է��ϼ���.");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num, index=0;
		
		while(divnum !=0) {
			binary[index++] = divnum%8;
			divnum/=8;
		}		
		
		
		System.out.println(num +"�� 8����: ");
		for (int i=index-1;i>=0;i--) {
			System.out.print(binary[i]);
		}
		System.out.println();
		
	}

}
