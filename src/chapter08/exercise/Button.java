package chapter08.exercise;

public class Button {
	OnClickListener listener;
	
	void setOneClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	void touch() {
		listener.onClick();
	}
	static interface OnClickListener {
		void onClick();
	}
}
