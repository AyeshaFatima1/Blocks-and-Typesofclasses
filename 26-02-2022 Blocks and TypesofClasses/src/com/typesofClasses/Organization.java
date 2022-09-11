package com.typesofClasses;

//Abstract class
public abstract class Organization {
	
   //variables(all variables)
	int id;
	String name;
		
	static String country;
   //constructors
	public Organization() {
		
	}   
	public Organization(int id, String name) {
		this.id = id;
		this.name = name;
	}
   //blocks
	{
	id=5678;
	name="IBM";
		}
	static {
	 country="India";
	}
   //method
	public void getorgDetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(country);
	}
	public static void getcountryinfo() {
		System.out.println(country);
	}
	//**abstract methods(Abstract methods do not have/specify a body/implementation)
		public abstract void getDetails();
		
	//main
	public static void main(String[] args) {
		
	//object
		//no objects
		
		//Cannot instantiate/create the type Organisation
		//Organisation organisation = new Organisation();
			}
			

}
