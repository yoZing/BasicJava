package chapter04;

import java.util.Scanner;

public class testExam_02 {

	public static void main(String[] args) {
		// 구구단 원하는 단 뽑기
		Scanner scanner = new Scanner(System.in);
		System.out.print("원하는 단을 입력하세요: ");
		int i = scanner.nextInt();
		int j = 0;
		System.out.println("-----" + i + "단-----");
				
		for(j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i * j);		
		}
		scanner.close();
	}
}
