package com.typesofClasses;

//Normal class
public class Employee {
	
   //variables(all variables)
	int id;
	String name;
	double salary;
	
	static String country;
   //constructors
	public Employee() {
		
	}   
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
   //blocks
	{
	id=5678;
	name="Ayesha";
	salary=78958.90;
	}
	static {
	 country="India";
	}
   //method
	public void getDetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(country);
	}
	public static void getcountry() {
		System.out.println(country);
	}
	/**
	 * The abstract method getDetails() in type Employee can only be 
	 * defined by an abstract class
	 */
	
	//public abstract void getDetails();
	
	//main
	public static void main(String[] args) {
		
	//object
	  Employee employee1=new Employee();
	  Employee employee2=new Employee(7865,"Saba",88654.90);
	}

}
