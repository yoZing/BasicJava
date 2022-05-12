package chapter13_01;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	// 생성자
	public BoardDao() {
	}

	// 메소드
	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<Board>();
		list.add(new Board("제목1", "내용1"));
		list.add(new Board("제목2", "내용2"));
		list.add(new Board("제목3", "내용3"));
		return list;

	}

	public String getTitle() {
		return getTitle();
	}

	public String getContent() {
		return getContent();
	}
}
