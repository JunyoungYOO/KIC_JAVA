package chap6;

public class MemberCallEx1 {
	static int cv1 = 10;	//클래스 멤버
	static int cv2 = cv1;	//클래스 멤버
	int iv1 = 100;			//인스턴스 멤버
	int iv2 = iv1;			//인스턴스 멤버간 호출
	int iv3 = cv1;			// 인스턴스 멤버에서 클래스 멤버 호출
	// static int cv3 = iv1;	// 클래스 멤버에서 인스턴스 멤버 호출 => 오류
	static int cv3 = new MemberCallEx1().iv1;
	
	void method1() {					// 인스턴스 멤버
		System.out.println("method1호출");
		System.out.println(cv1+cv2);	// 클래스 멤버 호출
		System.out.println(iv1+iv2);	// 인스턴스 멤버 호출
	}
	
	static void method2() {		// 클래스 멤버
		System.out.println("method2호출");
		System.out.println(cv1+cv2);	// 클래스 멤버 호출
		//System.out.println(iv1+iv2);	// 객체화가 되어야 호출되는 인스턴스 멤버이기때문에 호출하는 멤버로 사용될수없음.
		MemberCallEx1 m = new MemberCallEx1();
		System.out.println(m.iv1+m.iv2);
	}
	
	public static void main(String[] args) {
		
		//cv2 = iv1;	//객체화해야 iv1을 쓸수있음
		MemberCallEx1 m1 = new MemberCallEx1();
		
		cv2 = m1.iv1;
		System.out.println(cv2);
		
		new MemberCallEx1().iv3 = cv2;
		System.out.println(new MemberCallEx1().iv3);
		
		new MemberCallEx1().method1();
		method2();
	}

}
