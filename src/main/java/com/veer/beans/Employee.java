package com.veer.beans;

public class Employee {
	
	private int id;  
	private String name;  
	private Address address; 
	  
	public Employee() {
		System.out.println("Default Constructor");
	}  
	  
	public Employee(int id, String name, Address address) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.address = address;  
	}  
	  
	public void show(){  
		System.out.println("Sample change for git");
	    System.out.println(id+" "+name);  
	    System.out.println(address.toString());  
	}  

}
