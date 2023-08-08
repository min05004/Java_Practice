package section09;
/*
 * 익명클래스는 인터페이스 혹은 추상클래스를 일회성으로 구현할때 사용
 * 
 */
public class Anonymous02 {
	public static void main(String[] args) {
		Inter1 it = new Inter1() { // 인터페이스는 객체를 생성할수 없기 때문에 
			
			public void f1() { //일회성으로 익명 클래스를 만들어서 
				System.out.println("inter imple f1()");
			}};
		it.f1();
		}
	}


interface Inter1{
	void f1();
}
//일반 클래스생성  인터페이스 f1를 구현.
class Inter1mpl implements Inter1{

	@Override
	public void f1() {
			 
		 }
	}