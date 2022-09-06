package chap9;
/*
 * 	������ ���� �����ϱ�
 * 1. try catch �������� ���� ó���� �ϸ� ���� �Ȼ���
 * 2. throws �������� ���� ó���ϱ�
 * 3. ����ó�� ���� �����ϵ��� RuntimeException Ŭ������ ����Ŭ������ ����
 */
class MyException extends RuntimeException {
	int pos;
	MyException(String msg, int pos){
		super(msg);
		this.pos=pos;
	}
	public int getPos() {
		return pos;
	}
	//getMessage() �޼��带 �������̵�. => pos�� ���� ����ϱ�.
//	@Override
//	public String getMessage() {
//		return super.getMessage() + ":"+pos + "����";
//	}
	@Override
	public String getMessage() {
		return super.getMessage() + ":"+pos + "����";
	}
}

public class Exam2 {

	public static void main(String[] args)  {
		first();
	}

	private static void first() {
	/* 1.	
	    try {
			throw new MyException("���� ���� �߻�");
		} catch (MyException e) {
			
		}
	*/		
		throw new MyException("���� ���� �߻�", 29);	//����ó�� ���� ������ ����Ŭ������ ����
		
	}
}
