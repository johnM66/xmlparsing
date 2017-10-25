package com.mypackage.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Employee")
public class EmployeeBean {
	
	/*To map Java object’s property to XML element’s attribute using @XmlAttribute annotation,*/
	
	
    private int id;
    private String name;
    private String department;
    private EmployeeAddress address;
    
	public EmployeeBean() {
		super();
		
	}

	public EmployeeBean(int id, String name, String department, EmployeeAddress address) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public EmployeeAddress getEmployeeAddress() {
		return address;
	}

	public void setEmployeeAddress(EmployeeAddress address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", name=" + name + ", department=" + department + ", address=" + address
				+ "]";
	}
    
    
	
	

}
