package chap9;
/*
 * throws : ���� ó�� 
 *          ���ܴ����� : ����޼��带 ȣ���� �޼���� ���� ����. 
 *                    ȣ���� �޼���� ���� �߻� ����
 */
public class ExceptionEx4 {
	public static void main(String[] args) {
		try {
			first();
		} catch(Exception e) {
			System.out.println("���ڸ� �����մϴ�.");
			e.printStackTrace();
		}
	}
	private static void first() throws Exception{
		System.out.println("first �޼���");
		second();
	}
	//throws Exception : ���ܰ� �߻��ϸ� ���� ȣ���� �޼���� ���� ����. 
	private static void second() throws Exception {
		System.out.println("second �޼���");
		//int <= Integer.parseInt(���ڹ��ڿ�)
		try {
		   System.out.println(Integer.parseInt("abc"));//NumberFormatException �߻�
		} catch (Exception e) {
			System.out.println("second:���ڸ� �Է��ϼ���");
		}
	}
}
