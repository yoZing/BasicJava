package chapter07;

public class Computer extends Calculator{
	public double areaCircle(double radius) {
		System.out.println("이 메소드는 Computer 객체의 메소드를 호출함");
		return Math.PI *radius*radius;
	}
	
	// 원의 둘레를 구하는 메소드
	public double perimeterCircle(double radius) {
	return 2 * Math.PI * radius;	
	}
}
