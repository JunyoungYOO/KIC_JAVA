package chap5;

import java.util.Scanner;

public class ArrEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nums = "0123456789ABCDEF";
		char[] numarr = nums.toCharArray();
		char[] hexa = new char[10];
		
		System.out.println("10������ �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num, index=0;
		
		while(divnum !=0) {
			hexa[index++] = numarr[divnum%16];
			divnum/=16;
			 
		}	
				
		System.out.println(num +"�� 16����: ");
		for (int i=index-1;i>=0;i--) {
			System.out.print(hexa[i]);
		}
		System.out.println();
	}

}

/*
 * 1. java�Қ� �ǵ�
 * 2. class ����Ʈ ����., => javac
 * 3. ���� -> java����������
 * - jvmȯ�����
 * - ����Ʈ �ڵ� �ε� ����
 * - main �޼��� ����
 * - main �޼��� ����Ǹ� ���α׷� ������
 * - jvm ȯ�� ����
 * 
 * jvm �޸� ����
 * Ŭ���� ����
 * 	����Ʈ�ڵ� �ε� ����
 *  API �ε�
 * ���� ���� 
 * */
 