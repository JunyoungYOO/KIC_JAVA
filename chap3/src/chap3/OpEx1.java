package chap3;
/*
 * 단항 연산자 : 연산자에 피연산자가 한개인 연산자.
 * 			  대부분 우선 순위가 높다.
 * 
 * 1. 증감연산자 : ++, --
 * 
 * 			   
 * 
 * */


public class OpEx1 {

	public static void main(String[] args) {
		int x=5, y=5;
		x++;
		y--;		
		System.out.println("x="+ x + ", y=" + y); 	//6,4
		
		++x;
		--y;
		System.out.println("x="+x+",y ="+y); //7,3
		
		x=y=5;
		y=++x;
		System.out.println("x="+x+",y="+y); //6,6
		y=x++;
		System.out.println("x="+x+",y="+y);	//7,6
		
		x=y=5;
		y=x++;
		System.out.println("x="+x+",y="+y); //6,5
		y=++x;
		System.out.println("x="+x+",y="+y);	//7,7
		
		x=5;
		System.out.println("x="+ x++);	//7,7
		System.out.println("x="+ ++x);	//7,7
		
	}

}
