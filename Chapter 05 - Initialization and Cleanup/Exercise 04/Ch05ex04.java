package ch05ex04;
import static slavvv1011.Print.*;

class MyClass{
    MyClass() {
        print("Default constructor is working...");
    }
    MyClass(String s) {
    	print("Overloaded constructor is working..., the argument is: " + s);
    }
}

public class Ch05ex04 {
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		MyClass obj2 = new MyClass("XYZ");
	}   
}

/* Output:
Default constructor is working...
Overloaded constructor is working..., the argument is: XYZ
*/