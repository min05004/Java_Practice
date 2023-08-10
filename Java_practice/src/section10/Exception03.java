package section10;

public class Exception03 {
	public static void main(String[] args) {
		
		// 외부로 접속
		int a=0;
		int b=2;
		try {
			
			System.out.println("외부로 접속");
			int c=b/a;
		
		}catch(Exception e) {
			System.out.println("오류가 발생하였습니다.");
		}
		finally {
			System.out.println("연결 해제");
		}
	}

}
