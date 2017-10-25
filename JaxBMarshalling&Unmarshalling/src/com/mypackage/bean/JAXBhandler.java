package com.mypackage.bean;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JAXBhandler {
	public static void jaxBmarshal(EmployeeBean employee, File selectedFile)throws IOException, JAXBException {
        JAXBContext context;
        BufferedWriter writer = null;
        writer = new BufferedWriter(new FileWriter(selectedFile));
        context = JAXBContext.newInstance(EmployeeBean.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.marshal(employee, writer);
        writer.close();
    }
 
    
    public static  EmployeeBean unmarshal(File importFile) throws JAXBException {
    	EmployeeBean employee = null;
        JAXBContext context;
 
        context = JAXBContext.newInstance(EmployeeBean.class);
        Unmarshaller um = context.createUnmarshaller();
        employee = (EmployeeBean) um.unmarshal(importFile);
 
        return employee;
    }
}



