package chap5;
/*
 * 1. ������(int) �迭 10���� ����
 * 2. ������ ����� 1 ~ 100 ������ ������ ���� ����
 * 3. �迭�� ����� �� ����ϱ�
 * 
 * 
 * */
public class ArrEx2 {

	public static void main(String[] args) {
		// 1. ������(int) �迭 10���� ����
		int[] arr = new int[10];
		//2. ������ ����� 1 ~ 100 ������ ������ ���� ����
		for(int i=0;i<arr.length;i++) {
			/*
			 * 0.0 <= Math.random() < 1.0;
			 * 0 <= Math.random()*100 < 100.0
			 * 0 <= (int)(Math.random()*100) <=99
			 * 1 <= (int)(Math.random()*100)+1 <=100
			 * */
			
			arr[i] = (int)(Math.random()*100);
			System.out.println(arr[i]);
		}
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		System.out.println("�迭 ����� ��: " + sum);
	}

}
