package chap5;
/*
 * Command ���ڸ� �Է¹޾� �ڸ����� ���� ����ϱ�
 * 
 * java Exam3 12345
 * 
 * 1+2+3+4+5 = 15
 * */
public class Exam3 {

	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("command ���ο� ���ڸ� �Է��ϼ���.");
			return;
		}
		
		int sum = 0;
		String nums = args[0];

		for(int i=0;i<nums.length();i++) {
			sum += nums.charAt(i)-'0';
			System.out.print(nums.charAt(i) + (i==nums.length()-1?"=":"+"));
		}
		
		System.out.println(sum);
	}

}
