package com.Composite.View;


import com.Composite.Model.Building;
import com.Composite.Model.Unit;

public class Test {


	
	public static void main(String[] args) {
		
		//blocks in example
		Unit tenant1 = new Unit (101,"Tenant1");
		Unit tenant2 = new Unit (105,"Tenant2");
		Unit tenant3 = new Unit (115,"Tenant3");
		Unit tenant4 = new Unit (120,"Tenant4");
		Unit tenant5 = new Unit (215,"Tenant5");
		Unit tenant6 = new Unit (320,"Tenant6");
		Unit tenant7 = new Unit (500,"Tenant7");
		Unit tenant8 = new Unit (600,"Tenant8");
		
		//initialize structure in example
		Building bldg1 = new Building (1,"Building1");
		Building bldg2 = new Building (2,"Building2");
		Building bldg3 = new Building (3,"Building3");
		Building bldg4 = new Building (4,"Building4");
		
		//compose (composite) the groups
		bldg1.addFacility(tenant1);
		bldg1.addFacility(tenant5);
		bldg1.addFacility(tenant6);
		
		bldg2.addFacility(tenant2);		
		bldg2.addFacility(tenant3);
		
		bldg3.addFacility(tenant4);
		
		bldg4.addFacility(tenant7);
		bldg4.addFacility(tenant8);
		
		//call inherited method
		bldg1.listDetails();
		bldg2.listDetails();
		bldg3.listDetails();
		bldg4.listDetails();

	}

}
