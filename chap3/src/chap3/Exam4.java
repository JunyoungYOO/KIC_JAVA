package chap3;

import java.util.Scanner;

/*
 * ���ڸ� �Է� �޾Ƽ�
 * 	1. ����ΰ�� "���",
 * 	   �����ΰ�� "����",
 * 	   0�� ��� "��" ����ϱ�
 * 	2. ¦������ Ȧ������ ����ϱ�
 * 
 * */
public class Exam4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num;
		
		
		System.out.println("���ڸ� �Է��ϼ���");
		num = scan.nextInt();
		//1
		System.out.println(num + ":"
				+((num>0)?"���":(num==0)?"��":"����") + "�̰�, "
				+ (num%2==0?"¦��":"Ȧ��"));
		
		
		//2			(num>0)?(num%2==1)?"Ȧ��":(num==0)?"0":"¦��":(num==0)?"��":(-num%2==1)?"Ȧ��":"¦��"
		//					(-num%2==1)?"Ȧ��":"¦��"
		System.out.println(num + "�� "
		+ ((num>0)?(num%2==1)?"Ȧ��":(num==0)?"0":"¦��":(num==0)?"��":(-num%2==1)?"Ȧ��":"¦��"));

	}

}
