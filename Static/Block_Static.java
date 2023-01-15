package com.Static;

public class Block_Static {

	static int a=23; // initialize the static variable with value; 
	
	public static void disp() { 
		System.out.println("runnin static block before main method"); 
		System.out.println("Value inside static method is "+a); 
	} 
	 
	static int b; 
	 
	static // static block 
	{ 
		b=8; 
		  
		System.out.println("static block is invoked with the value"+b); // access the static variable inside static block 
		disp(); // calling the static method inside static block 
		 
	}
	

	public static void main(String[] args) {
		
	}
}



/*
 * static block {}

*static blocks are used to initialize the static data in the class, it creates static resources.
*static blocks are executed only one time, as soon as the class is loaded into memory.
*static blocks are executed before the main() method by JavaClass loader.
*A class can have multiple Static blocks, which will execute in the same sequence in which they have been written into the program.
*static {} , it is executed every time, when the class loads.
*We cannot write static blocks inside a static method and non-static method (static blocks are written separately)
*Only static variables can be accessible inside a static block.
*We can call a static method inside a static block.
*We cannot create any methods inside static block.
*Non static variables and non static methods cannot be accessible inside a static block.
*If you try to access non static variables or methods inside a static block, it gives a compile time error,
    Cannot make a static reference to the non-static method wow() from the type staticblock
 * 
 * 
 * 
 */
