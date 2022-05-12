package chapter03;

public class checkexam01 {

	public static void main(String[] args) {
		int pencil = 534;
		int students = 30;
		
		//학생 1명이 가지는 연필 개수 : 몫
		int pencilsPerStudent = pencil / students;
		System.out.println(pencilsPerStudent);
		
		//남은 연필 개수 : 나머지
		int pencilsLeft = pencil % students;
		System.out.println(pencilsLeft);
		
		int value = 356;
		System.out.println((value / 100) * 100);
		
		int LengthTop = 5;
		int LengthBottom = 10;
		int height = 7;
		double area = ((double)(LengthTop + LengthBottom) * height / 2);
		System.out.println(area);
	}

}
