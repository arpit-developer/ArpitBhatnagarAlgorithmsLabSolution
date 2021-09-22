package com.greatlearning.services;

public class DenominationCalc {
	public static int[][] checkPaymentApproach(int[] denominationArray, int paymentAmount) {
		int[][] paymentMethod = new int[denominationArray.length][2];
		
		int payment = paymentAmount;
		MergeSort.sort(denominationArray);		
		
		int index = 0;		
		for (int i = 0; (i < denominationArray.length) && (payment != 0); i++) {
			if (payment < denominationArray[i])	
				continue;
			
			paymentMethod[index][0] = denominationArray[i];		
			paymentMethod[index][1] = payment / denominationArray[i];	
			payment %= denominationArray[i];	
			index++;
			
		}
		
		if (payment != 0)
			paymentMethod[0][0] = -1;
		
		return paymentMethod;
	}
}
