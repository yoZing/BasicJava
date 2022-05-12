package Honggong;

import java.util.Random;
import java.util.Scanner;

public class Hw05_3 {
	/*
	 * 인공지능 컴퓨터와 게이머(사람)가 가위바위보 게임을 할 수 있도록 프로그램을 작성하시오.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String[] ai = { "가위", "바위", "보" };

		System.out.print("게이머: ");
		String gamer = scanner.nextLine();
		int aiIndex = random.nextInt(3);
		if (ai[aiIndex].equals("가위") && gamer.equals("바위") || ai[aiIndex].equals("바위") && gamer.equals("보")
				|| ai[aiIndex].equals("보") && gamer.equals("가위")) {
			System.out.println("gamer 승!");
		} else if (ai[aiIndex].equals("가위") && gamer.equals("보") || ai[aiIndex].equals("바위") && gamer.equals("가위")
				|| ai[aiIndex].equals("보") && gamer.equals("바위")) {
			System.out.println("ai 승!");
		} else if (ai[aiIndex].equals(gamer)) {
			System.out.println("무승부!");
		} else {
			System.out.println("정확한 단어를 입력해 주세요");
		}

	}
}
