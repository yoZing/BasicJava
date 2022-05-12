package chapter04;

public class ForPrintFrom1To10Example1 {

	public static void main(String[] args) {
		// 데이터 입력, 처리, 출력 부분
		int sum = 0;
		
		int i = 0;
		for(i = 1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1~" + (i-1) + "합 : " + sum);
	}

}
