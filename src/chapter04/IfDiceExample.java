package chapter04;

import java.util.Random;

public class IfDiceExample {

	public static void main(String[] args) {
		// 데이터 입력 부분
		Random random = new Random();
		int ranDicNum = random.nextInt(6) + 1; 
		
		// 데이터 처리 및 출력 부분
		if(ranDicNum==1) {
			System.out.println("1번이 나왔습니다.");
		} else if(ranDicNum==2) {
			System.out.println("2번이 나왔습니다.");
		} else if(ranDicNum==3) {
			System.out.println("3번이 나왔습니다.");
		} else if(ranDicNum==4) {
			System.out.println("4번이 나왔습니다.");
		} else if(ranDicNum==5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
	}
}
