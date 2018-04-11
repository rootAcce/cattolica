package it.cattolica.xml.unmarshall;

import javax.xml.bind.JAXBException;

import net.sophis.reporting.Trades;

public interface TradeUnmarshall {
	
	public Trades unmarshallTrade() throws JAXBException;

}
