//package com.highradius.model;
//
//public class Invoice {
//	private int slNo;
//    private int customerOrderID;
//    private int salesOrg;
//    private String distributionChannel;
//    private int companyCode;
//    private String orderCreationDate;
//    private int orderAmount;
//    private String orderCurrency;
//    private int customerNumber;
//    private int amountInUsd;
//
//
//
//
//	public Invoice(int slNo, int customerOrderID, int salesOrg, String distributionChannel, int companyCode,
//			String orderCreationDate, int orderAmount, String orderCurrency, int customerNumber, int amountInUsd) {
//		super();
//		this.slNo = slNo;
//		this.customerOrderID = customerOrderID;
//		this.salesOrg = salesOrg;
//		this.distributionChannel = distributionChannel;
//		this.companyCode = companyCode;
//		this.orderCreationDate = orderCreationDate;
//		this.orderAmount = orderAmount;
//		this.orderCurrency = orderCurrency;
//		this.customerNumber = customerNumber;
//		this.amountInUsd = amountInUsd;
//	}
//
//
//
//
//	public int getSlNo() {
//		return slNo;
//	}
//
//
//
//
//	public void setSlNo(int slNo) {
//		this.slNo = slNo;
//	}
//
//
//
//
//	public int getCustomerOrderID() {
//		return customerOrderID;
//	}
//
//
//
//
//	public void setCustomerOrderID(int customerOrderID) {
//		this.customerOrderID = customerOrderID;
//	}
//
//
//
//
//	public int getSalesOrg() {
//		return salesOrg;
//	}
//
//
//
//
//	public void setSalesOrg(int salesOrg) {
//		this.salesOrg = salesOrg;
//	}
//
//
//
//
//	public String getDistributionChannel() {
//		return distributionChannel;
//	}
//
//
//
//
//	public void setDistributionChannel(String distributionChannel) {
//		this.distributionChannel = distributionChannel;
//	}
//
//
//
//
//	public int getCompanyCode() {
//		return companyCode;
//	}
//
//
//
//
//	public void setCompanyCode(int companyCode) {
//		this.companyCode = companyCode;
//	}
//
//
//
//
//	public String getOrderCreationDate() {
//		return orderCreationDate;
//	}
//
//
//
//
//	public void setOrderCreationDate(String orderCreationDate) {
//		this.orderCreationDate = orderCreationDate;
//	}
//
//
//
//
//	public int getOrderAmount() {
//		return orderAmount;
//	}
//
//
//
//
//	public void setOrderAmount(int orderAmount) {
//		this.orderAmount = orderAmount;
//	}
//
//
//
//
//	public String getOrderCurrency() {
//		return orderCurrency;
//	}
//
//
//
//
//	public void setOrderCurrency(String orderCurrency) {
//		this.orderCurrency = orderCurrency;
//	}
//
//
//
//
//	public int getCustomerNumber() {
//		return customerNumber;
//	}
//
//
//
//
//	public void setCustomerNumber(int customerNumber) {
//		this.customerNumber = customerNumber;
//	}
//
//
//
//
//	public int getAmountInUsd() {
//		return amountInUsd;
//	}
//
//
//
//
//	public void setAmountInUsd(int amountInUsd) {
//		this.amountInUsd = amountInUsd;
//	}
//
//
//
//
//	public String toString() {
//	    return "Invoice{" +
//	            "slNo='" + slNo + '\'' +
//	            ", customerOrderID='" + customerOrderID + '\'' +
//	            ", salesOrg='" + salesOrg + '\'' +
//	            ", distributionChannel='" + distributionChannel + '\'' +
//	            ", companyCode='" + companyCode + '\'' +
//	            ", orderCreationDate='" + orderCreationDate + '\'' +
//	            ", orderAmount='" + orderAmount + '\'' +
//	            ", orderCurrency='" + orderCurrency + '\'' +
//	            ", customerNumber='" + customerNumber + '\'' +
//	            ", amountInUsd='" + amountInUsd + '\'' +
//	            '}';
//	}
//    
//}






//---------------------------------------------------------------------


package com.highradius.model;

public class Invoice {
    private int slNo;
    private int customerOrderID;
    private int salesOrg;
    private String distributionChannel;
    private String division;
    private double releasedCreditValue;
    private String purchaseOrderType;
    private int companyCode;
    private String orderCreationDate;
    private String orderCreationTime;
    private String creditControlArea;
    private int soldToParty;
    private double orderAmount;
    private String requestedDeliveryDate;
    private String orderCurrency;
    private String creditStatus;
    private int customerNumber;
    private double amountInUsd;
    private String uniqueCustId;

    public Invoice(int slNo, int customerOrderID, int salesOrg, String distributionChannel, String division,
                   double releasedCreditValue, String purchaseOrderType, int companyCode, String orderCreationDate,
                   String orderCreationTime, String creditControlArea, int soldToParty, double orderAmount,
                   String requestedDeliveryDate, String orderCurrency, String creditStatus, int customerNumber,
                   double amountInUsd, String uniqueCustId) {
        this.slNo = slNo;
        this.customerOrderID = customerOrderID;
        this.salesOrg = salesOrg;
        this.distributionChannel = distributionChannel;
        this.division = division;
        this.releasedCreditValue = releasedCreditValue;
        this.purchaseOrderType = purchaseOrderType;
        this.companyCode = companyCode;
        this.orderCreationDate = orderCreationDate;
        this.orderCreationTime = orderCreationTime;
        this.creditControlArea = creditControlArea;
        this.soldToParty = soldToParty;
        this.orderAmount = orderAmount;
        this.requestedDeliveryDate = requestedDeliveryDate;
        this.orderCurrency = orderCurrency;
        this.creditStatus = creditStatus;
        this.customerNumber = customerNumber;
        this.amountInUsd = amountInUsd;
        this.uniqueCustId = uniqueCustId;
    }

    // Getter and setter methods

    public int getSlNo() {
        return slNo;
    }

    public void setSlNo(int slNo) {
        this.slNo = slNo;
    }

    public int getCustomerOrderID() {
        return customerOrderID;
    }

    public void setCustomerOrderID(int customerOrderID) {
        this.customerOrderID = customerOrderID;
    }

    public int getSalesOrg() {
        return salesOrg;
    }

    public void setSalesOrg(int salesOrg) {
        this.salesOrg = salesOrg;
    }

    public String getDistributionChannel() {
        return distributionChannel;
    }

    public void setDistributionChannel(String distributionChannel) {
        this.distributionChannel = distributionChannel;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public double getReleasedCreditValue() {
        return releasedCreditValue;
    }

    public void setReleasedCreditValue(double releasedCreditValue) {
        this.releasedCreditValue = releasedCreditValue;
    }

    public String getPurchaseOrderType() {
        return purchaseOrderType;
    }

    public void setPurchaseOrderType(String purchaseOrderType) {
        this.purchaseOrderType = purchaseOrderType;
    }

    public int getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(int companyCode) {
        this.companyCode = companyCode;
    }

    public String getOrderCreationDate() {
        return orderCreationDate;
    }

    public void setOrderCreationDate(String orderCreationDate) {
        this.orderCreationDate = orderCreationDate;
    }

    public String getOrderCreationTime() {
        return orderCreationTime;
    }

    public void setOrderCreationTime(String orderCreationTime) {
        this.orderCreationTime = orderCreationTime;
    }

    public String getCreditControlArea() {
        return creditControlArea;
    }

    public void setCreditControlArea(String creditControlArea) {
        this.creditControlArea = creditControlArea;
    }

    public int getSoldToParty() {
        return soldToParty;
    }

    public void setSoldToParty(int soldToParty) {
        this.soldToParty = soldToParty;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getRequestedDeliveryDate() {
        return requestedDeliveryDate;
    }

    public void setRequestedDeliveryDate(String requestedDeliveryDate) {
        this.requestedDeliveryDate = requestedDeliveryDate;
    }

    public String getOrderCurrency() {
        return orderCurrency;
    }

    public void setOrderCurrency(String orderCurrency) {
        this.orderCurrency = orderCurrency;
    }

    public String getCreditStatus() {
        return creditStatus;
    }

    public void setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public double getAmountInUsd() {
        return amountInUsd;
    }

    public void setAmountInUsd(double amountInUsd) {
        this.amountInUsd = amountInUsd;
    }

    public String getUniqueCustId() {
        return uniqueCustId;
    }

    public void setUniqueCustId(String uniqueCustId) {
        this.uniqueCustId = uniqueCustId;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "slNo=" + slNo +
                ", customerOrderID=" + customerOrderID +
                ", salesOrg=" + salesOrg +
                ", distributionChannel='" + distributionChannel + '\'' +
                ", division='" + division + '\'' +
                ", releasedCreditValue=" + releasedCreditValue +
                ", purchaseOrderType='" + purchaseOrderType + '\'' +
                ", companyCode=" + companyCode +
                ", orderCreationDate='" + orderCreationDate + '\'' +
                ", orderCreationTime='" + orderCreationTime + '\'' +
                ", creditControlArea='" + creditControlArea + '\'' +
                ", soldToParty=" + soldToParty +
                ", orderAmount=" + orderAmount +
                ", requestedDeliveryDate='" + requestedDeliveryDate + '\'' +
                ", orderCurrency='" + orderCurrency + '\'' +
                ", creditStatus='" + creditStatus + '\'' +
                ", customerNumber=" + customerNumber +
                ", amountInUsd=" + amountInUsd +
                ", uniqueCustId='" + uniqueCustId + '\'' +
                '}';
    }
}
