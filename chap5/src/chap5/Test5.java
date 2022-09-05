package chap5;
/*
 * (1)+(1+2)+(1+2+3)+ ... +(1+2+3+4+5+6+7+8+9)+(1+2+3+4+5+6+7+8+9+10)=220
 * 
 * 
 * */
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		//System.out.println("숫자 입력");
		
		for(int i=1;i<=10;i++) {
			System.out.print("(");
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				sum+= (j);
				if (i>=2 && j<i) System.out.print("+");
			}
			System.out.print(")");
			if(i<10) System.out.print("+");
		}
		
		System.out.println("=" + sum);

	}

}
