package it.cattolica.ws.utils.impl;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import it.cattolica.db.entities.Payment;
import it.cattolica.ws.utils.GenerateCSVSAP;

public class GenerateCSVSAPImpl implements GenerateCSVSAP{
	
	public boolean createCSV(List<Payment> payments) {
		
		List<String> lines = new ArrayList<String>();
		Path file = Paths.get("/Users/radami/cattolica/CattolicaJAXB/test_creation.csv");
		try {
			for(Payment payment : payments) {
				StringBuffer line = new StringBuffer();
				line.append(payment.getPaymentId());
				line.append(";");
				line.append(payment.getFlowSide());
				line.append(";");
				line.append(payment.getAccountId());
				
				lines.add(line.toString());
			}
			Files.write(file, lines, Charset.forName("UTF-8"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

}
