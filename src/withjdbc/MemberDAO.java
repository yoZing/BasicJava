package withjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.driver.OracleDriver;

public class MemberDAO {
	public List<MemberVo> memberList() throws Exception{
	      List<MemberVo> list = new ArrayList<MemberVo>();
	      //0. 드라이버 로딩
	      Class.forName("oracle.jdbc.driver.OracleDriver");//add throws Exception
	      //1. 드라이버 매니저를 통해 접속
	      Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "KYS95", "java");
	      //2. 작업 공간 만들기
	      Statement statement = connection.createStatement();
	      //3. 쿼리 작성 및 실행
	      ResultSet resultSet = statement.executeQuery("SELECT MEM_ID, MEM_NAME, MEM_MAIL FROM MEMBER");
	      while (resultSet.next()) {
	         String memId = resultSet.getString("mem_id");
	         String memName = resultSet.getString("mem_name");
	         String memMail = resultSet.getString("mem_mail");
	         
	         System.out.printf("%s \t %s \t %s \n", memId, memName, memMail);
	      }
	      resultSet.close();
	      statement.close();
	      connection.close(); 
	      return list;
	   }

	public MemberVo getMember(String searchId) throws Exception {

		MemberVo vo = null;
		// 1. Class.forName("oracle.jdbc.driver.OracleDriver");
		DriverManager.registerDriver(new OracleDriver());// 1번과 기능이 같음
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "KYS95", "java");
		Statement statement = connection.createStatement();
		// StringBuilder vs StringBuffer
		// 문자를 연결할 때 사용
		StringBuilder builder = new StringBuilder();
		builder.append("SELECT ");
		builder.append("    mem_id,");
		builder.append("    mem_name,");
		builder.append("    mem_regno1 || '-' || mem_regno2 MEM_REGNO,");
		builder.append("    to_char(mem_bir, 'YYYY\"년\" MM\"월\" DD\"일\"') MEM_BIR,");
		builder.append("    mem_zip,");
		builder.append("    mem_add1 || ' ' || mem_add2 MEM_ADD,");
		builder.append("    mem_hometel,");
		builder.append("    mem_comtel,");
		builder.append("    mem_hp,");
		builder.append("    mem_mail,");
		builder.append("    mem_job,");
		builder.append("    mem_like,");
		builder.append("    mem_memorial,");
		builder.append("    mem_memorialday,");
		builder.append("    mem_mileage,");
		builder.append("    mem_delete ");
		builder.append("FROM");
		builder.append("    member ");
		builder.append("WHERE ");
		builder.append("    mem_id = '" + searchId + "' ");
		builder.append("AND mem_delete is null ");
		String sql = builder.toString();
		ResultSet resultSet = statement.executeQuery(sql);
		if (resultSet.next()) {
			String memId = resultSet.getString("MEM_ID");
			String memName = resultSet.getString("MEM_NAME");
			String memRegno = resultSet.getString("MEM_REGNO");
			String memBir = resultSet.getString("MEM_BIR");
			String memZip = resultSet.getString("MEM_ZIP");
			String memAdd = resultSet.getString("MEM_ADD");
			String memHomeTel = resultSet.getString("MEM_HOMETEL");
			String memComTel = resultSet.getString("MEM_COMTEL");
			String memHp = resultSet.getString("MEM_HP");
			String memMail = resultSet.getString("MEM_MAIL");
			String memJop = resultSet.getString("MEM_JOB");
			String memLike = resultSet.getString("MEM_LIKE");
			String memMemorial = resultSet.getString("MEM_MEMORIAL");
			String memMemorialDay = resultSet.getString("MEM_MEMORIALDAY");
			String memMileage = resultSet.getString("MEM_MILEAGE");
			String memDelete = resultSet.getString("MEM_DELETE");
			vo = new MemberVo(memId, memName, memRegno, memBir, memZip, memAdd, memHomeTel, memComTel, memHp, memMail,
					memJop, memLike, memMemorial, memMemorialDay, memMileage, memDelete);
		}
		resultSet.close();
		statement.close();
		connection.close();

		return vo;
	}
	public int insertMember(MemberVo vo) {
		return 0;
	}
	public int updateMember(MemberVo vo) throws SQLException {
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "KYS95", "java");
		StringBuilder builder = new StringBuilder();
		builder.append("UPDATE ");
		builder.append("    MEMBER ");
		builder.append("SET ");
		builder.append("      MEM_NAME = ?, ");
		builder.append("      MEM_MAIL = ? ");
		builder.append("WHERE ");
		builder.append("      MEM_ID = ? ");
		String sql = builder.toString();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, vo.getMemName());
		statement.setString(2, vo.getMemMail());
		statement.setString(3, vo.getMemId());
		// executeQuery : select
		// executeUdate : insert, update, delete
		int executeUpdate = statement.executeUpdate();
		statement.close();
		connection.close();
		
		return executeUpdate;
	}
	public int deleteMember(String id) {
		return 0;
	}
}