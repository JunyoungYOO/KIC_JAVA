package chap5;
/*
 * 
 * 
 * 
 * 
 */
public class ArrEx10 {
	public static void main(String[] args) {
		int[][] arr = new int[10][];  //�����迭
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = new int[i+1];	//�迭 ����
		}
		
		// ���� ä���
		int data = 0;
		for(int j=arr.length-1;j>=0;j--) {		// ���� �� �ݺ�
			for(int i=j;i<arr.length;i++) {		// ���� �� �ݺ�
				arr[i][j] = ++data;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				// printf : ��½� ���Ĺ��� ǥ��
				// %4d : 4�ڸ��� 10����
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}

}
