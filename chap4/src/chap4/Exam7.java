package chap4;
/*
 * 
 * 1���� 100������ �� �� 2�� ����� �ƴϰ�, 3�� ����� �ƴ� ���� ���� ���ϱ�
 * [���] 1663
 * */
public class Exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		
		for(int i=1;i<=100;i++) {
			
			if (i%2==0 || i%3==0) continue;
			sum += i;
		}
		
		System.out.println("�հ�" + sum);
	}

}
