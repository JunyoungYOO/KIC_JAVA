package chap9;
/*
 * �������̵������� ����ó�� : �θ�Ŭ������ ����ó���� ���ų� ��������(����) ����
 */

class Parent {
	public void method() throws RuntimeException{
		System.out.println("Parent Ŭ������ method()");
	}
}

class Child extends Parent{
	public void method() throws RuntimeException{
		System.out.println("Child Ŭ������ method()");
	}
}

public class ExceptionEx6 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}
