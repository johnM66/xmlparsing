package com.mypackage.bean;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import javax.xml.bind.JAXBException;

public class JaxBClient {

	public static void main(String[] args) {
	
		EmployeeAddress address = new EmployeeAddress();
		address.setStreet("1234, 27G KOLkata");
		address.setCity("Kolkata");
		address.setState("West bengal");
		address.setZip(700066);

		EmployeeBean employee = new EmployeeBean(1, "Manas", "Development", address);

		try {

			JAXBhandler.jaxBmarshal(employee, new File("employee.xml"));

			EmployeeBean employee2 = JAXBhandler.unmarshal(new File("employee.xml"));
			System.out.println(employee2);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
