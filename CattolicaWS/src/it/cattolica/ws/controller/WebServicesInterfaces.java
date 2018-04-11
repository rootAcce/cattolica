package it.cattolica.ws.controller;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.xml.bind.JAXBException;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import it.cattolica.db.entities.Payment;
import it.cattolica.db.impl.ExtractPayments;
import it.cattolica.ws.facade.SapProcessFacade;
import it.cattolica.xml.generate.csv.GenerateCSVSAP;
import it.cattolica.xml.unmarshall.TradeUnmarshall;
import net.sophis.reporting.Root;
import net.sophis.reporting.Trades;

@Controller
public class WebServicesInterfaces {
	
	@Resource(name="extractPayments")
	ExtractPayments extractPayments;
	
	@Resource(name="tradeUnmarshall")
	TradeUnmarshall tradeUnmarshall;
	
	@Resource(name="generateCSVSAP")
	GenerateCSVSAP generateCSVSAP;
	
	@Resource(name="sapProcessFacade")
	SapProcessFacade sapProcessFacade;
	
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		
		
		
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java ********** and this is the list of payment ********** </div><br><br>";
//		try {
//	        Trades t =  tradeUnmarshall.unmarshallTrade();
//	        
//	        List<Payment> paymentsInsert = new ArrayList<Payment>();
//	        
//	        for (int i=0;i<t.getTrade().size();i++)
//	        {
//	        	message += "<br><div style='text-align:center;'>" + t.getTrade().get(i).getEntity().getValue() + "</div>";
//	        	message += "<br><div style='text-align:center;'>" + t.getTrade().get(i).getPortfolio().getValue() + "</div>";
//	        	message += "<br><div style='text-align:center;'>" + t.getTrade().get(i).getTradeId().getValue() + "</div><br>";
//	        	Payment payment = new Payment();
//	        	
//	        	payment.setPaymentId(t.getTrade().get(i).getTradeId().getValue().toString());
//	        	
//	        	paymentsInsert.add(payment);
//	        }
//	        
//	        extractPayments.savePayments(paymentsInsert);
//	        
//	        List<Payment> payments = extractPayments.getPayments(); 
//			
//	        
//	        generateCSVSAP.createCSV(payments);
// 
//		} catch (JAXBException jaxbException) {
//			jaxbException.printStackTrace();
//		}
		
		getEmployees();
		
		return new ModelAndView("welcome", "message", message);
	}
	
	
	
	private void getEmployees()
	{
	    final String uri = "http://localhost:8080/CattolicaWS/generate";
	    RestTemplate restTemplate = new RestTemplate();
	    
	    Root root = restTemplate.getForObject( uri, Root.class);
	    
	    sapProcessFacade.generateSapInterface(root);
	}
}
