package com.modular;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Rate {
	@JsonProperty
	private Double SEK;

	public Double getSEK() {
		return SEK;
	}

	public void setSEK(Double SEK) {
		this.SEK = SEK;
	}

	@Override
	public String toString() {
		return "Rate [SEK=" + SEK + ", getSEK()=" + getSEK() +"]";
	}

}
