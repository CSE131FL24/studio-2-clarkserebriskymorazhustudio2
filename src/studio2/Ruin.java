package studio2;

public class Ruin {

	public static void main(String[] args) {
		int startAmount = 25;
		double winChance = 0.5;
		int winLimit = 35;
		for (startAmount = 25; startAmount < winLimit && startAmount > 0;) {
			double winLoss = (double) Math.random();
			if (winLoss >= winChance) {
				startAmount ++;
			}
			else {
				startAmount --;
			}
			System.out.println(startAmount);

		}
			if (startAmount == 0) {
				System.out.println("Ruin :(");
		}		
			else {
				System.out.println("Success :)");
			}
				

	}

}
