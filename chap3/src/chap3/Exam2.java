package chap3;

import java.util.Scanner;

/*
 * �ʸ� �Է� �޾� ��ð� ��� �������� ����ϱ�
 * 1. Scanner ����
 * 2. second = scan.nextInt(); 
 * 3. h = second/3600
 * 
 * */


public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("���ڸ� �Է��ϼ���:");
		Scanner scan = new Scanner(System.in);
		int second;
		int h, m, s;		
		
		second = scan.nextInt();
		h= second/3600;
		m = (second%3600)/60;
		s = second%60;
		System.out.println(h+"�ð�"+m+"��"+s+"��");
				
				
	}

}
