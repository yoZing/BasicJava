package chapter04;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		//데이터 처리 및 출력 부분
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("우수 회원입니다.");
				break;	
			case 'B':
			case 'b':
				System.out.println("일반 회원입니다.");
				break;
			default:
				System.out.println("손님입니다.");
		}
	}
}
