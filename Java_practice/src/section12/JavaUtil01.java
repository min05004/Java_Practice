package section12;


/*System.currentTimeMils()
 * : 현재 운영체제의 시각을 long 타입으로 반환.
 * 1970년1월1일 기준으로 현재까지 시간이며 1/1000초 단위까지 환산.
 * 
 * 
 */
public class JavaUtil01 {
	public static void main(String[] args) {
	long start = System.currentTimeMillis();
	System.out.println("시작시간 : "+ start);
		int a =0;
		for(int i=1; i<10000000; i++) {
			a++;
		}
		long end =System.currentTimeMillis();
		System.out.println("종료시간 : "+ end);
		System.out.println("작업시간 : "+ end);
	}
	

}
