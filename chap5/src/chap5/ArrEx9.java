package chap5;
/*
 * �����迭 : �������迭������ ��� ����� ������ ������ �ʿ䰡 ����
 * 			�� ù��° �迭�� ������ �����ؾ���.
 * 
 */
public class ArrEx9 {

	public static void main(String[] args) {
		int arr[][] = new int[3][]; //�����迭
		arr[0] = new int[] {10,20}; //�迭�� ����+�ʱ�ȭ
		arr[1] = new int[] {30,40,50};
		arr[2] = new int[] {60};
		//��� ����ϱ�
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("arr["+i+"]["+j+"]="+arr[1][j]+"\t");
			}
			System.out.println();
		}
	}

}
