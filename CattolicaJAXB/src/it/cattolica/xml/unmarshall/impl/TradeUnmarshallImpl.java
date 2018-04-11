package it.cattolica.xml.unmarshall.impl;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import it.cattolica.xml.unmarshall.TradeUnmarshall;
import net.sophis.reporting.Root;
import net.sophis.reporting.Trades;

public class TradeUnmarshallImpl implements TradeUnmarshall{
	
	@Override
	public Trades unmarshallTrade() throws JAXBException {
		
		JAXBContext jc = JAXBContext.newInstance(Root.class);

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        File xmlFile = new File("/Users/radami/cattolica/CattolicaJAXB/trade.xml");
        
        @SuppressWarnings("unchecked")
		JAXBElement<Root> jaxbElement = (JAXBElement<Root>) unmarshaller.unmarshal(xmlFile);
        Root page = jaxbElement.getValue();
        return page.getDefault0().get(0).getResult().getTradegroup().get(0).getTrades();
        
	}

}
