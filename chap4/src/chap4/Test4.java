package chap4;

import java.util.Scanner;

/*
 * 
 * ��Ī�� ���ϱ�
 * */

public class Test4 {

	public static void main(String[] args) {
		
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int tmp = num;
		int result = 0;
		
		while(tmp!=0) {
			result *=10;
			result += tmp % 10;
			tmp /= 10;
		}
		
		if (num==result) {
			System.out.println(num + ": ��Ī��");
		} else {
			System.out.println(num + ": ��Ī�� �ƴ�");
		}
		

	}

}
