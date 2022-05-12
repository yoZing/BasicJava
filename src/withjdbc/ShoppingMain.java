package withjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class ShoppingMain {
	static MemberDAO dao = new MemberDAO();
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		menu: while (true) {
			System.out.println("=====================================================================");
			System.out.println("0. 프로그램 종료 | 1. 회원목록 | 2. 회원상세 | 3. 회원등록 | 4. 회원수정 | 5. 회원삭제");
			System.out.print("메뉴를 선택하세요> ");
			int menu = Integer.parseInt(scanner.nextLine());
			switch (menu) {
			case 1:
				List<MemberVo> list = dao.memberList();
				for (MemberVo vo : list) {
					System.out.printf("%s \t\t %s \t\t %s \n", vo.getMemId(), vo.getMemName(), vo.getMemMail());
				}
				break;
			case 2:
				System.out.print("조회할 아이디를 입력하세요> ");
				String searchId = scanner.nextLine();
				MemberVo vo = dao.getMember(searchId);
				
				if (vo != null) {
					System.out.println("아이디: " + vo.getMemId());
					System.out.println("회원명: " + vo.getMemName());
					System.out.println("주민등록번호: " + vo.getMemRegNo());
					System.out.println("생년월일: " + vo.getMemBir());
					System.out.println("우편번호: " + vo.getMemZip());
					System.out.println("주소: " + vo.getMemAdd());
					System.out.println("집 전화번호: " + vo.getMemHomeTel());
					System.out.println("회사 전화번호: " + vo.getMemComTel());
					System.out.println("핸드폰번호: " + vo.getMemHp());
					System.out.println("이메일: " + vo.getMemMail());
					System.out.println("직업: " + vo.getMemJob());
					System.out.println("취미: " + vo.getMemLike());
					System.out.println("기념일 종류: " + vo.getMemMemorial());
					System.out.println("기념일: " + vo.getMemMemorialDay());
					System.out.println("마일리지: " + vo.getMemMileage());
					System.out.println("탈퇴 정보: " + vo.getMemDelete());
				} else {
					System.out.println("조회한 아이디의 정보가 없습니다.");
				}
				break;
			case 3:
				break;
			case 4:
				System.out.println("수정할 회원 아이디를 입력하세요.");
				String memId = scanner.nextLine();
				System.out.println("수정할 회원 아이디의 이름을 입력하세요.");
				String memName = scanner.nextLine();
				System.out.println("수정할 회원 아이디의 메일 주소를 입력하세요.");
				String memMail = scanner.nextLine();
				int updateMember = dao.updateMember(new MemberVo(memId, memName, memMail));
				if (updateMember > 0) {
					System.out.println("정보가 변경되었습니다.");
				} else {
					System.out.println("정보가 변경되지 않았습니다.");
				}
				break;
			case 5:
				break;
			case 0:
				System.out.println("이용해주셔서 감사합니다.");
				scanner.close();
//				System.exit(0);
				break menu;
			}
		}
	}
}
