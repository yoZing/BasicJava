package chapter04;

public class SwitchStringExample {

	public static void main(String[] args) {
		// 데이터 입력 부분
		String position = "과장";
		
		//데이터 처리 및 출력 부분
		switch(position) {
			case "부장":
				System.out.println("700만원");
				break;
			case "과장":
				System.out.println("500만원");
				break;
			default:
				System.out.println("300만원");
		}
	}
}
