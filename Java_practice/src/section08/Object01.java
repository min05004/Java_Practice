package section08;
/*
 * 
 * 
 */


public class Object01 {
	public static void main(String[] args) {
	Aclass a1 = new Aclass();
	Aclass a2 = new Aclass();
	System.out.println(a1.toString()); //주소값 나옴
	//toString() : 객체 정보를 문자열 출력,생략가능.
	System.out.println(a1.equals(a2));
	//equals() : 두 객체가 동일한가를 비교.
	System.out.println(a1.getClass());
	//getcalss(): 객체의 클래스 정보를 가지고옴.
	}

}
class Aclass{
	
}