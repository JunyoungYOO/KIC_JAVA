package chap6;

class Card2 {
	String kind;
	int num;

	Card2(int n) {
		num = n;
	}

	Card2(String s) {
		kind = s;
	}

	Card2(String s, int n) {
		kind = s;
		num = n;
	}

	Card2(Card2 c) {
		kind = c.kind;
		num = c.num;
	}
	
	public String toString() {
		return kind + ", " + num + "\n";
	}
}

public class ConstructorEx2 {
	// alt shift r => 동일문자 잃괄변경 단축기 

	public static void main(String[] args) {
		Card2 c1 = new Card2("Spade", 1);
		Card2 c2 = new Card2(10);
		Card2 c3 = new Card2("Spade");
		Card2 c4 = new Card2(c1);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}

}
