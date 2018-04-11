package it.cattolica.ws.controller;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import it.cattolica.ws.utils.SapProcessFacade;
import net.sophis.reporting.Root;

@RestController
public class CattolciaSBController {
	
	@Autowired
	SapProcessFacade sapProcessFacade;
	
	@RequestMapping("/")
	public void getPayments() {
		getEmployees();
	}
	
	private void getEmployees()
	{
	    final String uri = "http://localhost:8080/generate";
	    RestTemplate restTemplate = new RestTemplate();
	    
	    Root root = restTemplate.getForObject( uri, Root.class);
	    
	    sapProcessFacade.generateSapInterface(root);
	}
	
	private String getXML() {
		
		byte[] encoded = null;
		try {
			encoded = Files.readAllBytes(Paths.get("/Users/radami/cattolica/CattolicaJAXB/trade.xml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new String(encoded, Charset.defaultCharset());

	}
	
	@RequestMapping(value = "/generate", produces = MediaType.APPLICATION_XML_VALUE, method = RequestMethod.GET)
	public String generate(Model model)
	{
	    model.addAttribute("employees", getXML());
	    return getXML();
	}

}
