package chap5;

import java.util.Scanner;

/*
 * 1~100 ������ ������ �� ���
 * ����� ���ڸ� ���ߴ� ���α׷�

 * 
 * 1~100���̰� �̷� : 50
 * ��������
 * 1~100���̰� �̷� : 30
 * ��ū��
 * .
 * .
 * .
 * ������ϴ�.
 * 
 * �õ� Ƚ���� 7�Դϴ�.
 * */
public class Test4 {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*100)+1;
		int count=0;
		int ans;
		boolean isTrue=false;
		
		Scanner scan = new Scanner(System.in);
		
		while(!isTrue) {
			count++;
			System.out.println("1~100���̰� �Է�");
			ans = scan.nextInt();
			
			if(ans==num) {
				System.out.println("������ϴ�.");
				isTrue=true;
				break;
			} else if(ans>num) System.out.println("�� ������");
			else System.out.println("�� ū��");
			
			
		}
		
		System.out.println("�õ� Ƚ���� "+count+"�Դϴ�.");
	}

}
