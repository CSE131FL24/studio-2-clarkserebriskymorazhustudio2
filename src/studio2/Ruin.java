package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("How much money do you have?: ");
		int startAmount = in.nextInt();
		System.out.print("What is your win chance?: ");
		double winChance = in.nextDouble();
		System.out.print("What is your win limit?: ");
		double winLimit = in.nextDouble();
		int losses = 0;
		int totalSimulations = 0;
		for (totalSimulations = 0; totalSimulations < 100; totalSimulations++) {
			System.out.println("Today is Day " + totalSimulations);
			int count = 0;
			
			for (startAmount = 25; startAmount < winLimit && startAmount > 0;) {
				double winLoss = (double) Math.random();
				if (winLoss <= winChance) {
					startAmount ++;
				}
				else {
					startAmount --;
				}
				//System.out.println(startAmount);
				count++;
			}
			System.out.println("Number of plays today: " + count);
			if (startAmount == 0) {
				System.out.println("Ruin :(");
				losses++;
				
			}		
			else {
				System.out.println("Success :)");
			}
		}
		System.out.print("Losses: "+losses+" Simulations: "+totalSimulations);
		double a = (1.00-startAmount)/winLimit;
		System.out.print(" Expected ruin rate: " + (Math.pow(a,startAmount)-Math.pow(a,winLimit))/(1.00-Math.pow(a,winLimit)));
		


	}

}
