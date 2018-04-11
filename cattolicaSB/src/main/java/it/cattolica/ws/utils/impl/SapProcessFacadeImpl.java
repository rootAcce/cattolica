package it.cattolica.ws.utils.impl;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;

import it.cattolica.db.entities.Payment;
import it.cattolica.db.entities.Security;
import it.cattolica.db.impl.ExtractPayments;
import it.cattolica.ws.utils.GenerateCSVSAP;
import it.cattolica.ws.utils.SapProcessFacade;
import it.cattolica.xml.unmarshall.TradeUnmarshall;
import net.sophis.reporting.Root;
import net.sophis.reporting.Trade;
import net.sophis.reporting.Trades;

public class SapProcessFacadeImpl implements SapProcessFacade{
	
	@Autowired
	ExtractPayments extractPayments;
	
	@Autowired
	TradeUnmarshall tradeUnmarshall;
	
	@Autowired
	GenerateCSVSAP generateCSVSAP;
	
	public void generateSapInterface() {
		try {
	        Trades t =  tradeUnmarshall.unmarshallTrade();
	        
	        List<Payment> paymentsInsert = new ArrayList<Payment>();
	        List<Security> securityInsert = new ArrayList<Security>();
	        
	        
	        for (Trade trade : t.getTrade())
	        {
//	        	message += "<br><div style='text-align:center;'>" + trade.getEntity().getValue() + "</div>";
//	        	message += "<br><div style='text-align:center;'>" + trade.getPortfolio().getValue() + "</div>";
//	        	message += "<br><div style='text-align:center;'>" + trade.getTradeId().getValue() + "</div><br>";
	        	
	        	
	        	Payment payment = new Payment();
	        	
	        	payment.setPaymentId(trade.getTradeId().getValue().toString());
	        	if(trade.getBeneficiaryEntity() != null) {
	        		payment.setAccountId(trade.getBeneficiaryEntity().getValue());
	        	}
	        	payment.setFlowSide(trade.getTradeType().toString());
	        	
	        	paymentsInsert.add(payment);
	        }
	        
	        extractPayments.savePayments(paymentsInsert);
	        
	        List<Payment> payments = extractPayments.getPayments(); 
			
	        generateCSVSAP.createCSV(payments);
 
		} catch (JAXBException jaxbException) {
			jaxbException.printStackTrace();
		}
	}
	
	public void generateSapInterface(Root root) {
			

			Trades t = root.getDefault0().get(0).getResult().getTradegroup().get(0).getTrades();
	        
	        
	        
	        List<Payment> paymentsInsert = new ArrayList<Payment>();
	        List<Security> securityInsert = new ArrayList<Security>();
	        
	        
	        for (Trade trade : t.getTrade())
	        {
	        	
	        	
	        	Payment payment = new Payment();
	        	
	        	payment.setPaymentId(trade.getTradeId().getValue().toString());
	        	if(trade.getBeneficiaryEntity() != null) {
	        		payment.setAccountId(trade.getBeneficiaryEntity().getValue());
	        	}
	        	payment.setFlowSide(trade.getTradeType().toString());
	        	
	        	paymentsInsert.add(payment);
	        }
	        
	        extractPayments.savePayments(paymentsInsert);
	        
	        List<Payment> payments = extractPayments.getPayments(); 
			
	        generateCSVSAP.createCSV(payments);
	}

}
