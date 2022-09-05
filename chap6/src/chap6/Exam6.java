package chap6;
/*
 * 원(Circle2) 클래스 구현하기
 *  1. 멤버 변수
 *  	반지름, x좌표, y좌표, 원의번호
 *      원의번호 생성 변수 count
 *  2. 생성자: 구동 클래스에 맞도록 설정하기
 *  3. 멤버메서드
 *     (1) double area() : 원의 넓이 리턴, Math.PI상수 사용
 *     (2) double length() : 원의 둘레 리턴, Math.PI상수 사용
 *     (3) void move(int a, int b) : x,y좌표를 x+a, y+b로 이동
 *     (4) void scale(double m) 반지름 m배 확대/축소 r=r*m;
 *     (5) String toString():
 *         1번원 : 반지름:10, 좌표:(10,10), 넓이:314.xxx, 둘레 xxx.xxx
 * 
 * 
 * 
 * */
class Circle2{
	double r;
	int x, y;
	int no;
	double m;
	static int count;
	
	Circle2(){
		System.out.println("기본생성자");
	}
	
	Circle2(double r, int x, int y){
		this.r=r;
		this.x=x;
		this.y=y;
		no = ++count;
	}
	
	Circle2(int x, int y){
		this(1,x,y);
	}
	
	Circle2(double r){
		this(r,0,0);
	}
	
	double area() {
		return (double)Math.PI*r*r;
	}
	
	double length() {
		return (double)Math.PI*r*2;
	}
	
	void move(int x, int y){
		this.x += x;
		this.y += y;
		
	}
	void scale(double m) {
		r *= (int)m;
	}
	
	public String toString() {
//		return no + "번원 : 반지름 :" + this.r +
//				", 좌표 : (" + this.x + ", " + this.y +
//				"), 넓이:" + area() + ", 둘레: " + length();
//		// String.format(): 문자열에서 서식문자 사용함수
		return String.format("%d번원: 반지름%.0f, 넓이:%.2f, 둘레: %.2f", no,r,area(),length());
	}
	
}

public class Exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2[] carr=new Circle2[3];
		carr[0] = new Circle2(10,10,10);  // 반지름 : 10, (10,10)좌표
		carr[1] = new Circle2(20,20);	//반지름1, 20,20 좌표,좌표
		carr[2] = new Circle2(100);		//반지름100, 0,0 좌표좌표
		
		for (Circle2 c:carr) {
			System.out.println(c);
			c.move(10,10);
			System.out.println(c);
			c.scale(3);
			System.out.println(c);
		}
		System.out.printf("%.2f", 123.45678);

	}

}
