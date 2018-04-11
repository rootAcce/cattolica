package it.cattolica.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.cattolica.db.entities.Payment;
import it.cattolica.db.impl.ExtractPayments;

@SpringBootApplication
public class CattolicaSbApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(CattolicaSbApplication.class, args);
	}
	
	
}
