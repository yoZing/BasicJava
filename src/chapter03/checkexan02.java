package chapter03;

import java.util.Scanner;

public class checkexan02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 수: ");
		String var1 = scanner.next();
		System.out.print("두 번째 수: ");
		String var2 = scanner.next();
		
		double intvar1 = Double.parseDouble(var1);
		double intvar2 = Double.parseDouble(var2);
		
		System.out.println("---------------");
		
		String result = (intvar2 == 0 || intvar2 == 0.0) ? "무한대" : 
			             String.valueOf(intvar1 / intvar2);
		
		System.out.println("결과:" + result);
	}
}
