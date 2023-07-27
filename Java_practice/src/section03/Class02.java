package section03;

public class Class02 {
	public static void main(String[] args) {
		car mycar = new car();
		System.out.println("시동 초기화: "+mycar.powerOn );
		System.out.println("색상 초기화: "+mycar.color );
		System.out.println("시동 초기화: "+mycar.wheel );
		System.out.println("시동 초기화: "+mycar.speed );
		System.out.println("시동 초기화: "+mycar.wiperOn );
		
		
		mycar.power();
		System.out.println("시동 메서드 동작"+mycar.powerOn);
		mycar.power();
		System.out.println("시동 메서드 다시 동작"+mycar.powerOn);
		
		mycar.color="black";
		
		
		
	}
	

}
class car{
	boolean powerOn;
	String color;
	int wheel;
	int speed;
	boolean wiperOn;
	
	void power() {powerOn =! powerOn;}// true 일때 false ,false 일때 true
	void speedUp() {speed++;}
	void speedDowb() {speed--;}
	void wiper() {wiperOn=!wiperOn;}
	
	 
}