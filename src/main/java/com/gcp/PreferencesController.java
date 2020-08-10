package com.gcp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PreferencesController {
	
	@GetMapping(value="/pref")
	public String getPrefences() {
	return "<html><h1>CAPS Depoyed on GCP </h1></html>";
	}

}
