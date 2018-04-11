package it.cattolica.ws.controller;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestServiceController {
	
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
	@ResponseBody
	public String generate(Model model)
	{
	    model.addAttribute("employees", getXML());
	    return getXML();
	}

}
