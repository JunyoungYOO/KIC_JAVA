package chap6;
/*
 * 오버 로딩 예제
 *  - 같은 클래스에 이름이 같은 메서드가 여러개 존재할 수 있다.
 *    단 매개변수 목록이 달라야 한다.
 *  - 메서드의 다형성
 *  
 */

class Math3{
	int a = 100;
	int add(int b) {
		System.out.print("1: ");
		return a+b;
	}
	double add(double b) {
		System.out.print("2: ");
		return a+b;
	}
	String add(String b) {
		System.out.print("3: ");
		return a+b;
	}
}
public class OverloadingEx1 {

	public static void main(String[] args) {
		Math3 m3 = new Math3();
		System.out.println(m3.add(10));		//1
		System.out.println(m3.add(10.3));	//2
		System.out.println(m3.add("번호"));	//3
		System.out.println(m3.add(10L));	//2. add로 들어감  - 자동형변화이 가능하 ㄴ메서드
	}

}
