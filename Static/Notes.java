package com.Static;

public class Notes {
	
	static int a=0;
	Notes(){
		a++;
		
		System.out.println(a);
		

	}
	public static void main (String args []){
		
	Notes n=new Notes();
	Notes n1=new Notes();
	Notes n2=new Notes();
	Notes n3=new Notes();
}
}
