package chap5;

public class ArrEx3 {

	public static void main(String[] args) {
		// 배열 초기화
		int[] arr = {10,20,30,40,50};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+ i + "]=" + arr[i]);
		}
		//int [] arr2= {100,200,300};
		int[] arr2;
		arr2 = new int[3];
		arr2[0]=100;		
		arr2[1]=200;
		arr2[2]=300;
		
		for (int i=0; i<arr2.length;i++) {
			System.out.println("arr2["+ i + "]=" + arr2[i]);
		}
		
		arr2 = arr;
		System.out.println("arr2[0]=1000 ===========");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+ i + "]=" + arr[i]);
		}
		for (int i=0; i<arr2.length;i++) {
			System.out.println("arr2["+ i + "]=" + arr2[i]);
		}
		System.out.println("arr2[0]=1000 ======");
		arr2[0] =1000;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+ i + "]=" + arr[i]);
		}
		for (int i=0; i<arr2.length;i++) {
			System.out.println("arr2["+ i + "]=" + arr2[i]);
		}
	}

}
