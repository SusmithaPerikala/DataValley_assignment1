import java.io.*;
import java.util.*;

public class MathOperations{
    
    public int addition(int val1,int val2){
        return val1+val2;
    }
    
    public double addition(double val1,double val2,double val3){
        return val1+val2+val3;
    }
    
    public String addition(String val1,String val2){
        return val1.concat(val2);
    }

	public static void main(String[] args) {
	    
	  MathOperations obj1=new MathOperations();
	  
	  int s1=obj1.addition(1,3);
	  double s2=obj1.addition(1.0,2.0,3.0);
	  String s3=obj1.addition("JAVA ","FULLSTACK");
	  
	  System.out.println(s1);
	  System.out.println(s2);
	  System.out.println(s3);
	 
}
}
