package chap5;
/*
 * 
 * ������ (int) �迭 5���� ����
 * 2. 1 ~ 10 ������ ���Ǽ��� 5���� ����
 * 3. �迭�� ������ �հ�, ����� ����ϱ�
 * 
 * */
public class Exam1 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		int sum =0;
		for (int i =0 ; i<arr.length;i++) {
			
			arr[i] = (int)(Math.random()*10)+1;
			
			sum += arr[i];
		}
		System.out.print("�հ� : "+ sum + " ��� :" + (double)sum/arr.length);
	}

}
