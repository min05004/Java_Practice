package section11;

import java.util.Random;

public class Random01 {
	public static void main(String[] args) {
		Random r = new Random();
		Random r1 = new Random(); 
		Random r2 = new Random(2);// 동일한 시드값은 나오는 값도 같게 나온다.
		Random r3 = new Random(2);
		
		for(int i= 0; i<5; i++) {
			System.out.println("r : " + r.nextInt());
		}
		for(int i=0;i<5;i++) {
			System.out.println("r1 : " + r1.nextInt());
			
		}
		for(int i=0;i<5;i++) {
			System.out.println("r2 : " + r2.nextInt());
			
		}
		for(int i=0;i<5;i++) {
			System.out.println("r3 :"+i +"번째 값" + r3.nextInt());
			
		}
	}

}
