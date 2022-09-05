package chap5;
/*
 * 
 * 정수형 (int) 배열 5개를 생성
 * 2. 1 ~ 10 사이의 임의수를 5개를 저장
 * 3. 배열의 숫자의 합계, 평균을 출력하기
 * 
 * */
public class Exam1 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		int sum =0;
		for (int i =0 ; i<arr.length;i++) {
			
			arr[i] = (int)(Math.random()*10)+1;
			
			sum += arr[i];
		}
		System.out.print("합계 : "+ sum + " 평균 :" + (double)sum/arr.length);
	}

}
