package chap5;

import java.util.Scanner;

/*
 * 
 * 10������ 2,8,10,16������ �����ϱ�
 * [���]
 * 10���� �� �Է�
 * 16
 * 
 * 16�� 2���� : 10000
 * 16�� 8���� : 20
 * 16�� 10���� : 16
 * 16�� 16���� : 10
 */
public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("10���� �� �Է��ϼ���.");
		int num = scan.nextInt();
		int divnum = num;
		int arr[] = new int[32];
		int i=0;
		int[] digit = {2,8,10,16};
		
		
		/*for (int d: digit) {
			divnum = num;
			index = 0;
			arr = new char[32];
			while(divnum>0) {
				arr[index++] = numarr[divnum % d];
				divnum /=d;
			}
			System.out.print(num + "�� " + d + "���� :");
			for(int i=index-1;i>=0;i--)
				System.out.print(arr[i]);
			System.out.println();
		}*/
		
		
		System.out.print(num+"�� 2���� : ");
		
		while(divnum !=0) {
			arr[i++] = divnum % 2;
			divnum /= 2;
		}
		for (int j=i-1;j>=0;j--) {
			System.out.print(arr[j]);
		}
		System.out.println();
		
		
		System.out.print(num+"�� 8���� : ");
		divnum = num;
		int arr8[] = new int [20];
		i=0;
		while(divnum !=0) {
			arr8[i++] = divnum % 8;
			divnum /= 8;
		}
		
		for (int j=i-1;j>=0;j--) {
			System.out.print(arr8[j]);
		}
		System.out.println();
		System.out.println(num+"�� 10���� : " +num);
		
		String arr16 = "0123456789ABCDEF";
		char[] numarr = arr16.toCharArray();
		char[] hexa = new char[10];		
		divnum = num;
		i=0;
		
		while(divnum !=0) {
			hexa[i++] = numarr[divnum%16];
			divnum /= 16;
		}		
		
		System.out.print(num+"�� 16���� : ");
		for (int j=i-1;j>=0;j--) {
			System.out.print(hexa[j]);
		}
		System.out.println();
		
	}

}
