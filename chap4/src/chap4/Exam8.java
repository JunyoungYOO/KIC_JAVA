package chap4;

import java.util.Scanner;

/*
 * �ﰢ���� ���̸� �Է¹޾Ƽ� *�� �ﰢ�� ����ϱ�
 * [���]
 * �ﰢ���� ����
 * 5
 * *
 * **
 * ***
 * ****
 * *****
 * 
 *
 * 2:
 * *****
 * ****
 * ***
 * **
 * *
 * 
 * */


public class Exam8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�ﰢ���� ���� �Է�");
		int h = scan.nextInt();
		
		System.out.println("1. ");
		for(int i=0;i<h;i++) {
			
			for (int j=0;j<h;j++) {
				
				if(j>i) {
					System.out.print(" "); continue;
				}
				System.out.print("*");
			}
			System.out.println();			
		}
		
		System.out.println("\n2. ");
		
		for(int i=0;i<h;i++) {
			
			for (int j=h-1;j>=0;j--) {
				
				if(j<i) {
					System.out.print(" "); continue;
				}
				System.out.print("*");
			}
			System.out.println();			
		}
		
		System.out.println("\n3. ");
		
		for(int i=0;i<h;i++) {
			
			for (int j=h-1;j>=0;j--) {
				
				if(j>i) {
					System.out.print(" "); continue;
				}
				System.out.print("*");
			}
			System.out.println();			
		}
		
	}

}
