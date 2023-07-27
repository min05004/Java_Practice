package section02;

public class Method01 {
	//두수를 전달 받아 사칙연산 구현하기 정수 실수 모두 가능
	public static void main(String[] args) {
		//정수
		System.out.println("sum(10,20)"+ sum(10,20));
		System.out.println("sub(10,20)"+ sub(10,20));
		System.out.println("div(10,20)"+ div(10,20));
		System.out.println("mul(10,20)"+ mul(10,20));
		//실수
		System.out.println("sum(1.2,2.3)"+ sum(1.2,2.3));
		System.out.println("sub(1.2,2.3)"+ sub(1.2,2.3));
		System.out.println("div(1.2,2.3)"+ div(1.2,2.3));
		System.out.println("mul(1.2,2.3)"+ mul(1.2,2.3));
		//문자열
		System.out.println("sum(Hello World)"+"Hi");
		
		
		
}

	static int sum(int x,int y){return x+y;}
	static int sub(int x,int y){return x-y;}
	static int mul(int x,int y){return x*y;}
	static int div(int x,int y){return x/y;}

	static double sum(double x,double y){return x+y;}
	static double sub(double x,double y){return x-y;}
	static double mul(double x,double y){return x*y;}
	static double div(double x,double y){return x/y;}
	
	static String sum(String x,String y){return x+y;}
	

}