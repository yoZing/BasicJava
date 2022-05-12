package chapter08.exam02;

public class Triangle extends Shape {
	// 필드
	private double side;

	// 생성자
	public Triangle(double side) {
		this.side = side;
	}

	// 메소드
	@override
	public double area() {
		return Math.sqrt(3) / 4 * side * side;
	}

	@override
	public double perimeter() {
		return 3 * side;
	}

	@override
	public String toString() {
		return String.format("도형의 종류: 삼각형, 둘레: %.2fcm, 넓이: %.2fcm²", perimeter(), area());
	}
}