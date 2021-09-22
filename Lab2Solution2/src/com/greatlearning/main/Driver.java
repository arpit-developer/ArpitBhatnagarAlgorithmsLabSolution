package com.greatlearning.main;
import com.greatlearning.services.DenominationCalc;
import java.util.Scanner;
public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Currency Denominations: ");
		int num_denominations = sc.nextInt();						
		int[] denominationsArray = new int[num_denominations];		
		
		System.out.println("Enter the Currency Denominations value: ");
		for (int i = 0; i < num_denominations; i++) {
			denominationsArray[i] = sc.nextInt();
			
			while (denominationsArray[i] <= 0) {		//invalid denomination
				System.out.println("Denomination should be greater than 0. Please enter valid denomination");
				i--;
			}
		}
		
		System.out.println("Enter the Amount you want to pay: ");
		int paymentAmount = sc.nextInt();
		
		int[][] paymentMethod = DenominationCalc.checkPaymentApproach(denominationsArray, paymentAmount);
		
		if (paymentMethod[0][0] == -1) 		
			System.out.println("Entered value is not possible!");
		else {								
			System.out.println("\nYour payment approach in order to give min no of notes will be: ");
			for (int i = 0; (i < num_denominations && paymentMethod[i][0] != 0); i++) {
				System.out.println(paymentMethod[i][0] + ":" + paymentMethod[i][1]);
			}
		}
		
		sc.close();
	}
}
