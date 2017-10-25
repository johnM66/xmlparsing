package com.mypackage.bean;

import javax.xml.bind.annotation.XmlType;

/* To map Java object’s property that references a class annotated with @XmlType as a child element to XML parent element.*/
@XmlType
public class EmployeeAddress {
	private String street;
    private String city;
    private String state;
    private long zip;
    
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getZip() {
		return zip;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "EmployeeAddress [street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
    
    

}
