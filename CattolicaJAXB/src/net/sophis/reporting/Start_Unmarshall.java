package net.sophis.reporting;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class Start_Unmarshall {
 
	public static void main(String[] args) {
 
		try {
			JAXBContext jc = JAXBContext.newInstance(Root.class);

	        Unmarshaller unmarshaller = jc.createUnmarshaller();
	        File xml = new File("trade.xml");
	        
	        @SuppressWarnings("unchecked")
			JAXBElement<Root> jaxbElement = (JAXBElement<Root>) unmarshaller.unmarshal(xml);
	        Root page = jaxbElement.getValue();
	        Trades t =  page.getDefault0().get(0).getResult().getTradegroup().get(0).getTrades();
	        //List<Tradegroup> t = page.getTradegroup();	        	        
	        
	        for (int i=0;i<t.getTrade().size();i++)
	        {
	        	System.out.println(t.getTrade().get(i).getEntity().getValue());
	        	System.out.println(t.getTrade().get(i).getPortfolio().getValue());
	        	System.out.println(t.getTrade().get(i).getTradeId().getValue());
	        	System.out.println();
	        }
	        
			//System.out.println(root1.getDefault0().get(0).getType());
			/*System.out.println("Company Name: " + company.getCompanyName());
			System.out.println("Company Address: " + company.getCompanyAddress());
			System.out.println("Company Foundation Date: " + company.getCompanyFoundationDate());
			ArrayList<Department> departmentList = (ArrayList<Department>) company.getCompanyDepartments();
			departmentList.forEach((department) -> {
 
				System.out.println("\tDepartment Name: "+department.getDepartmentName());
 
				ArrayList<Employee> employeeList = (ArrayList<Employee>) department.getDepartmentEmployees();
				employeeList.forEach(employee -> System.out.println("\t\tEmployee Name: "+employee.getEmployeeName()));
 
			})*/;
 
		} catch (JAXBException jaxbException) {
			jaxbException.printStackTrace();
		}
 
	}
 
}

