package section11;
/*
 * Wrapper 클래스
 * 기본 자료형을 객체로 사용하기 위해서.
 * Wrapper 클래스명 객체명 = new Wrapper 클래스명 (값);
 * 
 * 
 * 
 */
public class Wrapper01 {
	public static void main(String[] args) {
		int i =30;
		Integer ii = new Integer(i); // Integer i = 3;이렇게 사용을 권장.
		System.out.println(ii);
		//ii가 객체로 변형.
		
		double d =3.14;
		Double dd = new Double(d);
		System.out.println(dd);
		
		
		
		
	}

}
