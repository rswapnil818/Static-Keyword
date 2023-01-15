package com.Static;

public class Method_static {
	
	
	static int sum; // static variables 
	int n1,n2; 
	 
	static void sum(int a,int b) // static method to find the sum 
	 
	{ 
	 
	System.out.println("a and b values are--"+ a + " & "+ b); 
	sum=a+b;  
	System.out.println("SUM--"+sum); 
	} 
	 
	static { // static block 
		sum(3,5); // calling static method 
	} 
	 
	static void second() { // another static method 
		sum(1,2);// accessing static method 
	  //n1=12; cannot access non static variables inside a static method 
	   //	normal(); // cannot access non static methods inside a static method- 
		 
	} 
	 
	public void normal() { 
		n1=11; n2=22; 
		sum(n1,n2); // accessing static method inside an instance method 
	} 
	 
	public static void main(String[] args) { 
		sum(23,56); // static method 
		//Method_static.sum(9,78); // calling static method by classname 
		//Method_static.second(); // calling static method by classname 
		//Method_static sm=new Method_static(); 
		//sm.normal(); 
		//sm.sum(9,9); // If you are trying to access static method through an object of class, it shows a warning

	}


}



/*
 * JAVA static method ()

A static method belongs to the class rather than the object of a class.

A static method can be invoked without the need for creating an instance of a class.

No need to create an object to access the static methods.

Static methods can be accessed directly in static and non-static methods.
We can call other static methods inside another static methods.
We can access static methods directly inside a non static methods.
We can only access a static variables inside a static function.
Non static methods and variables cannot be accessed inside a static method, it throws a compile time error to change the modifier to static.
We can also access static methods inside a static block.
Cannot use 'this' keyword in static.
Static methods cannot be overridden , but static methods can be overloaded.
Also, we can directly access the methods from a class, by defining classname followed by dot operator with method name.

staticmet.year();

Math.sqrt(); // calling a static method by writing classname.

If you are trying to access static method through an object of class, it shows a warning

The static method sum(int, int) from the type staticmet should be accessed in a static way.

Best example of static method is 'main()' method.

When you have code that can be shared across all instances of the same class, put that portion of code into static method.

If you want to access the methods directly, then use static methods.
 * 
 * 
 * 
 */
