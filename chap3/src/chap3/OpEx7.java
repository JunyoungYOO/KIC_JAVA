package chap3;

/*
 * a = 10 : a������ 10 ����
 * a == 10 : a������ ���� 10����
 * 
 * */
public class OpEx7 {

	public static void main(String[] args) {
		
		int num = 100;
		
		System.out.println(num);
		num +=10;
		System.out.println(num);
		num = num + 10;
		System.out. println(num);
		num /=10;
		System.out.println(num);
		num *= 5;
		System.out.println(num);
		num -= 2+3;
		System.out.println(num);
		num %=10;
		System.out.println(num);

	}

}
