package it.cattolica.db;

import java.util.List;

import it.cattolica.db.entities.Payment;
import it.cattolica.db.impl.ExtractPayments;

public class MainApp {
	  public static void main(String[] args) {
		// Using Oracle Database.
		  
		  
		  
//	       String configFileName = "hibernate.cfg.xml";
//	 
//	       // Create the ServiceRegistry from hibernate-xxx.cfg.xml
//	       ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()//
//	               .configure(configFileName).build();
//	 
//	       // Create a metadata sources using the specified service registry.
//	       Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
//	 
//	       SchemaExport export = AutoGenerateTables.getSchemaExport();
//	 
////	       System.out.println("Drop Database...");
////	       // Drop Database
////	       AutoGenerateTables.dropDataBase(export, metadata);
//	 
//	       System.out.println("Create Database...");
//	       // Create tables
//	       AutoGenerateTables.createDataBase(export, metadata);
		  
		  
		  ExtractPayments ep = new ExtractPayments();
		  List<Payment> payments = ep.getPayments();
		  
		  for(Payment payment : payments){
			  System.out.println("Payment ID: " + payment.getPaymentId());
		  }
	  }
	}
