package chapter08.exam02;

import java.util.Objects;

public abstract class Book {
	private int number; // 관리번호
	private String title; // 책의 제목
	private String author; // 책의 저자
	private static int countOfBooks = 0; // 만들어진 Book 객체 개수, 선언과 동시에 0으로 초기화

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.number = countOfBooks;
		countOfBooks++;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}


	@Override
	public int hashCode() {
		return Objects.hash(author, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(title, other.title);
	}

	public abstract int getLateFee(int lateDays);

	public String toString() {
		return String.format("관리번호: %d, 책의 제목: %s, 책의 저자: %s(일주일 연체료: %,d원)", number+1, getTitle(), getAuthor(), getLateFee(7));
	}
}
