package section11;

import java.util.StringTokenizer;

public class String03 {
	public static void main(String[] args) {
		//nextToken() : 다음 토큰으로 이동
	  //hasMoreToken(): 다음 토큰이 존재 하면 true,false
		
		String str = "kim : 010-1234-1234";
		String delim = ":";
		StringTokenizer st =new StringTokenizer(str,delim);

		System.out.println(st.countTokens());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.hasMoreTokens());
	}

}
