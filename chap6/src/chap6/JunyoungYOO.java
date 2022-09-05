package chap6;


public class JunyoungYOO {

	public static void main(String[] args) {
		// 	2~50중 소수 출력
		int[] arr = new int[50]; 
		int[] ans = new int[50];
		int n=0;
		for (int i=0;i<49;i++) {
			arr[i]=i+2;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for (int i: arr) {
			if(i%2==0 && i/2!=1) ;
			else if (i%3==0 && i/3!=1) ;
			else if (i%5==0 && i/5!=1) ;
			else if (i%7==0 && i/7!=1) ;
			else {
				ans[n]=i;
				n++;
			}				
		}
		
		n=0;
		
		while(ans[n]!=0) {
			System.out.print(ans[n]+", ");
			n++;
		}
		System.out.println("=>소수갯수: "+ (n));
		
		
	}
}


