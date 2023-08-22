package section13;

import java.util.HashMap;
import java.util.Scanner;

/*
 * Map
 * 키 - 값을 참조 할 수 있는 구조
 * 인터페이스이기 때문에 업캐스팅이 필요
 * 
 * get(Object key) - 값을 반환
 * Set(Key>KeySet() - 키들을 Set 형태로 반환,순서대로 반환
 * put(k,v)-키와 값을 요소로 추가.
 * 
 * HashMap - key의 중복을 허용하지 않음, Value 의 중복은 허용
 *저장된 위치값으로 하면 가장 빠르게 데이터를 찾아올 수 있다.
 *메모라 낭비를 최소화 하기위에 새로운 주소 값을 생성하여 메모리를 래핑하는 기법
 *
 * 
 */
public class Map01 {
	public static void main(String[] args) {
		
		HashMap<String,String> hm = new HashMap();
		Scanner sc = new Scanner(System.in);
	
		hm.put("apple","사과");
		hm.put("paper","종이");
		hm.put("flower","꽃");
		
		String voca;
		System.out.println("알고 싶은 단어를 입력하세요");

		//containsKey(voca) : key가 HashMap에 존재하면 true
		voca = sc.nextLine();
		if(hm.containsKey(voca)) { //get(key) : value 값 반환
			System.out.println("해당하는 뜻은 : " + hm.get(voca));
		}else {
			System.out.println("해당 단어의 뜻은 데이터베이스에 없습니다.");
		}
		
		
		
		
	}

}
