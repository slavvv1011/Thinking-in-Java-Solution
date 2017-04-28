package ch03ex14;
import static slavvv1011.Print.*;

public class Ch03ex14 {
	public static void compareStrings(String a, String b) {
		print(a + ", " + b + " :");
		print("a == b : " + (a == b));
		print("a.equals(b) : " + a.equals(b));
		print("b.equals(a) : " + b.equals(a));
		print("a != b : " + (a != b));
	}
	public static void main(String[] args) {
		compareStrings("first", "second");
		print();
		compareStrings("third", "third");
		print();
		compareStrings("fourth", "FOURTH");
		print();
	}

}
