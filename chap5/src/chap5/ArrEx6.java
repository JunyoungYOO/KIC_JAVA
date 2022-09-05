package chap5;

public class ArrEx6 {
	// String[] args : main 실행시 값을 전달
	//				   command line에서 파라미터(값) 전달
	//				   공백기준으로	배열의 요소 분리
	// 				   공백을 포함하는 경우 " "로 요소 분리 가능
	public static void main(String[] args) {
		
		if(args.length == 0) {
			System.out.println("command line에 파라미터 입력 요망");
			System.out.println("java ArrEx6 홍길동 김삿갓");
			return;
		}
		
		System.out.println("개선된 for 구문 : 첨자(index) 사용 불가");
		
		for(String s:args) {
			System.out.println(s);
		}
		
		
		System.out.println("기존for구문");
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}

	}

}
