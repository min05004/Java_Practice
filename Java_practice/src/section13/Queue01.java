package section13;

import java.util.LinkedList;
import java.util.Queue;


/*
 * 큐 Queue : 인터페이스 이므로 업캐스팅 필요
 * 줄서기 - 한쪽 끝에서 삽입이 다른 쪽 끝에서는 삭제가 일어나는 구조
 * 선입선출(First in First out)
 * front :  삭제
 * rear : 삽입
 * 
 */
public class Queue01 {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		//1. add(e)
		q.add("apple");
		q.add("banana");
		q.add("tomato");
		
		System.out.println(q);
		
		//2.Element
		System.out.println("element : "+ q.element());
		//remove : front의 위치한 데이터를 반환 후 삭제
		//offer(e) : rear 위치에 데이터 삽입.
		q.offer("peach");
		System.out.println(q);
		
		//peek() : front 위치에 있는 데이터 값 반환 삭제 노노
		
		System.out.println(q.peek());
		System.out.println(q);
		
		//poll() : front 위치에 값 반환 후 삭제
		System.out.println("pool : " + q.poll());
		System.out.println(q);
		
	}

}
