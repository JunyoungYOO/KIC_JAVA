package chap6;
/*
 * 
 * 구동클래스가 정상적으로 실행 되도록 Animal3 클래스 구현하기
 * Animal3 클래스의 멤버
 * 	 멤버 변수 : name, age
 *   멤버 메서드 : toString();
 * 
 */

class Animal3 {
	String name;
	int age;

	Animal3() {
		System.out.println("기본생성자 호출됨\t 객체 하나 생성"); // 아래에 내가 정의한 생성자가 없으면 자동으로 생성됨, 내가 정의한 생성자가 있으면 생성이 안되기때문에 기본 생성자 따로 만듬
	}

	Animal3(String n, int a) {

		System.out.println("내가 정의한 생성자");
		name = n;
		age = a;
	}

	public String toString() {
		return name + ":" + age;
	}
}

public class Exam4 {

	public static void main(String[] args) {
		Animal3 a = new Animal3("원숭이", 20);
		System.out.println(a);
		
		Animal3 b = new Animal3();
	}

}
