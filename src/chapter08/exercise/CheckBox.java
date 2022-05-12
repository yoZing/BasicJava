package chapter08.exercise;

public class CheckBox {
	// 필드
	private OnSelectListener listener;
	
	// 생성자
	
	// 메소드
	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}
	
	void select() {
		listener.onSelect();
	}
	
	// 중첩 인터페이스
	static interface OnSelectListener {
		void onSelect();
	}
}
