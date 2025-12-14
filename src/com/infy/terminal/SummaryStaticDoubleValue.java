//Compute summary statistics (count, min, max, sum, average) for doubles.
package com.infy.terminal;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummaryStaticDoubleValue {

	public static void main(String[] args) {
		List<Double> values = List.of(2.5, 3.0, 4.5, 1.0);
		DoubleSummaryStatistics stats = values.stream()
											  .collect(Collectors.summarizingDouble(Double::doubleValue));
		System.out.println("Count: "+stats.getCount());
		System.out.println("Min: "+stats.getMin());
		System.out.println("Max: "+stats.getMax());
		System.out.println("sum: "+stats.getSum());
		System.out.println("Average: "+stats.getAverage());
	}

}
