package section09;

public class Interface01 {
	public static void main(String[] args) {
		//Ainter a;
		// a.x = 30; 상수이기에 값을 못바꿈.
		B b = new B();
		b.methodA();
		b.methodB();
		
	}

}
interface Ainter{
	final int x=10; //상수만 가능 (final 생략가능)
	final int y=20;
	abstract void methodA();
	void methodB(); //abstract 생략가능.
}
class B implements Ainter{

	@Override
	public void methodA() {
		System.out.println("methodA");
	}

	@Override
	public void methodB() {
		System.out.println("methodB");
		
		
	}
	
	
}