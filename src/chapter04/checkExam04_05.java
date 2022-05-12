package chapter04;

public class checkExam04_05 {

	public static void main(String[] args) {
		for(int i = 1; i < 5; i++) {
			for(int j = 4; j > 0; j--) {
				System.out.print("");
				if(i >= j) {				
					System.out.print("*");	
				}
			}
			System.out.println();
		}	
	}
}
