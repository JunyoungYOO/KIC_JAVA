package chap9;
/*
 * ���� catch ����
 *   - �Ѱ��� try���� �������� catch ���� ����
 *   - try������ �߻������� ���ܰ� ������ �ִ� ���, ���ܺ��� �ٸ� ����ó�� ����.
 *   - ���� ����Ŭ������ catch ������ �ϴܿ� ��ġ�ؾ� �Ѵ�.
 */
public class ExceptionEx2 {

	public static void main(String[] args) {
		//	System.out.println(args[0]); //try���� �ۿ��� �߻��� ���ܴ� catch���� ���� ����
		try {
			System.out.println(args[0]);	//ArrayIndexOutOfBoundsException ���� �߻�
			System.out.println(10/1);		//ArtihmeticException ���� �߻�
			String s = null;
			System.out.println(s.trim());	//NullPointerException ���� �߻�, ����η� �����ϼ��� �޽��� ���
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Command ���ο� ���� �Է��ϼ���.");
		} catch (ArithmeticException e ) {
			System.out.println("0���� ������ ������");
		} catch (Exception e) {	//exception�׿� ��� ����ó��
			System.out.println("����η� �����ϼ���");
			e.printStackTrace();
		}
	}

}
