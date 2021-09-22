package com.greatLearning.main;
import java.util.Scanner;

import com.greatLearning.services.TransactionCalculator;
public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array: ");
		int arraySize = sc.nextInt();					
		int[] transactionArray = new int[arraySize];	
		
		System.out.println("Enter the values of transactions: ");
		for (int i = 0; i < arraySize; i++) {
			transactionArray[i] = sc.nextInt();
		}
		
		System.out.println("Enter the number of targets that needs to be achieved: ");
		int numTargets = sc.nextInt();
		int targetValue;		
		int numOfTransactions;	
		
		for (int i = 0; i < numTargets; i++) {
			System.out.println("Enter the value of target: ");
			targetValue = sc.nextInt();
			
			numOfTransactions = TransactionCalculator.calcTargetNumberOfTransaction(transactionArray, targetValue);		
			
			if (numOfTransactions != -1) 	
				System.out.println("\nTarget is achieved in " + numOfTransactions + " transactions.");
			else							
				System.out.println("\nGiven target is not achieved!");
		}
		
		sc.close();
	}

}
