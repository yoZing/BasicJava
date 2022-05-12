package chapter04;

import java.util.Random;

public class checkExam04_02 {

	public static void 
	main(String[] args) {
		Random random = new Random();
		boolean probability = true;
		
		while (probability) {
			int diceValue1 = random.nextInt(6) + 1;
			int diceValue2 = random.nextInt(6) + 1;
			System.out.println("(" + diceValue1 + "," + diceValue2 + ")");
			if (diceValue1 + diceValue2 == 5) {
				break;
			}
		}
	}
}