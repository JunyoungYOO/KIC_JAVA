package chap9;

class MyException1 extends Exception{}
class MyException2 extends MyException1{}
class MyException3 extends Exception{}
public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			if(true)
				throw new MyException3(); //Exception ����ó�� ���
			else
				throw new MyException2(); //MyException1 ����ó�� ���
		} catch(MyException1 e) {	//�ǹ̰� ���� ������
			System.out.println("MyException1 ����ó�� ");
		} catch(Exception e) {
			System.out.println("Exception ����ó�� ");
		}

	}

}
