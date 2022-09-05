package chap2;

public class Test1 {
	public static void main(String[] args) {
     //1. 잘못된 문장을 골라내고 그 이유를 설명하시오.		
	    char       a='a';   //정상
//		char       b="a";    // 오류. char <- String
	    String     c="a";   //정상
	    //String     d='a';		String <- char 
	    //char       e='ab'; 	// char는 한개문자만 저장가능
	    String     f="ab"; //정상	
	    //char       g = '';		// char는 한개문자만 저장 가능'' -> ""
	    String     h = ""; //정상 빈문자열 가능

	    //byte   var1 = 128;	byte 표현범위를 넘어간 값
	    short var1 = (byte)128;		// 오류 -128~127 저장 가능  
	    short  var2 = 128; 
		//int    var3 = 28L;	 집어 넣는 값이 long형 값이라 (int)해줘야함
		int var3 = (int)28L;			
		long   var4 = 128L; 	//정상		
		
		// float var5 = 1.2		 앞에(float)를 해줘야함
		//float  var5 = (float)1.2;
		float  var5 = 1.2f;
		double var6 = 1.2;  //정상 
	     
		float var9 = '1';
		System.out.println("var1="+var1);
	}
}
/*
2.   변수를 선언하기 위해서는 자료형과 변수의 이름을 결정해야합니다. 
      변수 이름으로 사용할 수 있는 것을 고르시오.
      변수이름으로 사용할 수 없는 이유를 작성하시오
      
      A. false		예약어라 불가능
      B. default 	안됨
      C. _var		가능
      D. a-class	-는 허용 가능한 특수문자 아님 
      
3. 변수를 선언하기 위해서는 자료형과 변수의 이름을 결정해야합니다.
   변수 이름으로 사용할 수 있는 것을 고르시오.
   
    A. s#arp  		특수문자는 _, $만 허용
    B. static  		구조체 언어
    C. _class 		가능
    D. class 		클래스
    
4. byte 형을 저장할 수 있는 데이터 값의 허용 범위는 얼마입니까?
     
     -128 ~ 127    
     
 
5. float 형 변수 선언이 올바르게 된 것을 모두 고르시오.
   A. float f1 = 1F;   --> 올바름
   B. float f2 = 1.0;  --> double형임 (float) 해줘야함
   C. float f3 = '1';  --> 아스키코드로 나옴
   D. float f4 = "1";  --> string형 선언
   E. float f5 = 1.0d; --> double형 선언
*/