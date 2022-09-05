package chap5;
/*
 * 
 * arr 배열의 행의 합, 열의합, 전체합 출력하기
 * 
 * 
 * 
 * */
public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = {{10,20},{30,40},{50,60}};
		int sum=0;
		int sum_ar1=0;
		
		for (int ar1[]:arr) {
			sum=0;
			for(int a:ar1) {
				sum +=a;
			}
			System.out.println("행의 합" + sum);
		}
		for (int i=0;i<arr[i].length;i++) {
			sum_ar1=0;
			for(int j=0;j<arr.length;j++) {
				sum_ar1 += arr[j][i];
			}
			System.out.println("열의 합"+ sum_ar1);
		}
		
		for (int ar1[]:arr) {
			
			for(int a:ar1) {
				sum +=a;
			}			
		}
		System.out.println("전체 합" + sum);
		
	}

}
