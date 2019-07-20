

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianCalculator {

	public static void median(double[] arr) {
		PriorityQueue<Double> heapMin = new PriorityQueue<>(
				(arr.length / 2) + 1);
		PriorityQueue<Double> heapMax = new PriorityQueue<>(
				(arr.length / 2) + 1, new Comparator<Double>() {
					@Override
					public int compare(Double num1, Double num2) {
						return num2.compareTo(num1);
					}
				});

		// stream of data
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Median : "
					+ getMedian(heapMin, heapMax, arr[i]));
		}
	}

	/**
	 * time: logn
	 */
	private static double getMedian(PriorityQueue<Double> minHeap,
			PriorityQueue<Double> maxHeap, double data) {
		// add to minheap first
		minHeap.add(data);
		// check if minHeap has more than 1 element extra
		if (minHeap.size() - maxHeap.size() > 1) {
			maxHeap.add(minHeap.poll());
		}
		// if total numbers are even. median is avg
		if (minHeap.size() == maxHeap.size()) {
			return ((double) minHeap.peek() + maxHeap.peek()) / 2;
		}
		return (double) minHeap.peek();
	}

	public static void main(String[] args) {
		double[] arr = { 2.0, 5.0, 15.1, 1.0, 3.2, 4.8, 17.2 };
		median(arr);

	}
}
