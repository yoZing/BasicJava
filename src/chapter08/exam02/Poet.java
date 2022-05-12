package chapter08.exam02;

public class Poet extends Book {
	public Poet(String title, String author) {
		super(title, author);
	}

	@Override
	public int getLateFee(int lateDays) {
		int lateFee;
		return lateFee = lateDays * 200;
	}
}
