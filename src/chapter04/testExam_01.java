package chapter04;

public class testExam_01 {

	public static void main(String[] args) {
		/*
		 * 1. 1부터 100까지의 합을 구할 때, 합이 1000이 넘을 때의 숫자를 알아내는 프로그램
		 */
		/*
		 * int number = 0; int sum = 0;
		 * 
		 * for(number = 1; sum <= 1000; number++) { 
		 * sum += number; 
		 * }
		 * System.out.println(number - 1);
		 */
		/*
		 * int number = 0; 
		 * int sum = 0; 
		 * for(number = 1; number <= 1000; number++) { 
		 * sum += number; 
		 * if(sum >= 1000) { 
		 * System.out.println(number); break; } 
		 * }
		 */
		int number = 0;
		int sum = 0;
		while(sum <= 1000) {
			number++;
			sum += number;			
		}
		System.out.println("1~100까지의 합을 구할 때, 합이 1000이 넘을 때 합의 값: " + sum);
		System.out.println("1~100까지의 합을 구할 때, 합이 1000이 넘을 때의 값: " + number);		
	}
}
