package chap5;

/*
 * 1. ������ 2x+4y=10�� ��� �ظ� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *    �� x�� y�� �����̰�  ������ ������ 0<=x<=10, 0<=y<=10�� 
 * [���] 
 * x=1,y=2   
 * x=3,y=1   
 * x=5,y=0    
 */
public class Test3 {

	public static void main(String[] args) {
		
		
		int d=0, c=0;
		
		for (int x=0;x<=10;x++) {
			for (int y=0;y<=10;y++) {
				if ((2*x)+(4*y)==10) {					
					System.out.println("x="+ x + ", y=" + y);
				}
			}
		}
	}

}
