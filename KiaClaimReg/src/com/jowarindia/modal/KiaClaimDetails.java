package com.jowarindia.modal;

public class KiaClaimDetails {
	
	private int kiaClmId;
	private int vehicleRegNo;
	private String typesOfClaim;
	private int workshopId;
	private String dateOfIntimation;
	private String serviceAdvisorName;
	private String causeOfAccident;
	private double serviceAdvisorContactNo;
	private int estimateNo;
	private String recordStatus;
	private String dealermailid;
	private double dealerMobileNo;
	public int getKiaClmId() {
		return kiaClmId;
	}
	public KiaClaimDetails() {
		super();
		
	}
	public KiaClaimDetails(int kiaClmId, int vehicleRegNo, String typesOfClaim, int workshopId, String dateOfIntimation,
			String serviceAdvisorName, String causeOfAccident, double serviceAdvisorContactNo, int estimateNo,
			String recordStatus, String dealermailid, double dealerMobileNo) {
		super();
		this.kiaClmId = kiaClmId;
		this.vehicleRegNo = vehicleRegNo;
		this.typesOfClaim = typesOfClaim;
		this.workshopId = workshopId;
		this.dateOfIntimation = dateOfIntimation;
		this.serviceAdvisorName = serviceAdvisorName;
		this.causeOfAccident = causeOfAccident;
		this.serviceAdvisorContactNo = serviceAdvisorContactNo;
		this.estimateNo = estimateNo;
		this.recordStatus = recordStatus;
		this.dealermailid = dealermailid;
		this.dealerMobileNo = dealerMobileNo;
	}
	public void setKiaClmId(int kiaClmId) {
		this.kiaClmId = kiaClmId;
	}
	public int getVehicleRegNo() {
		return vehicleRegNo;
	}
	public void setVehicleRegNo(int vehicleRegNo) {
		this.vehicleRegNo = vehicleRegNo;
	}
	public String getTypesOfClaim() {
		return typesOfClaim;
	}
	public void setTypesOfClaim(String typesOfClaim) {
		this.typesOfClaim = typesOfClaim;
	}
	public int getWorkshopId() {
		return workshopId;
	}
	public void setWorkshopId(int workshopId) {
		this.workshopId = workshopId;
	}
	public String getDateOfIntimation() {
		return dateOfIntimation;
	}
	public void setDateOfIntimation(String dateOfIntimation) {
		this.dateOfIntimation = dateOfIntimation;
	}
	public String getServiceAdvisorName() {
		return serviceAdvisorName;
	}
	public void setServiceAdvisorName(String serviceAdvisorName) {
		this.serviceAdvisorName = serviceAdvisorName;
	}
	public String getCauseOfAccident() {
		return causeOfAccident;
	}
	public void setCauseOfAccident(String causeOfAccident) {
		this.causeOfAccident = causeOfAccident;
	}
	public double getServiceAdvisorContactNo() {
		return serviceAdvisorContactNo;
	}
	public void setServiceAdvisorContactNo(double serviceAdvisorContactNo) {
		this.serviceAdvisorContactNo = serviceAdvisorContactNo;
	}
	public int getEstimateNo() {
		return estimateNo;
	}
	public void setEstimateNo(int estimateNo) {
		this.estimateNo = estimateNo;
	}
	public String getRecordStatus() {
		return recordStatus;
	}
	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}
	public String getDealermailid() {
		return dealermailid;
	}
	public void setDealermailid(String dealermailid) {
		this.dealermailid = dealermailid;
	}
	public double getDealerMobileNo() {
		return dealerMobileNo;
	}
	public void setDealerMobileNo(double dealerMobileNo) {
		this.dealerMobileNo = dealerMobileNo;
	}

}
