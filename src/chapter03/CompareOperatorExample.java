package chapter03;

public class CompareOperatorExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		
	    char char1 = 'A';
	    char char2 = 'B';
	    /*char는 유니코드 숫자로 저장이 되기 때문에 비교 연산자가 이용 가능한 것임. 
	     * 기본적으로 문자열(String)은 비교 연산자 사용이 불가능하고, 동등 연산자만 가능함
	     */
	    boolean result4 = (char1 < char2);
	   
	    int v2 = 1;
	    double v3 = 1.0;
	    boolean result5 = (v2 == v3); //true가 담길 것임. 연산자를 사용하려면 타입이 같아야함.

	    double v4 = 0.1;
	    float v5 = 0.1f;
	    boolean result6 = (v4 == v5);
	    
	    boolean result7 = ((float)v4 == v5);
	    
	    /* boolean result8 = (v4 == (double)v5);
	     * System.out.println("result8=" + result8); -> false 더블에서 플롯이랑 플롯에서 더블 형변환이 달라요.
	     */   
   
	}

}
