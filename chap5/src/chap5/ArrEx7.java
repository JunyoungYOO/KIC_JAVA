package chap5;

/*
 * ������ �迭 :�迭�� �迭�� ǥ����.
 * 
 * 2�����迭 : 1�����迭�� ���������� �迭
 * 			 1���� �迭�� �迭.
 * 
 * 
 * */


public class ArrEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr;
		
		arr = new int[3][2];
		arr[0][0]=10;
		arr[0][1]=20;
		arr[1][0]=30;
		arr[1][1]=40;
		arr[2][0]=50;
		arr[2][1]=60;
		
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("arr["+i+"]"+"[" + j + "]=" + arr[i][j]);
			}
		}
		
		int [] arr1 = {100,200,300};
		arr[1]=arr1;
		System.out.println("arr[1]=arr1;");
		
		for(int i = 0; i<arr[i].length;i++) {
			for(int j = 0; j<arr[i].length;j++) {
				System.out.println("arr["+i+"]"+"[" + j + "]=" + arr[i][j]);
			}
		}

	}

}
