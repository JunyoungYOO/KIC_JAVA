package chap4;

public class Exam6 {

	public static void main(String[] args) {
		/*
		 * 블럭 : {}
		 * 지역변수 : 블럭내부에서 선언된 변수
		 * */
		
		for (int i=2;i<=9;i++) {
			System.out.print(i+"단\t");
			// i지역변수는 for문안에서만 사용
		}
		System.out.println();
		for (int j=2;j<=9;j++) {
			
			for(int k=2;k<=9;k++) {
				System.out.print(k + "*" + j + "=" + j*k +"\t");
			}
			System.out.println();
		}
		
	}

}
