package section08;

public class Upcasting01 {
	public static void main(String[] args) {
		
		A obj = new B();//부모변수에 자식값을 넣는것 업캐스팅
		obj.methodA();
		//obj.methodB();
		
		
	}

}

class A{
	void methodA() {
		System.out.println("methodA");
	}
}
class B extends A{
	void methodB() {
		System.out.println("methodB");
	}
}