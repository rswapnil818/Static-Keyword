package com.Static;

public class Variable_static {
 int Id;
 String Name;
 int Age;
 
 void disp(){
	 System.out.println("ID : "+Id+ " NAME : "+Name + " AGE : "+Age);
 }
 Variable_static(int id, String name,int age){
	 this.Id=id;
	 this.Name=name;
	 this.Age=age;
	 
	 
 }
 public static void main(String[] args) {
	 Variable_static vs=new Variable_static( 1,"Sachin",23);
	 vs.disp();
}
}
