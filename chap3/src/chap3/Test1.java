package chap3;

import java.util.Scanner;

/*
 * ����� ��� ���� ������� ���� ���ϱ�
 * 1���� ���ڿ� 10���� ����� ���� �� �ִٰ� �Ҷ� �ʿ��� ������ ������ ����ϱ�
 * [���]
 * ����� ������ �Է��ϼ���
 * 22
 * �ʿ��� ������ ���� : 3��
 * ����� ������ �Է��ϼ���
 * 30
 * �ʿ��� ������ ���� : 3��
 */
public class Test1 {
	public static void main(String[] args) {
		
		
		
		System.out.println("����� ������ �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("�ʿ��� ������ ���� : " + ((n/10==0)?(n/10):(n/10+1)) +"��");
				
		System.out.println("����� ������ �Է��ϼ���.");
		n= scan.nextInt();
		System.out.println("�ʿ��� ������ ���� : " + ((n/10==0)?(n/10):(n/10+n%10)) +"��");
	}
}