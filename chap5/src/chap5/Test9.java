package chap5;

import java.util.Arrays;

/*
 * 1���� 100���� ������ �� 10���� �迭�� �����ϰ�, �����Ͽ� ����ϱ�
 * ����: Arrays.sort(arr);
 * 
 * */
public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[9];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		//Arrays Ŭ���� : �迭��ü�� ���� Ŭ����
		Arrays.sort(arr);	// ����
		for(int n:arr) {
			System.out.print(n +" ");
		}
	}

}
