package chap9;

public class ExceptionEx5 {
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
		   System.out.println(Integer.parseInt("abc"));
		} catch (Exception e) {
			System.out.println("second:���ڸ� �Է��ϼ���");
			throw e; //e��ü�� ���� �ٽ� �߻�
		}
	}
}
