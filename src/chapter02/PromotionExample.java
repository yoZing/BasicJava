package chapter02;

public class PromotionExample {
  public static void main(String[] args) {
	//자동 타입 변환
	byte byteValue = 10;
	int intValue = byteValue;
	System.out.println("intValue: " + intValue);
	
	char charValue = '가';
	intValue = charValue;
	System.out.println("가의 유니코드: " + intValue);
	
	intValue = 50;
	long LongValue = intValue;
	System.out.println("LongValue: " + LongValue);
	
	LongValue = 100;
	float floatValue = LongValue;
	System.out.println("floatValue: " + floatValue);
	
	floatValue = 100.5F;
	double doubleValue = floatValue;
	System.out.println("doubleValue: " + doubleValue);
}
}
