package chap5;
/*
 * 
 * arr �迭�� ���� ��, ������, ��ü�� ����ϱ�
 * 
 * */
public class Exam5 {

	public static void main(String[] args) {
		int[][] arr = {{1},{10,20},{30,40,5,6,7},{50,60,70}};
		/*
		 * 0�� : 1
		 * 1�� : 30
		 * 2�� : 88
		 * 3�� : 180
		 * 1�� : 91
		 * 2�� : 120
		 * 3�� : 75
		 * 4�� : 6
		 * 5�� : 7
		 * */
		
		int maxcol=0;
		for (int i=0;i<arr.length;i++) {
			if(maxcol < arr[i].length) {
				maxcol = arr[i].length;
			}
		}
		System.out.println(maxcol);
		
		
		int sum = 0;
		int[] colsum = new int[maxcol];
		int totsum=0;
		
		
		
		
		for (int i=0;i<arr.length;i++) {
			sum = 0;
			for (int j=0;j<arr[i].length;j++) {
				sum += arr[i][j];
				colsum[j] += arr[i][j];
				totsum += arr[i][j];
			}
			System.out.println(i+"���� �� = "+sum);
		}		
		
		for (int i=0;i<colsum.length;i++) {
			System.out.println(i+"���� �� = "+ colsum[i]);
		}
	}

}
