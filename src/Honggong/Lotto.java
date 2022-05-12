package Honggong;

import java.util.Random;

public class Lotto {
//	로또번호를 생성하는 프로그램을 작성하시오.
//	(로또 번호는 1 ~ 45번까지 있으며 이 중에서 중복되지 않는 6개의 숫자를 추출하여 결과를 출력한다.)
	public static void main(String[] args) {
		Random random = new Random();
		int[] intArray = new int[6];
			for (int i = 0; i < intArray.length; i++) {
				intArray[i] = random.nextInt(45) + 1;
				for(int j = 0; j < i; j++)
				if(intArray[i] == intArray[j]) {
					i--;
					break;
				}
			}
			System.out.println("로또 번호");
			for (int i = 0; i < 6; i++) {
				System.out.print(intArray[i] + " ");
			}
	}
}