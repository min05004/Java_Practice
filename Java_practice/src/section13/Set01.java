package section13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Set01 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("demon");
		hs.add("바나나");
		hs.add("토마토");
		hs.add("사과");
		hs.add("cargo");
		
		TreeSet ts = new TreeSet();
		ts.add("demon");
		ts.add("바나나");
		ts.add("토마토");
		ts.add("사과");
		ts.add("cargo");
		
		Iterator it = hs.iterator();
		System.out.println("HashSet 출력");
		while(it.hasNext()) {
			System.out.print(" "+ it.next());
		}
		System.out.println();
		
		Iterator it2 =ts.iterator();
		System.out.println("TreeSet 출력");
		while(it2.hasNext()) {
			System.out.print(" "+ it2.next());
		}
		System.out.println();
		System.out.println("현재 Treeset의 크기 : " + ts.size());
	}

	
	}

