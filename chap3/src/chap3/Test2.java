package chap3;

import java.util.Scanner;

/*
 * 10���� 99������ ���ڸ� �ڿ����� �Է¹޾� �Էµ� �� ���� ũ�ų� 
 * ���� 10�� ����� ���ϱ�
 * 10�� ������� �Էµ� ���� ������ ����ϱ�
 * [���]
 * 10���� 99������ ���ڸ� �ڿ����� �Է��ϼ���
 * 24
 *  6  :  30 - 24
 *  
 * 10���� 99������ ���ڸ� �ڿ����� �Է��ϼ���
 * 20
 * 0   :  20 - 20
 */

public class Test2 {
	
	public static void main(String[] args) {
		
		int N, M;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("10���� 99������ ���ڸ� �ڿ����� �Է��ϼ���");
		N=scan.nextInt();
		M=(N%10==0)?N:(N/10*10)+10;
		System.out.println((M-N) + " : " + M + " - " + N);
		System.out.println("10���� 99������ ���ڸ� �ڿ����� �Է��ϼ���");
		N=scan.nextInt();
		M=(N%10==0)?N:(N/10*10)+10;
		System.out.println(N + " : " + M + " - " + N);
		
	}
	
}