package ch03ex06;

public class Ch03ex06 {
	int storage(String s) {
		return s.length() * 2;
	}
	public static void main(String[] args) {
		Ch03ex06 obj = new Ch03ex06();
		System.out.println(obj.storage("four"));
	}
}

/* Output:
8
*/