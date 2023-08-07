package section07;

public class Extends03 {
public static void main(String[] args) {
	SportCar mycar = new SportCar("red",300);
	System.out.println(mycar.color);
	System.out.println(mycar.speedlimit);
}
}

class Car{
	int wheel;
	int speed;
	String color;
	//Car(){}//1.부모생성자 디폴트 값 만들어주기.
	Car(String color){
		this.color=color;
	}
}
class SportCar extends Car{ //1.자식클래스에서 생성자 호출 시 부모클래스의 디폴트 생성자가 자동으로 호출됨
	int speedlimit;
	SportCar(String color,int speedlimit){
		super(color); //2.호출할 부모 만들어주기 매개변수 만들어주기.
		this.color=color;
		this.speedlimit=speedlimit;
		
	}
	
}