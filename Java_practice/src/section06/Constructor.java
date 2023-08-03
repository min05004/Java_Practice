package section06;

public class Constructor {
	// 객체 생성 시 호출되는 메서드.-생성자.
	public static void main(String[] args) {
	Aclass a =	new Aclass();
	}

}
class Aclass{
	//기본생성자 default 생성자 만들기.
	public Aclass() {
		System.out.println("A 클래스 기본생성자( )"); 
		
	}
}