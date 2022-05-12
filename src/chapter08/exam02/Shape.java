package chapter08.exam02;

public abstract class Shape implements Comparable<Shape>{
	// 생성자
	public Shape() {		
	}
	
	// 메소드
	public abstract double area();
	public abstract double perimeter();
	
	@override
	public int compareTo(Shape shape) {
		if (this.area() > shape.area()) {
			return 1;
		} else {
			return -1;
		}
	}
}