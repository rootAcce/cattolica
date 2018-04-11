package it.cattolica.ws.utils;

import java.util.List;

import it.cattolica.db.entities.Payment;

public interface GenerateCSVSAP {
	
	public boolean createCSV(List<Payment> payments);

}
