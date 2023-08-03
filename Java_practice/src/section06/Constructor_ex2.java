package section06;

public class Constructor_ex2 {
	public static void main(String[] args) {
		Iphone myphone1 = new Iphone();
		Iphone myphone2 = new Iphone("아이폰 13","화이트",70);
		System.out.println(myphone1.color);
		System.out.println(myphone2.capacity);
		
	}

}
class Iphone{
	String model;
	String color;
	int capacity;
	
	Iphone(){} //디폴트 생성자
	Iphone(String model,String color,int capacity){
	this.model =model;
	this.color = color;
	this.capacity = capacity;
}
	void info() {
		System.out.println("model: "+ model);
		System.out.println("color: "+ color);
		System.out.println("capacity: "+ capacity);
	}
}
