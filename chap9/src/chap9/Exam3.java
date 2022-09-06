package chap9;

class MyException1 extends Exception{}
class MyException2 extends MyException1{}
class MyException3 extends Exception{}
public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			if(true)
				throw new MyException3(); //Exception 예외처리 출력
			else
				throw new MyException2(); //MyException1 예외처리 출력
		} catch(MyException1 e) {	//의미가 없는 구문임
			System.out.println("MyException1 예외처리 ");
		} catch(Exception e) {
			System.out.println("Exception 예외처리 ");
		}

	}

}
