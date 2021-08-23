package org.ssglobal.training.codes;

public class SquareDg {

	
	public void printDesign(byte height){
		System.out.printf("hardcoded height = %s\n", height);
		//Check if height is not more than 9
		if(height > 10) {
			System.out.print("Height should not be more than 9");
		}
		else {
			//loop the row
			for(int i = 1; i <= height; i+=2){
				//loop to print out the dashes and numbers
				for (int j = 1; j <= 11; j++) {
					int number = (11-i)/2 ;
					if(number < j && j <= number+i) {
						System.out.print(i);
					}else {
						System.out.print("-");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}