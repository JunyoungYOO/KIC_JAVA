package chap5;
/*
 * �������� ���Ƹ� ��ü���� �հ� �ٸ����� ���� �Է¹޾�
 * ������, ���Ƹ��� ������ ��ü���� ����ϴ� ���α׷� �ۼ��ϱ�
 * 
 *[���]
 *�������� ���Ƹ� ��
 *10
 *�������� ���Ƶ� �ٸ��� ��
 *30
 * ������ 5����, ���Ƹ� 5����
 * */

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�������� ���Ƹ� ��");
		int sum = scan.nextInt();
		System.out.println("�������� ���Ƹ� �ٸ��� ��");
		int sum_leg=scan.nextInt();
		int d=0, c=0;
		boolean isTrue=false;
		
		for (int i=0;i<=sum;i++) {
			for (int j=0;j<=sum;j++) {
				if (sum==i+j && sum_leg==(4*i)+(2*j)) {
					d=i;
					c=j;
					isTrue=true;
				}
			}
		}
		
		if(isTrue) System.out.println("������ "+ d +"����, ���Ƹ� " +c+ "����" );
		// if(isTrue) : isTrue==true ���� �ǹ�
		// if(!isTrue) : isTrue==false �����ǹ�
		else System.out.println("�߸� �Է��߽��ϴ�.");
	}

}
