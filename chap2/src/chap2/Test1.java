package chap2;

public class Test1 {
	public static void main(String[] args) {
     //1. �߸��� ������ ��󳻰� �� ������ �����Ͻÿ�.		
	    char       a='a';   //����
//		char       b="a";    // ����. char <- String
	    String     c="a";   //����
	    //String     d='a';		String <- char 
	    //char       e='ab'; 	// char�� �Ѱ����ڸ� ���尡��
	    String     f="ab"; //����	
	    //char       g = '';		// char�� �Ѱ����ڸ� ���� ����'' -> ""
	    String     h = ""; //���� ���ڿ� ����

	    //byte   var1 = 128;	byte ǥ�������� �Ѿ ��
	    short var1 = (byte)128;		// ���� -128~127 ���� ����  
	    short  var2 = 128; 
		//int    var3 = 28L;	 ���� �ִ� ���� long�� ���̶� (int)�������
		int var3 = (int)28L;			
		long   var4 = 128L; 	//����		
		
		// float var5 = 1.2		 �տ�(float)�� �������
		//float  var5 = (float)1.2;
		float  var5 = 1.2f;
		double var6 = 1.2;  //���� 
	     
		float var9 = '1';
		System.out.println("var1="+var1);
	}
}
/*
2.   ������ �����ϱ� ���ؼ��� �ڷ����� ������ �̸��� �����ؾ��մϴ�. 
      ���� �̸����� ����� �� �ִ� ���� ���ÿ�.
      �����̸����� ����� �� ���� ������ �ۼ��Ͻÿ�
      
      A. false		������ �Ұ���
      B. default 	�ȵ�
      C. _var		����
      D. a-class	-�� ��� ������ Ư������ �ƴ� 
      
3. ������ �����ϱ� ���ؼ��� �ڷ����� ������ �̸��� �����ؾ��մϴ�.
   ���� �̸����� ����� �� �ִ� ���� ���ÿ�.
   
    A. s#arp  		Ư�����ڴ� _, $�� ���
    B. static  		����ü ���
    C. _class 		����
    D. class 		Ŭ����
    
4. byte ���� ������ �� �ִ� ������ ���� ��� ������ ���Դϱ�?
     
     -128 ~ 127    
     
 
5. float �� ���� ������ �ùٸ��� �� ���� ��� ���ÿ�.
   A. float f1 = 1F;   --> �ùٸ�
   B. float f2 = 1.0;  --> double���� (float) �������
   C. float f3 = '1';  --> �ƽ�Ű�ڵ�� ����
   D. float f4 = "1";  --> string�� ����
   E. float f5 = 1.0d; --> double�� ����
*/