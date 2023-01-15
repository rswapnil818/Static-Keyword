package com.Static;

public class A {
	static int sum;  //Static Variable.
	int x,y;         //Instance Variable.
	
	static int p=101;
	
	 static void Addition(int a,int b){
	  
	  System.out.println("Value of a and B is "+a +" and "+b);
      sum=a+b;  //sum is static variable

	  System.out.println("Addition--"+sum);
	  
	 // add=x+y;  // we cannot access non static data into a static method.
	  
  }
  static{
	  
	  Addition(5,8);  // calling static method 
	  sub();
  }
  
  static void sub(){
	 
	  Addition(5,89);
  }
	
public static void main(String[] args) {
	
	A aa=new A();
	aa.Addition(12, 12);   //calling static method using Object of class.
	aa.sum=14;   //calling Variable using object of of class.
}
}
