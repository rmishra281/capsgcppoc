package com.gcp.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class PreferenceSpec {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long specId;
	
	private String prefkey ;
	private String prefvalue;
	private String descdetails;
	public Long getSpecId() {
		return specId;
	}
	public void setSpecId(Long specId) {
		this.specId = specId;
	}
	public String getPrefkey() {
		return prefkey;
	}
	public void setPrefkey(String prefkey) {
		this.prefkey = prefkey;
	}
	public String getPrefvalue() {
		return prefvalue;
	}
	public void setPrefvalue(String prefvalue) {
		this.prefvalue = prefvalue;
	}
	public String getDescdetails() {
		return descdetails;
	}
	public void setDescdetails(String descdetails) {
		this.descdetails = descdetails;
	}
	
}
