package com.modular;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 * Json serializer of forex api i.e
 * http://<base-url>/<start-date>/<end-date>/agg?func=median&symbols=sek&base=usd
 * @author Pratick Rai 
 */

public class Forex {

	@JsonProperty
	private String base;

	@JsonProperty
	private String fun;

	@JsonProperty
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
