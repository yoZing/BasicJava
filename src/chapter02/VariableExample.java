package chapter02;

public class VariableExample {
   public static void main(String[] args) {
      System.out.println("한글");
      /*
       * 변수는 데이터를 저장하는 공간
       * 이름이 필요
       * 자바는 C언어와 문법이 매우 비슷
       * 데이터의 종류에 따라 변수를 구분
       */
      // 변수의 선언과 및 초기화
      // 변수를 선언을 하면 반드시 초기화를 해야 사용할 수 있다
      
      int age = 10; // <=변수의 선언과 동시에 초기화
      age = 10; // <= 변수의 초기화(최초 값을 저장)
      age = 20; // <= 데이터 초기화(reset)
      System.out.println(age);
   }
}