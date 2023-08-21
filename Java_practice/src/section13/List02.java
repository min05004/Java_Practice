package section13;
import java.util.*;
/*
 * 
 * 
 */
public class List02 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		LinkedList ll = new LinkedList();
		
		long start = System.currentTimeMillis();
		
		for(int i =0;i<100000;i++) {
			al.add(0,String.valueOf(i));
		}
		long end = System.currentTimeMillis();
		System.out.println("ArratList 작업시간 : "+(end-start));
		
		start = System.currentTimeMillis();
		for(int i =0;i<100000;i++) {
			ll.add(0,String.valueOf(i));
		}
		end = System.currentTimeMillis();
		System.out.println("LinkList 작업시간 : " + (end -start));
		
		
	}

}
