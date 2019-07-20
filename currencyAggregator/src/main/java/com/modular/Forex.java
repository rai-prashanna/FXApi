package com.modular;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Forex {

	@JsonProperty
	private String base;

	@JsonProperty
	private String fun;

	@JsonProperty
	//private Rate rates;
	private Map<String, Double> rates;

	public Forex() {
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public String getFun() {
		return fun;
	}

	public void setFun(String fun) {
		this.fun = fun;
	}

	public Map<String, Double> getRates() {
		return rates;
	}

	public void setRates(Map<String, Double> rates) {
		this.rates = rates;
	}

}
