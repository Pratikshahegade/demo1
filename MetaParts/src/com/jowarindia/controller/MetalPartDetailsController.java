package com.jowarindia.controller;

import com.jowarindia.modal.MetalPartDetails;

public class MetalPartDetailsController {

	public static void main(String[] args) {
		MetalPartDetails m=new MetalPartDetails(2,"Metal",3,15,50,4.3,5,"Insurance",4,"Replace","Repair");
		
		System.out.println("Metal Part Number : "+m.getPartNo());
		System.out.println("Metal Part Desc : "+m.getPartDesc());
		System.out.println("MRP : "+m.getMrp());
		System.out.println("Metal Depreciation : "+m.getDepreciation());
		System.out.println("Metal Quantity : "+m.getQty());
		System.out.println("Total Metal Part : "+m.getTotal());
		System.out.println("Claimed value is : "+m.getClaimedValue());
		System.out.println("Service type is : "+m.getServiceType());
		System.out.println("Approval Amount : "+m.getApprovalAmount());
		System.out.println("Replace with : "+m.getReplace());
		System.out.println("Repair Part : "+m.getRepaire());
		
	}

}
