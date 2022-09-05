package chap5;
/*
 * 
 * 2345
 * 6789
 * 구구단 출력
 * */
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=2;i<=5;i++) {
			System.out.print(i+"단\t");
		}
		System.out.println();
		for(int i=2;i<=9;i++) {
			for (int j=2;j<=5;j++) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
			
		}
		
		for(int i=6;i<=9;i++) {
			System.out.print(i+"단\t");
		}
		System.out.println();
		for(int i=2;i<=9;i++) {
			for (int j=6;j<=9;j++) {
				System.out.print(j+"*"+i+"="+i*j+"\t");				
			}
			System.out.println();
			
		}
		
		
		/*for(int k=2;k<=9;k+=4) {
			for(int i=0;i<4;i++) {
				System.out.println("단\t");
				
			}
			System.out.println();
		}*/
		
		
	}

}
