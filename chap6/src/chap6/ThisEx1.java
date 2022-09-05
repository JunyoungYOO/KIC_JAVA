package chap6;

/*
 * 
 * this 예약어
 * 
 * this() 생성자 : 같은 클래스내에 다른 생성자 호출시 사용
 * this 참조변수
 * 
 */
class Car2{
	
	String color;
	int number;
	Car2(String color, int number){
		System.out.println("(String, int) 생성자");
		this.color = color;
		this.number = number;
	}
	Car2(){
		this("white", 1);
	}
	Car2(String color){
		this(color, 1);
		System.out.println("String생성자");
	}
	Car2(int number){
		this("white", number);
		System.out.println("int 생성자");
	}
	Car2(Car2 c){
		this(c.color,c.number);
		System.out.println("(Car2) 생성자");
	}	
	public String toString() {
		return color + "." + number;
	}
	
//	static void method() {	//클래스 멤버에서는 this 사용불가 이유: 객체가 생성되지 않았는데 this는 객체 자신을 가르키기때문
//		System.out.println(this);
//	}
	void method1() {	//인스턴스 멤버에서는 this 사용가능
		//this 참조변수는 인스턴스 메서드의 지역변수 자동설정
		System.out.println(this);
	}
}

public class ThisEx1 {

	public static void main(String[] args) {
		Car2 c1 = new Car2("white", 1234);
		Car2 c2 = new Car2("blue", 3456);
		Car2 c3 = new Car2("red");
		Car2 c4 = new Car2(5678);
		Car2 c5 = new Car2(c1);	
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		c1.method1();
	}

}
