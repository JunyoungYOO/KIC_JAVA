package chap9;

import java.util.Scanner;

public class ExceptionEx7 {

	public static void main(String[] args) {
		try {
			String id = "hong";
			String pw = "1234";
			Scanner scan = new Scanner(System.in);
			System.out.println("���̵� �Է�");
			String inId = scan.next();
			System.out.println("��й�ȣ �Է�");
			String inPw = scan.next();
			if(id.equals(inId) && pw.equals(inPw)) {
				System.out.println("�α��� ����");
			} else if(!id.equals(inId)) {
				throw new LoginFailException("ID Ȯ���ϼ���.");
			} else {
				throw new LoginFailException("��й�ȣ�� Ȯ���ϼ���.");
			}
		} catch(LoginFailException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
}

class LoginFailException extends Exception{
	LoginFailException(String msg){
		super(msg);
	}
}
