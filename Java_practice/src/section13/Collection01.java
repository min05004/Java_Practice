package section13;
/*
 * Collection
 * 데이터를 효율적으로 다루기 위한 클래스의 집합
 * 
 * 자료구조 Data Structure
 * 스택 - 후입선출 (나중에 들어온 데이터가 먼저 나간다)
 * 
 * 컬렉션 인터페이스를 구현하는 클래스
 * Set
 * List
 * Queue
 * Map
 * 
 * Iterator 반복자
 * - 순회해서 접근가능하게 보여주는것
 * 
 * Generic(제네릭) : 클래스,메서드 둘다 사용가능
 * 구현<알파벳>, E : 배열, T : 자료형 , K : 키타입, V : 값타입
 * 
 * 클래스가 다룰 객체를 미리 명시하는 기법
 * 의미 : 제네릭 == 일반화 
 * 모든 종류의 타입을 다룰 수 있도록, 
 * 클래스나 메서드를 타입 매개변수를 이용하여 선언한 기법
 * 
 * 
 */
public class Collection01 {
	public static void main(String[] args) {
		
		Value v = new Value();
		v.typeSearch(3);
		v.typeSearch(3.14); //업그레이드 되면서 <Inteager> 생략 가능
		
		
		
		
		
	}

}
class Value {
	public <T> void typeSearch(T x) {
		if(x instanceof Integer ) { 
			System.out.println(x + "는 정수 입니다.");
		}
		else if(x instanceof Double || x instanceof Float) {
			System.out.println(x + "는 실수 입니다.");
		}
		else if(x instanceof Character) {
			System.out.println(x + "는 문자형 입니다.");
		}
		
		else if(x instanceof String) {
			System.out.println(x + "는 문자열 입니다.");
		}
		else if(x instanceof Boolean) {
			System.out.println(x + "는 논리형 입니다.");
		}
		

	}
}