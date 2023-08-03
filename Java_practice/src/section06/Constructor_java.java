package section06;

public class Constructor_java {
	public static void main(String[] args) {
		Bclass b1 = new Bclass("가길동");
	//	Bclass b2 = new Bclass(); 오류 
		
		System.out.println(b1.name);
		
	}

}
class Bclass{
	String name;
	
	Bclass(String name2){//매개 변수 생성자
		System.out.println("B클래스 매개변수 생성자 호출 ");
		name=name2; // name 멤버변수
	}
}
