package chapter11;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		//옛날 방식
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
		
		String strNow2 = sdf.format(now);
		String strNow3 = sdf2.format(now);
		System.out.println(strNow2);
		System.out.println(strNow3);
		
		//최근 방식
		System.out.println(LocalDate.now());
		LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"));
		String datetime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh:mm:ss"));
		System.out.println(datetime);
	}
}
