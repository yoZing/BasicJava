package chapter13_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		for (Entry<String, Integer> entry : map.entrySet()) {
			totalScore = totalScore + entry.getValue();
			if (entry.getValue() > maxScore) {
				maxScore = entry.getValue();
				name = entry.getKey();
			}
		}
		System.out.println("평균점수 : " + totalScore / map.size());
		System.out.println("최고점수 : " + maxScore);
		System.out.println("최고점수를 받은 아이디 : " + name);
	}
}