package chap3;

import java.util.Scanner;

//  �������� �Է¹޾� ���� �ѷ��� ������ ���Ͻÿ�
public class Test6 {
	public static void main(String[] args) {
		double pi = 3.141592;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("������");
		int r = scan.nextInt();
		
		System.out.println("���� �ѷ� : " + (double)(2*pi*r) + "���� ���� : " + (double)(pi*r*r));
	}
}