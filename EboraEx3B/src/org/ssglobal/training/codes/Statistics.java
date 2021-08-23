package org.ssglobal.training.codes;

public class Statistics {
	
	public void compute(int...data) {
		//Print the description and call the method
		System.out.printf("mean: %s\n", mean(data));
		System.out.printf("geometric mean: %s \n",geometricMean(data));
		System.out.printf("variance: %s\n", variance(data));
		maxMin(data);
	}
	
	double mean (int...data) {
		int doubleMean = 0;
		for (int counter=1; counter <= data.length; counter++) {
			doubleMean += data[counter-1];
		}
		doubleMean = doubleMean / data.length;
		return doubleMean;
	}
	
	double geometricMean (int...data) {
		int geometricMean =1; 
		for (int counter=1; counter <= data.length; counter++) {
			geometricMean *= data[counter-1];
		}
		geometricMean = (int) Math.sqrt(geometricMean);
		return geometricMean;
	}
	
	double variance(int...data) {
		int variance = 0;
		int totalDiff=0;
		for (int counter=1; counter <= data.length-1; counter++) {
			totalDiff = data[counter-1] - data[counter];
			variance = totalDiff * totalDiff;
		}
		variance = variance / data.length;
		return variance;
		
	}
	
	 void maxMin(int...data) {
		int max = data[0];
		int min = data[0];
		for (int counter = 1; counter < data.length; counter++) {
			if(data[counter] > max) {
				max = data[counter];
			}else {
				min = data[counter];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
	
	
}
