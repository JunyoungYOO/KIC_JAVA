package chap3;

import java.util.Scanner;

/*
 * �غ��� ���̸� �Է¹޾� �ﰢ���� ���̸� ����ϱ�. �Ҽ����� ǥ��
 * [���]
 * �غ��� ����
 * 10
 * ������ ����
 * 20
 * 
 * ����=10*20 / 2
 */
public class Test5 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�غ��� ����");
		int n = scan.nextInt();
		System.out.println("������ ����");
		int m = scan.nextInt();
		
		System.out.println( n*m/2 + " = "+ n + "*" + m + "/ 2");

	}
}