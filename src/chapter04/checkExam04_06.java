package chapter04;

import java.util.Scanner;

public class checkExam04_06 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			
			String menuNum = scanner.nextLine();
			
			switch (menuNum) {
 				case "1":
 					System.out.print("예금액> " );
 					balance += scanner.nextInt();
 					break;
     			case "2":
     				System.out.print("출금액> ");
     				int amount = scanner.nextInt();
     				if (balance > amount) {
     					balance -= amount;
     				} else {
     					System.out.println("잔액이 부족합니다");
     				}
     				break;
				case "3":
					System.out.print("잔고> ");
					System.out.println(balance);
					break;
				case "4":
					run = false;
					break;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}
}  