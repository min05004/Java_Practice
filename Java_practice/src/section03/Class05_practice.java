package section03;

public class Class05_practice {
	public static void main(String[] args) {
		System.out.println(Bus.wheel);
		Bus mybus1 = new Bus();
		System.out.println(mybus1.speed);
	
		Bus mybus2 = new Bus();
		System.out.println("<변경 전>");
		System.out.println("mybus1.speed: " + mybus1.speed);
		System.out.println("mybus2.speed: " + mybus2.speed);
		System.out.println("mybus1.wheel:" + mybus1.wheel);
		System.out.println("mybus2.wheel:" + mybus2.wheel);

		mybus2.speed = 100;
		mybus2.wheel =5; //클래스 변수 이기 때문에 값을 공우 하나가 변경되면 모두 변경됨.
		

		
		System.out.println("<변경 후 >");
		
		System.out.println("mybus1.speed: " + mybus1.speed);
		System.out.println("mybus2.speed: " + mybus2.speed);
		System.out.println("mybus1.wheel:" + mybus1.wheel);
		System.out.println("mybus2.wheel:" + mybus2.wheel);
	
	}

}

class Bus {
	static int wheel =4; //클래스 변수
	int speed; //인스턴스 변수
}