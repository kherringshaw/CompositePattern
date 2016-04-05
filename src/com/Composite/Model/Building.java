package com.Composite.Model;

import java.util.ArrayList;

public class Building implements Facility{

	private int id;
	private String bldgName;
	ArrayList<Facility> facilities = new ArrayList<Facility>();
	
	public Building(int id, String bldgName){
		this.setId(id);
		this.setBldgName(bldgName);
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBldgName() {
		return bldgName;
	}

	public void setBldgName(String bldgName) {
		this.bldgName = bldgName;
	}
	
	public void addFacility(Facility facility){
		facilities.add(facility);
	}
	
	public boolean removeFacility(Facility facility){
		return (facilities.remove(facility));
		
	}
	@Override
	public void listDetails() {
		System.out.println(getBldgName());
		for (Facility facility : facilities){
			facility.listDetails();
			
		}
		System.out.println();;
		
	}

}
