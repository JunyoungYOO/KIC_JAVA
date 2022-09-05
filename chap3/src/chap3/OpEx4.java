package chap3;
/*
 * 비교연산자(관계연산자) : ==, !=, >, >= ... -> 결과값은 boolean
 * 논리연산자 : &&(AND), ||(OR) => boolean && boolean
 * 
 * T && T --> T
 * T && F --> F
 * T && F --> F
 * F && F --> F
 * 
 * T || T --> T
 * T || F --> T
 * T || F --> T
 * F || F --> F
 * */
public class OpEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1, y=1;
		
		System.out.println("1 == 1 :" + (x==y));
		System.out.println("1 != 1" + (x!=y));
		System.out.println("1 >= 1" + (x>=y));
		System.out.println("1 > 1" + (x>y));
		
		System.out.println("x==1 && y==2" + (x==1 && y==2));
		System.out.println("x==1 || y==2" + (x==1 || y==2));
		
	}

}
