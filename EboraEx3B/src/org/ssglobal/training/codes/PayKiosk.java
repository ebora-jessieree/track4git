package org.ssglobal.training.codes;

public class PayKiosk {
	
	public void charge(float previousBalance, float additionalCharges) {
		//declare variables
		float interest=0, newBalance=0, minimumPayment = 0;
		
		//compute interest if previous balance is not 0
		if (previousBalance > 0) {
			interest = (float) ((previousBalance + additionalCharges)*0.02);
		}
		//compute new Balance
		newBalance = previousBalance + additionalCharges + interest;
		//compute minimum payment
		if(newBalance < 50) {
			minimumPayment = newBalance;
		}else {
			if(newBalance>=50 && newBalance <=300) {
				minimumPayment = 50;
			}else {
				minimumPayment = (float) (newBalance *0.2);
			}
		}
		
		//call print method with proper parameters
		printAmount(previousBalance,additionalCharges, interest, newBalance
				, minimumPayment);
	}
	
	public void printAmount(float previousBalance,float additionalCharges,
			float interest, float newBalance, float minimumPayment) {
		System.out.println("CS CARD International Statement");
		System.out.println("-------------------------------\n");
		System.out.println("Previous Balance:\t" + '\u0024' + previousBalance);
		System.out.println("Additional Charges:\t" + '\u0024' + additionalCharges);
		System.out.println("Interest:\t\t" + '\u0024' + interest);
		System.out.println("New Balance:\t\t" + '\u0024' + newBalance);
		System.out.println("Minimum Payment:\t" + '\u0024' + minimumPayment);
		System.out.println("\n");
	}
	
}