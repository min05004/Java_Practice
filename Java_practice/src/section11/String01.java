package section11;
/*
 * String 클래스
 * 기본 자료형 선언 처럼 사용한다.
 * String 변수명 = "값"
 * 
 * 
 */


public class String01 {
	public static void main(String[] args) {
	 String str = "hello";
	 System.out.println(str.concat("world"));
	 System.out.println(str);
	 //concat - 문자열 추가 ,str 자체가 변경되는것은 아님.
	 //substring(시작위치 , 끝위치) 내가 지정한 시작 ~ 끝 위치 전까지 가지고온다.
	System.out.println(str.substring(2,4));
	System.out.println(str.substring(3)); //시작부터 끝까지 가지고 온다.
	
	//length()
	System.out.println(str.length());
	//toUppercase,toLowerCase
	System.out.println(str.toUpperCase());
	System.out.println("TesT".toLowerCase());
	
	
	//charAt(인덱스),inndexOf(문자열)
	System.out.println(str.charAt(0));
	System.out.println("hello world".indexOf("world")); //-1이 나오면 못찾은것.맞는 글자가 없는것.
	//equals- true,false 값으로 나옴.
	System.out.println(str.equals("hello"));
	System.out.println(str.equals("HELLO"));
	
	//replace, replaceAll
	System.out.println("hello world".replace('l','L'));//문자 한개
	System.out.println("hello world".replaceAll("hello","bye"));//문자열
	
	
	
	
	}

}
