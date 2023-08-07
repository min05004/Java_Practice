package section07;

public class Extends02 {
	public static void main(String[] args) {
		Leader leader = new Leader();
		leader.say();
		
	}

}
	//다중상속 지원 안함, 클래스 앞 final키워드로 다른클래스 상속 불가
//final class Parent{}
//class Child extends Parent{}


/*
 * 오버 로딩 : 중복 정의 / 함수명,개수,타입이 다르면 중복 정의 가능
 * 오버 라이딩: 재정의
 *상속관계에 있는 자식클래스가 부모클래스의 메서드를 다시 정의(덮어쓰다)
 * 
 */

	class Student2 {
		void lean() {
			System.out.println("배우기");
		}
		void eat() {
			System.out.println("밥먹기");
			
		}
		void say() {
			System.out.println("안녕하세요!");
		}
	}
	
	class Leader extends Student2{
		void lead() {}
		void say() { //메서드 오버라이딩
			System.out.println("선생님께 인사!");
			super.say(); //부모클래스 내 필드를 사용하고 싶을때 super키워드 사용
		}
	}