package chap9;
/*
 * 다중 catch 구문
 *   - 한개의 try블럭에 여러개의 catch 블럭이 존재
 *   - try블럭내에 발생가능한 예외가 여러개 있는 경우, 예외별로 다른 예외처리 가능.
 *   - 상위 예외클래스는 catch 구문의 하단에 배치해야 한다.
 */
public class ExceptionEx2 {

	public static void main(String[] args) {
		//	System.out.println(args[0]); //try구문 밖에서 발생된 예외는 catch구문 실행 못함
		try {
			System.out.println(args[0]);	//ArrayIndexOutOfBoundsException 예외 발생
			System.out.println(10/1);		//ArtihmeticException 예외 발생
			String s = null;
			System.out.println(s.trim());	//NullPointerException 예외 발생, 전산부로 연락하세요 메시지 출력
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Command 라인에 값을 입력하세요.");
		} catch (ArithmeticException e ) {
			System.out.println("0으로 나누지 마세요");
		} catch (Exception e) {	//exception그외 모든 예외처리
			System.out.println("전산부로 연락하세요");
			e.printStackTrace();
		}
	}

}
