package chap5;

import java.util.Scanner;

/*
������ ������ ������ ���� �����Ͽ�, ������ ������ŭ�� ���� �����ϱ�
500,100,50,10,5,1��¥�� ������ ���� 5���� �ִٰ� �����Ҷ�,
�Էµ� �ݾ��� �������� �ٲ��ְ�, ���� ������ ����ϱ�
[���] 
�ݾ��� �Է��ϼ���
36000
������ �����մϴ�.
[���] 
�ݾ��� �Է��ϼ���
3010
500��:5
100��:5
50��:0
10��:1
5��:0
1��:0
���� ���� 500��:0��
���� ���� 100��:0��
���� ���� 50��:5��
���� ���� 10��:4��
���� ���� 5��:5��
���� ���� 1��:5��
*/

public class Test10 {

	public static void main(String[] args) {
		int coin[] = {5,5,5,5,5,5};
		int arr[] = {500, 100, 50, 10, 5, 1};
		
		System.out.println("�ݾ��� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		
		if(money>3330 || money < 0) System.out.println("������ �����մϴ�.");
		else {			
			for (int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					money -= arr[i];
					coin[i]--;
					System.out.println("���� �Ӵ�" + money);
					if(money<0) {
						money += arr[i];
						coin[i]++;
						j=5;
					}
				}
				if (money==0) i=5;
			}
		}
		
		for (int i=0;i<arr.length;i++) {
			System.out.println("���� ���� " +arr[i] + "��: " + coin[i] + "��");
		}	
		
	}

}
