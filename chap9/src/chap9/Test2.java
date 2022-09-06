package chap9;

import java.util.InputMismatchException;
import java.util.Scanner;

/* 1���� 100���� �� ������ ���ڸ� ��ǻ�Ͱ� �����ϰ�, 
 * ���� �Է¹޾� ����� ���� ���ߴ� ���α׷��� �ۼ��ϱ�
 *
 * �� 1 ���� 100������ ���ڰ� �ƴ� ��쿡�� 1 �� 100������ ���ڸ� �Է��ϼ��並 ���
 * ���ڰ� �Է��� �ȵ� ���� ���ڸ� �Է��ϼ��� �� ����ϰ� ��� �Է��� �޴´�.
 * ������ ������ ���α׷��� ����
 * ���� �� ����� �Է¸��� ���ڸ� ���߾����� ����ϱ�.
 * �� �Է� ������ �Էµ� �Է� �Ǽ��� ���Եȴ�.
 * 
[���]
1���� 100������ ���ڸ� �Է��ϼ���
500
1���� 100������ ���ڸ� �Է��ϼ���
1���� 100������ ���ڸ� �Է��ϼ���
a
a�� ���ڰ� �ƴմϴ�.
1���� 100������ ���ڸ� �Է��ϼ���
50
ū���� �Է��ϼ���
1���� 100������ ���ڸ� �Է��ϼ���
75
ū���� �Է��ϼ���
1���� 100������ ���ڸ� �Է��ϼ���
85
�������� �Է��ϼ���
1���� 100������ ���ڸ� �Է��ϼ���
80
ū���� �Է��ϼ���
1���� 100������ ���ڸ� �Է��ϼ���
82
ū���� �Է��ϼ���
1���� 100������ ���ڸ� �Է��ϼ���
83
83:�����Դϴ�. �Է� Ƚ��:8
*/       

public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean success = false;
		int num;
		int cnt=0;
		int ans = (int)(Math.random()*100)+1;
		
		while(!success) {
			try {
				System.out.println("1���� 100������ ���ڸ� �Է��ϼ���.");
				num = scan.nextInt();
				cnt++;
				if(num < 1 || num > 100) {
					throw new Exception("1���� 100������ ���ڸ� �����մϴ�."); //���� ���� �߻� 
				}
				else if(num>ans) System.out.println("�������� �Է��ϼ���");
				else if(num<ans) System.out.println("ū���� �Է��ϼ���.");
				else {
					System.out.println(num+": �����Դϴ�. �Է� Ƚ��:"+cnt);
					success=true;
				}
			} catch (InputMismatchException e) {
				scan.next();
				System.out.println("���ڸ� �Է��ϼ���.");
				cnt++;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			
		}
			
		}
		
}
