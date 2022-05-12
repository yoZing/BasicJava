package chapter03;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		// ++, --
		int x = 10;
		int y = 10;	
		// x와 y를 연산한 결과
		int z;
		z = ++x + ++y;
		System.out.printf("x=%s, y=%s, z=%s\n", x, y, z);
		z = ++x + y++;
		System.out.printf("x=%s, y=%s, z=%s\n", x, y, z);
		z = x++ + ++y;
		System.out.printf("x=%s, y=%s, z=%s\n", x, y, z);
		z = x++ + y++;
		System.out.printf("x=%s, y=%s, z=%s\n", x, y, z);
	}
}
