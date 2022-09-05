package chap6;
/*
 * 
 * 생성자 예제
 * 
 * 생성자란 :
 * 1. 객체화시 호출되는 메서드
 * 2. 생성자 없는 객체 생성은 불가함
 * 3. 기능은 인스턴스 변수의 초기화 함.
 * 4. 인스턴스멤버임.
 * 5. 오버로딩이 가능함 => 하나의 클래스에 여러개의 생성자가 가능함
 * 
 * 생성자 구현
 * 1. 생성자의 이름은 클래스명과 같다.
 * 2. 리턴타입을 구현하지 않음.
 * 
 * 기본생성자
 * 1. 클래스 내부에 생성자가 구현되지 않으면 컴파일러가 추가해주는 생성자.
 * 2. public 클래스명 () {}	-식
 */

class Number1{	//기본생성자 컴파일에서 구현됨
	int num;
}

class Number2 { 	//기본생성자 제공안함  - 생성자가 직접 구현되어있음
	int num;
	Number2(int n){	 //생성자
		num = n;
	}
	
}
public class ConstructorEx1 {

	public static void main(String[] args) {
		Number1 n1 = new Number1();
		/*
		 * new 에약어 기능
		 * */
		System.out.println(n1.num);
		Number2 n2 = new Number2(10);
		System.out.println(n2.num);

	}

}
