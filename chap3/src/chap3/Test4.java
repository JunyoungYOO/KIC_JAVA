package chap3;

import java.util.Scanner;

/*
 *  ȭ�鿡�� �μ��� �Է¹޾Ƽ� ��ū���� ����ϱ� 
 */
public class Test4 {
	public static void main(String[] args) {
		System.out.println("�μ��� �Է�:");
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		System.out.println("�� ū�� :" + ((n1>n2)?n1:(n1<n2)?n2:" ������."));
	}
}