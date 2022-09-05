package chap6;


/*
 * 메서드(함수) 구성
 * [접근제어자] 리턴타입 메서드 이름(매개변수 목록)
 * {
 * 		문장들;
 * }
 * 
 * 
 * 리턴타입 : 메서드 종료 후 전달되는 값의 자료형 설정
 * 		void : 메서드 종료 후 전달 되는 값이 없는 경우
 * 		자료형 : 메서드 종료 후 전달 되는 값 자료형 설정
 * 매개변수 : 메서드 호출시 전달되는 값의 자료형과 변수명을 설정
 * 			매개변수가 없는 경우 ()로 표현함.
 * 
 * return : 메서드 종료.
 * 		리턴타입이 void인 경우 생략가능함. 메서드의 끝 }를 만나면 메서드 종료.
 * 		리턴타입이 void가 아닌 경우 반드시 사용해야함 return 리턴값; =? 리턴값이  리턴타입과 동일하거나, 자동형변환이 가능하면 됨.
 * 
 * 
 */
class Math1{
	int add1 (int a, int b){
		return a+b;
	}
	long add2(int a, int b){
		return a+b;
	}

	void add3(int a, int b){
		System.out.println(a+b);
		return;
	}
}

public class MathEx1 {

	public static void main(String[] args) {
		Math1 m1 = new Math1();		// 객체 생성
		int a1= m1.add1(15, 20);	// add1메서드 호출 및 실행
		System.out.println(a1);		// a1에 저장된 add1메서드 리턴값 출려
		long a2 = m1.add2(10, 20);
		System.out.println(a2);
		m1.add3(15, 25);
		
	}

}
