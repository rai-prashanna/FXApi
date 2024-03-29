package com.modular;


import java.util.Comparator;
import java.util.PriorityQueue;

/** 
 * Contains utility necessary for calculating median from stream of datas 
 * @author Pratick Rai 
 */ 
public  class MedianCalculator {
	private  PriorityQueue<Double> heapMin; 
	private  PriorityQueue<Double> heapMax;

	public MedianCalculator() {
		heapMin=new PriorityQueue<>(183); 
		heapMax=new PriorityQueue<>(183,new Comparator<Double>() {
			@Override
			public int compare(Double num1, Double num2) {
				return num2.compareTo(num1);
			}
		}); 
	}

	public  void median(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Median : "
					+ getMedian(arr[i]));
		}
	}

	/**
	 * time: logn
	 */
	public double getMedian(double data) {
		// add to minheap first
		this.heapMin.add(data);
		// check if minHeap has more than 1 element extra
		if (heapMin.size() - heapMax.size() > 1) {
			heapMax.add(heapMin.poll());
		}
		// if total numbers are even. median is avg
		if (heapMin.size() == heapMax.size()) {
			return ((double) heapMin.peek() + heapMax.peek()) / 2;
		}
		return (double) heapMin.peek();
	}

}
