package chap9;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * ȭ�鿡�� 1���� 10������ ���ڸ� �Է¹޾� ���ڸ�ŭ * ����ϴ� ���α׷� �ۼ��ϱ�
 * �Էư��� ���ڰ� �ƴѰ�� InputMismatchException ���ܰ� �߻���.
 * ���ڸ� �Է��ϼ��� �޽��� ����ϰ�, �ٽ� �Է¹޵��� �����ϱ�
 * 
 */
public class Exam1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		boolean endable = false;
		while(!endable) {
			try {
				System.out.println("1~10������ ���ڸ� �Է��ϼ���");
				num = scan.nextInt(); //InputMismatchException 
				if(num < 1 || num > 10) {
					throw new Exception("1���� 10������ ���ڸ� �����մϴ�."); //���� ���� �߻� 
				}
				for(int i=0;i<num;i++) {
					System.out.print("*");
				}
				System.out.println();
				endable=true;
			} catch (InputMismatchException  e) {
				scan.next(); //�߸��� ���� �Է�.
				System.out.println("���ڸ� �Է��ϼ���");
			} catch(Exception e) {
				// e.getMessage() : 1���� 10������ ���ڸ� �����մϴ�.
				System.out.println(e.getMessage());
			}
		}
		System.out.println("���α׷� ����");
	}
}
