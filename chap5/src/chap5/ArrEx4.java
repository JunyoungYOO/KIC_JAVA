package chap5;

import java.util.Scanner;

// 10������ 2������
// �������� ���� ��� ������ �������� ������ ���� �������� ��½� ��ȯ �Ϸ�
// 2 10 
// 2  5  0
// 2  2  1
//    1	 0
public class ArrEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] binary = new int[32];
		
		System.out.println("10������ �Է��ϼ���.");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num, index=0;
		while(divnum !=0) {
			binary[index++] = divnum%2;
			divnum/=2;
		}
		System.out.println(num +"�� 2����: ");
		for (int i=index-1;i>=0;i--) {
			System.out.println(binary[i]);
		}
		System.out.println();
		
	}

}
