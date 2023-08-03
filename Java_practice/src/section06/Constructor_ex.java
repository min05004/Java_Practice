package section06;

public class Constructor_ex {
	public static void main(String[] args) {
		Cellphone myphon = new Cellphone();
		System.out.println(myphon.model);
	}

}
class Cellphone{
	String model = "갤럭시";
	String color = "레드";
	int capacity = 60;
	
	Cellphone(){
		System.out.println("model : " + model);
		System.out.println("color : " + color);
		System.out.println("capacity : " + capacity);
	}
	
}