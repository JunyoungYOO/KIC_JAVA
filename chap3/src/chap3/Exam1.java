package chap3;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		System.out.println("x="+ x++);
		System.out.println("x="+ --x);
		
		//ȭ�鿡 �Է¹��� ���ڸ� ����������(++,--)��
		// ����ص� ���� ���� �������� ���α׷� �ۼ��ϱ�
		//ȭ�鿡�� ������ �Է¹ޱ�
		System.out.println("���ڸ� �Է��ϼ���:");
		//System.in : Ű���帣�� �Է°�ü
		//nextInt() : ���ڰ� �Է¹޾� x�� ����
		Scanner scan = new Scanner(System.in);
		x=scan.nextInt();
		// ++ �����ڸ� �̿��Ͽ� ����� �Է¹��� �� ���
			System.out.println("x=" + x++);
		// -- �����ڸ� �̿��Ͽ� ����� �Է¹��� �� ���
			System.out.println("x=" + --x) ;
	}

}
