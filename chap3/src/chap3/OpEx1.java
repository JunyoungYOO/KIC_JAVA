package chap3;
/*
 * ���� ������ : �����ڿ� �ǿ����ڰ� �Ѱ��� ������.
 * 			  ��κ� �켱 ������ ����.
 * 
 * 1. ���������� : ++, --
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
