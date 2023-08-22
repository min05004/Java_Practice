package section13;

import java.util.Stack;

/*Stack
 * 후입 선출
 * top : 삽입 ,삭제
 * bottom 
 *
 */

public class Stack01 {
	public static void main(String[] args) {
		Stack<String> s = new Stack();
		s.push("apple");
		s.push("banana");
		s.push("cherry");
		System.out.println(s);
		
		// pop : 삭제 top 위치한 것 부터
		System.out.println("pop : " + s.pop());
		System.out.println(s);
		
		//peek 
		System.out.println("peek : " + s.peek());
		
		//search : 나중값 부터 순서 매겨서 보여짐.
		System.out.println(s.search("apple"));
		
		
	}

	
}
