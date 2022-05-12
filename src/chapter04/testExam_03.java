package chapter04;

import java.util.Scanner;

public class testExam_03 {

	public static void main(String[] args) {
		/*
		 * 3. 사용자로부터 월을 입력받고 입력받은 월이 며칠까지 있는지 출력하는 프로그램
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("확인하고 싶은 년도를 입력하세요: ");
		int year = scanner.nextInt();
		System.out.print("확인하고 싶은 월을 입력하세요: ");
		int month = scanner.nextInt();

		if (((year % 4 != 0) && (year % 100 == 0)) || (year % 400 != 0)) {
			if ((month >= 8) && (month % 2 == 0)) {
				System.out.println(month + "월은 31일까지 있습니다.");
			} else if ((month >= 8) && (month % 2 != 0)) {
				System.out.println(month + "월은 30일까지 있습니다.");
			} else if ((month >= 3) && (month % 2 == 0)) {
				System.out.println(month + "월은 30일까지 있습니다.");
			} else if ((month >= 1) && (month % 2 != 0)) {
				System.out.println(month + "월은 31일까지 있습니다.");
			} else {
				System.out.println(month + "월은 28일까지 있습니다.");
			}
		} else if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			if ((month >= 8) && (month % 2 == 0)) {
				System.out.println(month + "월은 31일까지 있습니다.");
			} else if ((month >= 8) && (month % 2 != 0)) {
				System.out.println(month + "월은 30일까지 있습니다.");
			} else if ((month >= 3) && (month % 2 == 0)) {
				System.out.println(month + "월은 30일까지 있습니다.");
			} else if ((month >= 1) && (month % 2 != 0)) {
				System.out.println(month + "월은 31일까지 있습니다.");
			} else {
				System.out.println(month + "월은 29일까지 있습니다.");
			}
		}
		scanner.close();
	}	
}