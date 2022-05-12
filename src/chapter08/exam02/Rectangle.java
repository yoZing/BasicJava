package chapter08.exam02;

public class Rectangle extends Shape {
	// 필드
	private double width;
	private double height;

	// 생성자
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// 메소드
	@override
	public double area() {
		return width * height;
	}

	@override
	public double perimeter() {
		return 2 * (width + height);
	}

	@override
	public String toString() {
		return String.format("도형의 종류: 사각형, 둘레: %.2fcm, 넓이: %.2fcm²", perimeter(), area());
	}

}
