package com.modular;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Test {

	public static void main(String[] args) {
		double[] arr = { 2.0, 5.0, 15.1, 1.0, 3.2, 4.8, 17.2 ,19.1,4.9};
		MedianCalculator median = new MedianCalculator();
		double result = 0;
		for (double d : arr) {
			result=median.getMedian(d);
		}
		System.out.println("the median is "+result);

	}
}
