package com.modular;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/** 
 * Controller of forex api for calculating median 
 * during a year 
 * @author Pratick Rai 
 */
@RestController
public class FXController {

	@GetMapping("/2018-01-01/2019-01-01/agg")
	Forex findMedian(@RequestParam String symbols, @RequestParam String base,
			@RequestParam String func) {
		Forex forex = new Forex();
		Forex response = new Forex();

		if (func.equals("median")) {
			RestTemplate restTemplate = new RestTemplate();
			// Since task was to median exchange rate for USD to SEK during last
			// year
			// i.e 2018-01-01 to 2019-01-01 so hard coded dates
			String strtDate = "2018-01-01";
			String endDate = "2019-01-01";
			
			MedianCalculator median = new MedianCalculator();
			double result = 0;
			
			for (LocalDate date = LocalDate.parse(strtDate); date
					.isBefore(LocalDate.parse(endDate)); date = date
					.plusDays(1)) {
				forex = restTemplate.getForObject(
						"http://fx.modfin.se/" + date.toString()
								+ "/?symbols=sek&base=usd", Forex.class);

				result = median.getMedian(forex.getRates().get("SEK"));
			}
			response.setBase("USD");
			response.setFun("median");
			Map<String, Double> rates = new HashMap<String, Double>();
			rates.put("SEK", result);
			response.setRates(rates);
		}
		return response;
	}
}
