package chapter04;


import java.util.Random;

public class IfDiceExample_sub {
	public static void main(String[] args) {
		// pseudo Random => 가짜 랜덤
		long millis = System.currentTimeMillis();
		long nanoTime = System.nanoTime();
		
		Random random = new Random();
		// 괄호 안의 숫자만큼 랜덤 범위 결정(0부터 시작함)
		System.out.println(random.nextInt(6) + 1);
		System.out.println(random.nextInt(6) + 1);
		System.out.println(random.nextInt(6) + 1);
		System.out.println(random.nextInt(6) + 1);
		System.out.println(random.nextInt(6) + 1);
		System.out.println(random.nextInt(6) + 1);
		System.out.println(random.nextInt(6) + 1);
		System.out.println(random.nextInt(6) + 1);
		System.out.println(random.nextInt(6) + 1);
		System.out.println(random.nextInt(6) + 1);

	}

}
