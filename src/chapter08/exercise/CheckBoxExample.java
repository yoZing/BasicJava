package chapter08.exercise;

import chapter08.exercise.CheckBox.OnSelectListener;

public class CheckBoxExample {
	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
		checkBox.setOnSelectListener(new OnSelectListener() {
			@Override
			public void onSelect() {
				System.out.println("배경을 변경합니다.");
			}

		});

		checkBox.select();

	}
}
