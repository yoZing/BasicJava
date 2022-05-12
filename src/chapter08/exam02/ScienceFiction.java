package chapter08.exam02;

public class ScienceFiction extends Book {
	public ScienceFiction(String title, String author) {
		super(title, author);
	}

	@Override
	public int getLateFee(int lateDays) {
		int lateFee;
		return lateFee = lateDays * 600;
	}
}
