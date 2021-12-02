package com.jowarindia.modal;

public class MetalPartDetails {
	private int partNo;
	private String partDesc;
	private float mrp;
	private int depreciation;
	private int qty;
	private double total;
	private float claimedValue;
	private String serviceType;
	private float approvalAmount;
	private String replace;
	private String repaire;
	
	public MetalPartDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public String print() {
		return "MetalPartDetails [partNo=" + partNo + ", partDesc=" + partDesc + ", mrp=" + mrp + ", depreciation="
				+ depreciation + ", qty=" + qty + ", total=" + total + ", claimedValue=" + claimedValue
				+ ", serviceType=" + serviceType + ", approvalAmount=" + approvalAmount + ", replace=" + replace
				+ ", repaire=" + repaire + "]";
	}


	public MetalPartDetails(int partNo, String partDesc, float mrp, int depreciation, int qty, double total,
			float claimedValue, String serviceType, float approvalAmount, String replace, String repaire) {
		super();
		this.partNo = partNo;
		this.partDesc = partDesc;
		this.mrp = mrp;
		this.depreciation = depreciation;
		this.qty = qty;
		this.total = total;
		this.claimedValue = claimedValue;
		this.serviceType = serviceType;
		this.approvalAmount = approvalAmount;
		this.replace = replace;
		this.repaire = repaire;
	}

	public int getPartNo() {
		return partNo;
	}

	public void setPartNo(int partNo) {
		this.partNo = partNo;
	}

	public String getPartDesc() {
		return partDesc;
	}

	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}

	public float getMrp() {
		return mrp;
	}

	public void setMrp(float mrp) {
		this.mrp = mrp;
	}

	public int getDepreciation() {
		return depreciation;
	}

	public void setDepreciation(int depreciation) {
		this.depreciation = depreciation;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public float getClaimedValue() {
		return claimedValue;
	}

	public void setClaimedValue(float claimedValue) {
		this.claimedValue = claimedValue;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public float getApprovalAmount() {
		return approvalAmount;
	}

	public void setApprovalAmount(float approvalAmount) {
		this.approvalAmount = approvalAmount;
	}

	public String getReplace() {
		return replace;
	}

	public void setReplace(String replace) {
		this.replace = replace;
	}

	public String getRepaire() {
		return repaire;
	}

	public void setRepaire(String repaire) {
		this.repaire = repaire;
	}
	
	

}
