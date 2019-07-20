package com.modular;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RestResponse {

	@JsonProperty
	private String base;

	@JsonProperty
	private String fun;

	@JsonProperty
	private Rate rates;

	public RestResponse() {
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

	public Rate getRates() {
		return rates;
	}

	public void setRates(Rate rates) {
		this.rates = rates;
	}
    
	@Override
	public String toString() {
		
		return this.rates.toString();
	}
}
