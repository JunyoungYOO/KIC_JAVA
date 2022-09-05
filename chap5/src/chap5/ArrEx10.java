package chap5;
/*
 * 
 * 
 * 
 * 
 */
public class ArrEx10 {
	public static void main(String[] args) {
		int[][] arr = new int[10][];  //가변배열
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = new int[i+1];	//배열 생성
		}
		
		// 숫자 채우기
		int data = 0;
		for(int j=arr.length-1;j>=0;j--) {		// 열의 값 반복
			for(int i=j;i<arr.length;i++) {		// 행의 값 반복
				arr[i][j] = ++data;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				// printf : 출력시 서식문자 표시
				// %4d : 4자리로 10진수
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}

}
