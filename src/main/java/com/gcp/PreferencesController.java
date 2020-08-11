package com.gcp;

import javax.websocket.server.PathParam;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PreferencesController {
	private static final Logger LOGGER = LogManager.getLogger(PreferencesController.class);
	
	@GetMapping(value="/pref/{userid}")
	public String getPrefences(@PathParam("userid") String userid) {
	LOGGER.info("<html><h1>CAPS Depoyed on GCP user:</html> "+userid+"</h1>");
	return "<html><h1>CAPS Depoyed on GCP user:"+userid+"</h1></html>";
	}

}
