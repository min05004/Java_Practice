package section09;

public class InnerClass01 {
	public static void main(String[] args) {
		
	}

}
class A{
	static class staticInner{}
	class InstanceInner{}
	//객체생성
	staticInner st1 = new staticInner();
	InstanceInner ii1 = new InstanceInner();
	
	static void StaticMethod() { //스태틱 메서드 내 인스턴스 클래스 접근불가
		staticInner st2 = new staticInner();
		// instanceInner ii2 = new InstanceInner(); static 메서드는 인스턴스 멤버에 접근 불가능.오류
	}
	void InstanceMethod() { //인스턴스는 둘다접근 가능
		staticInner st3 = new staticInner();
	InstanceInner ii2 = new InstanceInner();
		
	}
		
	}


