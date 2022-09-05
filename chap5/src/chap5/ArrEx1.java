package chap5;

public class ArrEx1 {

	public static void main(String[] args) {

		int[] arr;
		arr = new int[5];
		System.out.println(arr[0]+"," + arr[1]);
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		int[] arr2 = new int[5];
		for(int i=0;i<arr2.length;i++) {
			arr2[i] = (i+1) * 100;
		}
		
		for (int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	}

}
