package section10;

public class Exception07 {
	public static void main(String[] args) {
		int age = -19;
		try {
			ticketing(age);
			
		}catch(AgeException e) {
			e.printStackTrace(); //어떤 오류가 발생하는건지 출력해줘
		}
	}
	public static void ticketing(int age) throws AgeException{
		if(age<0) {
			throw new AgeException("나이가 잘못 입력되었습니다.");
			
		}
	}

}
class AgeException extends Exception{ //예외 클래스 상속을 사용
	public AgeException() {}
	public AgeException(String message) {
		super(message);
	}
}