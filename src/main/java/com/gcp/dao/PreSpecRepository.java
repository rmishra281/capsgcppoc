package com.gcp.dao;

import org.springframework.data.repository.CrudRepository;

public interface PreSpecRepository extends CrudRepository<PreferenceSpec,Long > {
	
	public  PreferenceSpec findByPrefkey(String key);

}
