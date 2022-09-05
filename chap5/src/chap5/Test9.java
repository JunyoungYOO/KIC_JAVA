package chap5;

import java.util.Arrays;

/*
 * 1부터 100까지 임의의 수 10개를 배열에 저장하고, 정렬하여 출력하기
 * 정렬: Arrays.sort(arr);
 * 
 * */
public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[9];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		//Arrays 클래스 : 배열객체의 보조 클래스
		Arrays.sort(arr);	// 정렬
		for(int n:arr) {
			System.out.print(n +" ");
		}
	}

}
