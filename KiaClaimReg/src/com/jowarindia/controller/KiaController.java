package com.jowarindia.controller;

import com.jowarindia.modal.KiaClaimDetails;

public class KiaController {

	public static void main(String[] args) {
		KiaClaimDetails k=new KiaClaimDetails();
		
		k.setKiaClmId(11);
		System.out.println("Claim id :- "+k.getKiaClmId());
		
		k.setVehicleRegNo(101);
		System.out.println("vehicle Reg No :- "+k.getVehicleRegNo());
		
		k.setTypesOfClaim("Health insurance");
		System.out.println("Type of claim :- "+k.getTypesOfClaim());
		
		k.setWorkshopId(22);
		System.out.println("workshop Id :- "+k.getWorkshopId());
		
		k.setDateOfIntimation("1 jan 2022");
		System.out.println("Date od Intimation :- "+k.getDateOfIntimation());
		
		k.setServiceAdvisorName("Samadhan garde");
		System.out.println("Service Advisor Name :- "+k.getServiceAdvisorName());
	
		k.setCauseOfAccident("Heavy Rain");
		System.out.println("Cause of Accident :- "+k.getCauseOfAccident());
		
		k.setServiceAdvisorContactNo(989056);
		System.out.println("Contact No :- "+k.getServiceAdvisorContactNo());
		
		k.setEstimateNo(33);
		System.out.println("Estimate No :- "+k.getEstimateNo());
		
		k.setRecordStatus("Proceed");
		System.out.println("Status :- "+k.getRecordStatus());
		
	    k.setDealermailid("pratikshahegade@gmail.com");
	    System.out.println("Mail id "+k.getDealermailid());
	    	
	    k.setDealerMobileNo(89576889);
	    System.out.println("Contact No "+k.getDealerMobileNo());
	
		
		

	}

}
