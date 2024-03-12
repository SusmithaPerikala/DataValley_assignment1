import java.io.*;
import java.util.*;

class Animal{
   public void makeSound(){
        System.out.println("Every Animal has unique sound.");
    }
}
class Dog extends Animal{
   public  void makeSound(){
        System.out.println("Dog Barks!!");
    }
}
class Cat extends Animal{
    public void makeSound(){
            System.out.println("Cat Meows!!");
    }
}
public class Main
{
	public static void main(String[] args) {
	  Dog d=new Dog();
	  d.makeSound();
	  Cat c=new Cat();
	  c.makeSound();
		
	}
}
