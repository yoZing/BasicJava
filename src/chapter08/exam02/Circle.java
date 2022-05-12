package chapter08.exam02;

public class Circle extends Shape {
	// 필드
	private double radius;

	// 생성자
	public Circle(double radius) {
		this.radius = radius;
	}

	// 메소드

	@override
	public double area() {
		return Math.PI * radius * radius;
	}

	@override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	@override
	public String toString() {
		return String.format("도형의 종류: 원, 둘레: %.2fcm, 넓이: %.2fcm²", perimeter(), area());

	}

}
