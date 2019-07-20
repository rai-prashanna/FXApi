package com.modular;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import sun.util.logging.resources.logging;

@RestController
public class FXController {
	  private static final Logger log = LoggerFactory.getLogger(FXController.class);

	@GetMapping("/2010-01-01/2011-01-01/agg")
	RestResponse findAll(@RequestParam String symbols,
			@RequestParam String base, @RequestParam String func) {
		RestResponse resposResponse = new RestResponse();
		RestResponse response = null;
		if (func.equals("median")) {
			RestTemplate restTemplate = new RestTemplate();
			String strtDate = "2018-01-01";
			String endDate = "2019-01-01";
			MedianCalculator median = new MedianCalculator();
			double result = 0;
			
			//double[] streaming = new double[365];
			int currentIndex=0;
			for (LocalDate date = LocalDate.parse(strtDate); date.isBefore(LocalDate.parse(endDate)); date = date.plusDays(1))
			{
			response = restTemplate
					.getForObject(
							"http://fx.modfin.se/"+date.toString()+"/?symbols=sek&base=usd",
							RestResponse.class);
			//streaming[currentIndex]=response.getRates().getSEK();
			result=median.getMedian(response.getRates().getSEK());	
			
			//streaming.add(response.getRates().getSEK());
			}	
			System.out.println("the median is "+result);

		}

		return response;
	}

}
