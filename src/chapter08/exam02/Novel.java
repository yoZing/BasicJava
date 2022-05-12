package chapter08.exam02;

public class Novel extends Book{
	public Novel(String title, String author) {
		super(title, author);
	}

	@Override
	public int getLateFee(int lateDays) {
		int lateFee;
		return lateFee = lateDays * 300;		
	}
	
}
