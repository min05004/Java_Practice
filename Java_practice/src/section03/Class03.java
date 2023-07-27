package section03;

public class Class03 {
	public static void main(String[] args) {
		car mycar1 = new car();
		car mycar2= new car();
		
		mycar2.color="red";
		mycar2.color="black";
		mycar1.speedUp();
		mycar2.wiper();
		
		System.out.println("mycard1의 색 :" + mycar1.color);
		System.out.println("mycard2의 색 :" + mycar2.color);

		System.out.println("mycard1의 스피드 :" + mycar1.speed);
		System.out.println("mycard1의 와이퍼 :" + mycar2.wiperOn);
		
		
		
	}
	
}
