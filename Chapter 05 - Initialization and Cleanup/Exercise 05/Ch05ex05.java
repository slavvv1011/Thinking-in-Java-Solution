package ch05ex05;
import static slavvv1011.Print.*;

class Dog{
    void bark(){
        System.out.println("Ow !");
    }
    void bark(int i){
    	System.out.println("Dog barks " + i + " times");
    }
    void bark(char c){
    	System.out.println("Dog makes a strange sound: " + c + "...");
    }
    void bark(int i,char c){
    	print("Dog barks " + i + " times and makes a strange sound: " + c + "...");
    }
    void bark(long l){
    	System.out.println("Dog is sleeping for sooooo long...");
    }
}

public class Ch05ex05 {

    public static void main(String[] args) {
       Dog dog1 = new Dog();
       dog1.bark();
       dog1.bark(5);
       dog1.bark('z');
       dog1.bark(8,'s');
       dog1.bark(3L);
    }
    
}

/*
Ow !
Dog barks 5 times
Dog makes a strange sound: z...
Dog barks 8 times and makes a strange sound: s...
Dog is sleeping for sooooo long...
*/