package section03;

public class Class01 {
	public static void main(String[] args) {
	//자료형 변수 =  new 객체 값;
		//클래스와 같은 명을 호출해서 객체값을 생성 new값을 생성해서 참조변수를 생성 
		ClassA ca = new ClassA();
		System.out.println(ca.x);
		ca.f1();//. ~안에 있는 값 호출 / 객체변수.필드명 : 객체 안에 있는 값을 사용한다는 것은?객체 내 변수,메서드를 사용한다는것.
		
	ca.x=30;
	System.out.println(ca.x);
	}

}

class ClassA{
	int x =10; //변수 x 10이란 값을 넣음
	void f1() {
		System.out.println("f1()"); //출력 명령값을 실행하는 명령  
	}
	
}