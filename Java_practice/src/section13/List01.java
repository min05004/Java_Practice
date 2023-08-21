package section13;
/*
 * List : 데이터를 일렬로 늘어놓은 구조
 * 
 * 순서가 있음,중복허용
 * 
 * ArrayList
 * 요소 추가 시 0번 인덱스부터 차례대로 요소저장
 * 
 */

import java.util.ArrayList;

public class List01 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("e");

		System.out.println("초기상태");
		System.out.println(list1);
		
		System.out.println("인덱스 1위치에 B추가");
		list1.add(1,"B");
		System.out.println(list1);
		
		
		System.out.print("인덱스 2 위치의 값 삭제 : ");
		list1.remove(2);
		System.out.println(list1);
		
		System.out.println("인덱스 2 위치의 값 변환 : " + list1.get(2));
		
		
	}

}
