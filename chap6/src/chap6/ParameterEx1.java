package chap6;


class Value{
	int val;
}

public class ParameterEx1 {

	public static void main(String[] args) {
		Value v = new Value();
		v.val = 100;
		change1(v.val);	//지역변수가 200으로 출력했음
		System.out.println("change1() 이후: " + v.val);	// 메서드 안의 지역변수만 +해서 100이라고 나옴
		change2(v);	//객체화한 val값을 실제로 바꾸고 출력함.
		System.out.println("change1() 이후: " + v.val);	// 객체화된 인스턴스변수를 바꿔주었기때문에 호출하면 값이 바뀡어ㅣㅆ음
	}

	static void change1(int val) {
		val += 100;
		System.out.println("change1() :" + val);
	}
	
	static void change2(Value v) {
		v.val += 100;
		System.out.println("change2() : "+ v.val);
	}

}
