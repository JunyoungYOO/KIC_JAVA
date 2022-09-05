package chap4;

public class LoopEx4 {

	public static void main(String[] args) {

		for (int i=2;i<=9;i++) {
			System.out.print("\n"+i+"´Ü");
			for (int j=2;j<=9;j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
	}

}
