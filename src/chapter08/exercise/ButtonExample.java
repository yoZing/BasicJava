package chapter08.exercise;

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOneClickListener(new CallListener());
		btn.touch();
		
		btn.setOneClickListener(new MessageListener());
		btn.touch();
	}
}
