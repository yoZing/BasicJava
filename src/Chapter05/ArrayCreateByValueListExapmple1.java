package Chapter05;

public class ArrayCreateByValueListExapmple1 {

	public static void main(String[] args) {
//		int i = 0;
//		int[] idx = new int[10]; //객체 생성
//		int[] idx2 = {10, 20, 30, 40}; //리터럴
		int[] scores = { 83, 90, 87 };
		
		System.out.println("scores[0] :"  + scores[0]);
		System.out.println("scores[1] :" + scores[1]);
		System.out.println("scores[2] :" + scores[2]);
		
		scores[0] = 76;
		for(int i = 0; i<scores.length; i++) {
			System.out.println("scores["+ i +"]: " + scores[i]);
		}
		
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		System.out.println("총합: " + sum);
		double avg = (double) sum / (double) scores.length;
		System.out.println("평균 : " + avg);
	}
}
