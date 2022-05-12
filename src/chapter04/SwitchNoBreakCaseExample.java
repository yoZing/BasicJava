package chapter04;

import java.util.Random;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		// 데이터 입력 부분
		Random random = new Random();
		int time = random.nextInt(3) + 8;

		// 데이터 처리 및 출력 부분
		switch (time) {
			case 8:
				System.out.println("출근합니다.");
			case 9:
				System.out.println("회의를 합니다.");
			case 10:
				System.out.println("업무를 봅니다.");
			default:
				System.out.println("외근을 나갑니다.");
		}
	}
}
