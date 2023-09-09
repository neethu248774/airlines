package com.ust.air_lines;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Airline {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String code;
	@JsonProperty("is_lowcost")
	private Boolean isLowCost;
	private String logo;
	
	
	public Airline() {
		
		// TODO Auto-generated constructor stub
	}


	public Airline(Long id, String name, String code, Boolean isLowCost, String logo) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.isLowCost = isLowCost;
		this.logo = logo;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public Boolean getIsLowCost() {
		return isLowCost;
	}


	public void setIsLowCost(Boolean isLowCost) {
		this.isLowCost = isLowCost;
	}


	public String getLogo() {
		return logo;
	}


	public void setLogo(String logo) {
		this.logo = logo;
	}
	
	
	

}
