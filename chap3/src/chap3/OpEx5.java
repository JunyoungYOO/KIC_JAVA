package chap3;
/*
 * 
 * 비트 연산자: &(and), |(or), ~ (not), ^(XOR)
 * 
 * 
 * */
public class OpEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(6 & 3);
		/*
		 * 6: 00000110
		 * 3: 00000011
		 * &: 00000010 =>2
		 * */
		System.out.println(6 | 3);
		
		/*
		 * 
		 * 6 : 00000110
		 * 3 : 00000011
		 * | : 00000111 => 7
		 * 
		 * */
		System.out.println(6 ^ 3);
		
		/*
		 * XOR: 배타적 OR, 두개값이 다르면 TRUE 1 같으면 FALSE 0
		 * 6 : 00000110
		 * 3 : 00000011
		 * ^ : 00000101 =>5
		 * */
		System.out.println(~10);
		/*
		 * ~ : NOT :
		 * 10 : 00001010
		 * ~10: 11110101
		 * 
		 * */

	}

}
