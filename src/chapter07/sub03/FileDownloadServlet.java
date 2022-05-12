package chapter07.sub03;

public class FileDownloadServlet extends HttpServlet{
	public FileDownloadServlet() {		
	}
	@override
	public void service() {
		System.out.println("파일 다운로드합니다.");
	}
}
