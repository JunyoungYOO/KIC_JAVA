package chap5;

import java.util.Scanner;

/*
 * �̵ �ﰢ�� �����
 * �ﰢ�� ���� �Է�
 * 3
 *    *  
 *   ***
 *  *****
 * *******
 * */
public class Test6 {

	public static void main(String[] args) {
		
		System.out.println("�ﰢ�� ���� �Է�");
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		
		int m = 2*h-1;
		int k = m/2;
		
		System.out.println("1.====���ؿ���");
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
			for(int j=1;j<h-j;j++) {	//3-3: ����° �� ���� 0
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {		// 2*1-1:ù��° �� * 2*2-1:�ι�° �� *** 2*3-1:����° �� *****
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
