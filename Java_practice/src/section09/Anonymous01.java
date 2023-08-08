package section09;

public class Anonymous01 {
	public static void main(String[] args) {
		OuterClass1 o = new OuterClass1() {
		void a() {
			System.out.println("새롭게 정의된 익명 클래스 메서드 입니다.");
		}
		};
		o.a();
		OuterClass1 ok = new OuterClass1();
		ok.a(); //익명클래스는 일회성.실제 클래스 내 메서드가 바뀌는것이 아님.
	}

}
class OuterClass1{
	void a() { System.out.println("method a");}
	void b() {}
	
	}
