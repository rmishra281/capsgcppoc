package com.gcp;

import java.util.Optional;

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

	@GetMapping(value = "/pref/{specId}")
	public Optional<PreferenceSpec> getPrefences(@PathVariable("userid") Long specId) {
		LOGGER.info("<html><h1>CAPS Depoyed on GCP user:</html> " + specId + "</h1>");
		return repository.findById(specId);
	}
	
	@PostMapping(value="/pref")
	public void savePreference(@RequestBody PreferenceSpecRequest request) {
		PreferenceSpec entity = new PreferenceSpec();
		entity.setKey(request.getKey());
		entity.setValue(request.getValue());
		entity.setDesc(request.getDesc());
		repository.save(entity);
	}

}
