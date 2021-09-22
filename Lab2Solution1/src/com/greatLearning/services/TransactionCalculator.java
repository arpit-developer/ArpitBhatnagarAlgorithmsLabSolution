package com.greatLearning.services;

public class TransactionCalculator {
	public static int calcTargetNumberOfTransaction(int[] transactionsArray, int target) {
		int i, sumOfTransactions = 0; 
		
		for (i = 0; i < transactionsArray.length; i++) {
			sumOfTransactions += transactionsArray[i];
			
			if (sumOfTransactions >= target) {
				return i+1;		
			}
		}
		
		return -1;		
	}
}
