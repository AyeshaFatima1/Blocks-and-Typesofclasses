package com.blocks;

public class learner {
	
 // non-static variables
  int id;
  String name;
  String dob;
  String address;
 // static variables
  static String country;
  
  public learner()
  {
	  
  }
 //blocks
	//instance initializer block(we can initialize non-static variables in this block)
	{
		id=4537;
		name="Ayesha";
		dob="15 june 1999";
		address="Hyderabad";
	}
 //static block(static variables, we can initialize in this block.)
	static
	{
		country = "India";
	}
 //methods
	public void getInfo()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(dob);
		System.out.println(address);
		System.out.println(country);
	}
 //main		
	public static void main(String[] args) {
      learner l1=new learner();
      l1.getInfo();
	}

}
