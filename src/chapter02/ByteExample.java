package chapter02;

public class ByteExample {
  public static void main(String[] args) {
	byte var1 = -128;
	byte var2 = -30;
	byte var3 = 0;
	byte var4 = 30;
	byte var5 = 127;
	//byte var6 = 128;  //컴파일 에러를 일으킴. byte type은 -128~127까지만 허용
	
	System.out.println(var1);
	System.out.println(var2);
	System.out.println(var3);
	System.out.println(var4);
	System.out.println(var5);
	
}
}
