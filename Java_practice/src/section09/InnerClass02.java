package section09;

import section09.OuterClass.Inner;

public class InnerClass02 {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		System.out.println("outerclass a 의 값: " + oc.a);
		System.out.println("outerclass b 의 값: "+ OuterClass.b); //객체를 생성하지 않고 클래스 명으로 출력
		
		System.out.println("=====inner class 접근하기 =====");
		OuterClass oc2 = new OuterClass();
		OuterClass.Inner i = oc2.new Inner();
		
		System.out.println("inner의 c 의 값:" + i.c);
		i.innerMethod();
		
		
		OuterClass.StaticInner si = new OuterClass.StaticInner();
		System.out.println("staticInner 의 d의 값: "+ si.d);
		
		si.staticMedhod(); //객체를 사용하지 않는다 클래스명을 사용해서 호출 가능.
		OuterClass.StaticInner.staticMedhod(); // 동일 값 정확한 표기명
	}

}

class OuterClass{
	int a =3;
	static int b =4;
	class Inner{
		int c =5;
		public void innerMethod() {
			System.out.println("inner class");
		}
}
	static class StaticInner{
		int d=6;
		static int stat =10;
		public static void staticMedhod() {
			System.out.println("static inner");
		}
	}
	}