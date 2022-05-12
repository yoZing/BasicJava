package chapter10.exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise101_2 {
	/*
	 * 두 개의 정수를 입력받아 나눗셈을 하는 프로그램을 만들어 보자.(나눗셈의 결과는 정수로 나타낸다.) 어떤 수를 0으로 나눌 때와 정수가
	 * 아닌 다른 타입을 입력받는 경우 try-catch문을 사용하여 예외처리를 해준다. 어떤 수를 0으로 나눌 때에는
	 * "0으로 나눌 수 없습니다."라고 출력하고 다시 입력받게 만든다. 정수가 아닌 다른 타입을 입력받는 경우에는 "잘못된 입력입니다."를
	 * 출력하고 다시 입력받게 만든다.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			try {
				System.out.print("어떤 수로 나누시겠습니까?>>");
				int firstNum = scanner.nextInt();
				System.out.print("어떤 수를 나누시겠습니까?>>");
				int secondNum = scanner.nextInt();
				int result = secondNum / firstNum;
				System.out.println(secondNum + "/" + firstNum + " = " + result);
				
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				main(args);
				
			} catch (ArithmeticException e) {			
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				main(args);
			} 
		scanner.close();
	}
}
