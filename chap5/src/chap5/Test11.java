package chap5;
/*
int[][] score = {
			{90,80,70},
			{95,85,75},
			{70,80,75},
			{75,70,85},
			{70,75,80}
	}; 
* score �迭���� ���� ���ΰ� 1�� ��ū �迭 result �迭 �����ϱ�.
* score �迭�� ������ result�� �����ϰ�,
* �� �߰��� ��� ������ �� ��� ���� ���� �����ϰ�, result �迭�� ���� ����ϱ�
[���]
1��:	90	80	70	240	
2��:	95	85	75	255	
3��:	70	80	75	225	
4��:	75	70	85	230	
5��:	70	75	80	225	
�հ�	400	390	385	1175	
*/
public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = {
				{90,80,70},
				{95,85,75},
				{70,80,75},
				{75,70,85},
				{70,75,80}
		}; 
		int colnum[] = new int[4];
		
		int[][] result = new int[score.length+1][score[0].length+1];
		int totsum = 0;
		for (int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				result[i][j]=score[i][j];
				result[i][score[i].length] += score[i][j];				
				result[score.length][j] += score[i][j];
				result[score.length][score[i].length] += score[i][j];
			}
		}
		
		
		for(int i=0;i<result.length-1;i++) {
			System.out.print(i+1 +"��: ");
			for (int j=0;j<result[i].length;j++) {
				System.out.print(result[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.print("�հ� ");
		for (int i=0;i<result[5].length;i++) {
			System.out.print(result[5][i]+"\t");
		}
		
		
	}

}
