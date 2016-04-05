package com.Composite.Model;

public class Unit implements Facility{

	private int id;
	private String name;
	
	public Unit(int Id, String name){
		this.id = Id;
		this.name = name;
	}
	
	@Override
	public void listDetails() {
		System.out.println("Suite: " + this.id + " has tenant: " + this.name);
	}

}
