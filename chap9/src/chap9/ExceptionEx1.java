package chap9;
/*
 * ���� ó�� : �߻��� ���ܸ� ���������� ó���ϴ� ���
 * 
 * try catch ����
 *   try �� : ���� �߻� ���ɼ��� �ִ� ������ ���� ��
 *   catch ��: catch���� ���� try������ ���� �߻��� ���� �Ǵ� ��
 * 
 * [���]
 * 
 * 
 */
public class ExceptionEx1 {

	public static void main(String[] args) {
		try {
		System.out.print(1);
		//System.out.print(2/0);
		System.out.print(3);
		} catch(Exception e) {
			System.out.println(4);
		}
		
		System.out.println(5);
	}

}
