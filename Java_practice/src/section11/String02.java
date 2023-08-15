package section11;

public class String02 {
	public static void main(String[] args) {
		String str = "test";
		StringBuffer buffer = new StringBuffer("test");
		
		str.replace('t', 'T');
		System.out.println(str);
		
		buffer.replace(1, 3, "ES");
		System.out.println(buffer);
	     
		//nextToken() : 다음 토큰으로 이동
		//hasMoreToken(): 다음 토큰이 존재 하면 true,false
		
	
	}

}
