package chapter04;

public class ForMultiplicationTableExample {
	

	public static void main(String[] args) {
		// nested loop
		// 데이터 입력, 처리, 출력 부분
		for(int m = 2; m <= 9; m++) {
			System.out.println("*** " + m + "단 ***");
		  	for(int n = 1; n <= 9; n++ ) {
		  		System.out.println(m + " x " + n + " = " + (m * n));
		  	}
		}
	}
}
