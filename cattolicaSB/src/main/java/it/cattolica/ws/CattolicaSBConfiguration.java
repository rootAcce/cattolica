package it.cattolica.ws;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import it.cattolica.db.impl.ExtractPayments;
import it.cattolica.ws.utils.GenerateCSVSAP;
import it.cattolica.ws.utils.SapProcessFacade;
import it.cattolica.ws.utils.impl.GenerateCSVSAPImpl;
import it.cattolica.ws.utils.impl.SapProcessFacadeImpl;
import it.cattolica.xml.unmarshall.TradeUnmarshall;
import it.cattolica.xml.unmarshall.impl.TradeUnmarshallImpl;

@Configuration
public class CattolicaSBConfiguration {
	
	@Bean
	public ExtractPayments extractPayments(){
		return new ExtractPayments();
	}
	
	@Bean
	public TradeUnmarshall tradeUnmarshall(){
		return new TradeUnmarshallImpl();
	}
	
	@Bean
	public GenerateCSVSAP generateCSVSAP(){
		return new GenerateCSVSAPImpl();
	}
	
	@Bean
	public SapProcessFacade sapProcessFacade(){
		return new SapProcessFacadeImpl();
	}
	

}
