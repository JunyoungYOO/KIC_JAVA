package chap9;
/* 
 * UnsupportFunctionException Ŭ���� �����ϱ�
 * 1. ������� : private final int ERR_CODE;
 * 2. ����޼��� : 
 *     public int getErrCode() : ERR_CODE �� ��ȯ
 *     public String getMessage() : �������̵� �޼���.
 *          �θ�Ŭ������ message ���� ERR_CODE �� ��ȯ.
 * 3. ����ó���� ���ص� �ǵ��� ����.
 * 4. �����ڴ� ����Ŭ������ ȣ�⿡ �µ��� ����   
 * 
[���]
�������� �ʴ� ����Դϴ�.,�����ڵ�:200
200
chap9.UnsupportFunctionException: �������� �ʴ� ����Դϴ�.,�����ڵ�:200
	at chap9.Test1_A.main(Test1_A.java:31) 
*/

class UnsupportFunctionException extends Exception{
	private final int ERR_CODE;
	
	UnsupportFunctionException(String s, int num){
		super(s);
		ERR_CODE = num;
	}
	
	public int getErrCode() {
		return ERR_CODE;
	}
	public String getMessage() {
		return super.getMessage()+", �����ڵ�"+ERR_CODE;
	}
}

public class Test1 {
	public static void main(String[] args) {
		try {
			throw new UnsupportFunctionException("�������� �ʴ� ����Դϴ�.", 200);
		} catch (UnsupportFunctionException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getErrCode());
			e.printStackTrace();
		}
	}

}