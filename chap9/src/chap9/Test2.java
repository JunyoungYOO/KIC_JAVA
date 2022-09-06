package chap9;

import java.util.InputMismatchException;
import java.util.Scanner;

/* 1부터 100까지 중 임의의 숫자를 컴퓨터가 저장하고, 
 * 값을 입력받아 저장된 값을 맞추는 프로그램을 작성하기
 *
 * 단 1 부터 100까지의 숫자가 아닌 경우에는 1 과 100사이의 숫자만 입력하세요를 출력
 * 숫자가 입력이 안된 경우는 숫자만 입력하세요 를 출력하고 계속 입력을 받는다.
 * 정답을 맞춘경우 프로그램을 종료
 * 종료 전 몇번의 입력만에 숫자를 맞추었는지 출력하기.
 * 단 입력 오류된 입력도 입력 건수에 포함된다.
 * 
[결과]
1부터 100까지의 숫자를 입력하세요
500
1부터 100까지의 숫자만 입력하세요
1부터 100까지의 숫자를 입력하세요
a
a는 숫자가 아닙니다.
1부터 100까지의 숫자를 입력하세요
50
큰수를 입력하세요
1부터 100까지의 숫자를 입력하세요
75
큰수를 입력하세요
1부터 100까지의 숫자를 입력하세요
85
작은수를 입력하세요
1부터 100까지의 숫자를 입력하세요
80
큰수를 입력하세요
1부터 100까지의 숫자를 입력하세요
82
큰수를 입력하세요
1부터 100까지의 숫자를 입력하세요
83
83:정답입니다. 입력 횟수:8
*/       

public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean success = false;
		int num;
		int cnt=0;
		int ans = (int)(Math.random()*100)+1;
		
		while(!success) {
			try {
				System.out.println("1부터 100까지의 숫자를 입력하세요.");
				num = scan.nextInt();
				cnt++;
				if(num < 1 || num > 100) {
					throw new Exception("1에서 100사이의 숫자만 가능합니다."); //예외 강제 발생 
				}
				else if(num>ans) System.out.println("작은수를 입력하세요");
				else if(num<ans) System.out.println("큰수를 입력하세요.");
				else {
					System.out.println(num+": 정답입니다. 입력 횟수:"+cnt);
					success=true;
				}
			} catch (InputMismatchException e) {
				scan.next();
				System.out.println("숫자만 입력하세요.");
				cnt++;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			
		}
			
		}
		
}
