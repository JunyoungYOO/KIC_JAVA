package chap9;
/*
 * finally ��
 *     try ������ ����/���� ��� ���� �Ǵ� ��. �߰��� return�� ���� �ǵ� finally ���� �����.
 *     
 *     
 * [���]
 * 1456 => 2/0
 * 12356 => 2/1
 * 
 * 1235 => ���� return
 * 145  => catch �� return
 */
public class ExceptionEx3 {

	public static void main(String[] args) {
		try {
			System.out.print(1);
			//System.out.print(2/0);
			System.out.print(2/1);
			System.out.print(3);
			return; // �Լ�����
		} catch (Exception e) {
			System.out.print(4);
			
		} finally {
			System.out.print(5);
		}
		System.out.println(6);
	}

}
