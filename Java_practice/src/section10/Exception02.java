package section10;

public class Exception02 {
	public static void main(String[] args) {
		try {
			int[]a = {2,0};
			int b=4;
			int c = b/a[2]; // 배열의 인덱스가 0,1만 있음 -오류 발생
			System.out.println(c);
			
		}catch(ArithmeticException e) {
			System.out.println("산술 오류");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("배열 길이 오류");
		}
		System.out.println("예외처리 공부중 ");
	}

}
