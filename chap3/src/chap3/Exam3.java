package chap3;

import java.util.Scanner;

/*
 * ȭ�鿡�� 3�ڸ� ������ �Է� �޾� 100�ڸ� �̸� ������ ����ϱ�
 * 
 * 1. Scanner ��ü ����
 * 2. num = scan.nextInt();
 * 3. 100���� ������, 100���ϱ�
 * 
 * 
 * 
 * */


public class Exam3 {

	public static void main(String[] args) {
		
		int num;
		int num1, num2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� ������ �Է��ϼ���");			
		num = scan.nextInt();
		
		num1 = num/100;
		
				
		System.out.println(num1*100);
		System.out.println("���ڸ� ������ �Է��ϼ���");
		num = scan.nextInt();
		num1 = num/100;
		
		System.out.println(num1*100);


	}

}
