package chap4;

public class Exam6 {

	public static void main(String[] args) {
		/*
		 * �� : {}
		 * �������� : �����ο��� ����� ����
		 * */
		
		for (int i=2;i<=9;i++) {
			System.out.print(i+"��\t");
			// i���������� for���ȿ����� ���
		}
		System.out.println();
		for (int j=2;j<=9;j++) {
			
			for(int k=2;k<=9;k++) {
				System.out.print(k + "*" + j + "=" + j*k +"\t");
			}
			System.out.println();
		}
		
	}

}
