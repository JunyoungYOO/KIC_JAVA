package chap5;

import java.util.Scanner;

/*
 * ���� �Է�
 * 5
 * ���
 * 
 * *****
 *  ***
 *   *
 *  ***  
 * *****
 * 
 * 
 * */
public class Test7 {

	public static void main(String[] args) {
		
		System.out.println("�ﰢ�� ���� �Է�");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt(); 
		
		for (int i=0;i<=len/2;i++) {
			for(int j=0;j<len-i;j++) {
				if(j<i) 
					System.out.print(" ");				
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i=len/2+1;i<len;i++) {
			for(int j=0;j<=i;j++) {
				if(j>=len-i-1 && j<=i) 
					System.out.print("*");				
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
		
	}

}
