package chap5;

public class ArrEx6 {
	// String[] args : main ����� ���� ����
	//				   command line���� �Ķ����(��) ����
	//				   �����������	�迭�� ��� �и�
	// 				   ������ �����ϴ� ��� " "�� ��� �и� ����
	public static void main(String[] args) {
		
		if(args.length == 0) {
			System.out.println("command line�� �Ķ���� �Է� ���");
			System.out.println("java ArrEx6 ȫ�浿 ���");
			return;
		}
		
		System.out.println("������ for ���� : ÷��(index) ��� �Ұ�");
		
		for(String s:args) {
			System.out.println(s);
		}
		
		
		System.out.println("����for����");
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}

	}

}
