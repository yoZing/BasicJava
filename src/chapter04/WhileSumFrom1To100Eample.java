package chapter04;

public class WhileSumFrom1To100Eample {

	public static void main(String[] args) {
		// 데이터 입력부분
		int sum = 0;
		int i = 1;
		
		//데이터 처리  부분
		while(i<=100) {
			sum += i;
			i++;
		}
		//데이터 출력 부분
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}
}