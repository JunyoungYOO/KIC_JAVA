package chap3;

import java.util.Scanner;

/*
 * ���ǿ����� (���׿�����) => ���ǹ����� ���� ����
 * 
 * (���ǹ�)
 * 
 * ���ǹ� : ����� boolean(true|false)
 * 
 * 
 * */


public class OpEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ �Է��ϼ���");
		
		Scanner scan = new Scanner(System.in);
		int score =scan.nextInt();
		System.out.println(score + "����" + ((score>=60)?"�հ�":"���հ�")+"�Դϴ�.");
		
		String result = (score>=60)?"�հ�":"���հ�";
		System.out.println(score + "���� " +result + "�Դϴ�.");
		
		//70���̻� �հ��Դϴ� 60���̻� ��������Դϴ�
		//60�̸� Ż���Դϴ�.
		
		System.out.println((score>=70)?"�հ��Դϴ�.":(score>=60)?"��������Դϴ�.":"���հ��Դϴ�.");
	}

}
