package chapter02;

public class LongExample {
  public static void main(String[] args) {
	long var1 = 10;
	long var2 = 20;//(L)
	//long var3 = 1000000000000;
	/* 정수타입에서는 기본적으로 int를 사용하기 때문에 int타입의 범위를 넘어가는 경우에는 이를 자바 프로그램에 알려줘야함
	 * Long 타입의 경우 뒤에 L을 넣어 표시, 소문자 l도 가능하나 숫자 1과 헷갈리기 때문에 대문자 사용
	 * 단, Long 타입을 사용하더라도 int 타입의 범위 내이면 뒤에 L을 작성할 필요가 없음
	 */
	long var4 = 1000000000000L;
	
	System.out.println(var1);
	System.out.println(var2);
	System.out.println(var4);
}
}
