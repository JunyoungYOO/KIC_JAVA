package chap3;

import java.util.Scanner;

/*
 * ȭ�鿡�� �ݾ��Է¹޾Ƽ� 500,100,50,10,1�� �������� �ٲٱ�.
 * �ʿ��� ������ ���� ����ϱ�. ��ü������ �ּ� ������ �ٲ۴�.
 * [���]
 * �ݾ��� �Է��ϼ���
 * 5641
 * 500�� : 11��
 * 100�� : 1��
 * 50��  : 0��
 * 10�� : 4��
 * 1��  : 1��
 */

public class Exam5 {

	public static void main(String[] args) {

		int money2, money;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��ϼ���.");
		money = scan.nextInt();
		money2 = money;
		System.out.println("500�� : " + money/500 + "��");
		System.out.println("100�� : " + money%500/100 + "��");
		System.out.println("50�� : " + money%100/50 + "��");
		System.out.println("10�� : " + money%50/10 + "��");
		System.out.println("1�� : " + money%10 + "��");
		
	

	}

}
