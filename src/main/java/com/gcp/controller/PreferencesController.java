package com.gcp.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gcp.dao.PreSpecRepository;
import com.gcp.dao.PreferenceSpec;
import com.gcp.dto.PreferenceSpecRequest;

@RestController
public class PreferencesController {

	@Autowired
	private PreSpecRepository repository;
	private static final Logger LOGGER = LogManager.getLogger(PreferencesController.class);

	@GetMapping(value = "/pref/{key}")
	public PreferenceSpec getPrefences(@PathVariable("key") String key) {
		LOGGER.info("<html><h1>CAPS Depoyed on GCP user:</html> " + key + "</h1>");
		return repository.findByPrefkey(key);
	}
	
	@PostMapping(value="/pref")
	public PreferenceSpec savePreference(@RequestBody PreferenceSpecRequest request) {
		PreferenceSpec entity = new PreferenceSpec();
		entity.setPrefkey(request.getKey());
		entity.setPrefvalue(request.getValue());
		entity.setDescdetails(request.getDesc());
		return repository.save(entity);
	}

}
