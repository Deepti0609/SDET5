package com.fanniemae.day3;

public class Device {
	
	public Device(){}
	
	public Device(int dId, String dName, double price) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.price = price;
	}
	@Override
	public boolean equals(Object arg0) {
		Device device = (Device) arg0;
		
		return  this.dId == device.dId &&
				this.dName.equals(device.dName)&&
				this.price == device.price;
		
//		if(this.dId == device.dId && this.dName.equals(device.dName)&& this.price == device.price){
//			return true;
//		}else{
//			return false;
//		}
	}

	@Override
	public int hashCode() {
	
		return this.dName.charAt(0);
		}

	@Override
	public String toString() {
		return "Device [dId=" + dId + ", dName=" + dName + ", price=" + price + "]";
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	private int dId;
	private String dName;
	private double price;


}
