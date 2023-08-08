package section09;

public class Abstract01 {
	public static void main(String[] args) {//객체 배열 업캐스팅
		Shape shapes[]= new Shape[3];
		shapes[0]=new Rect();
		shapes[1]=new circle();
		shapes[2]=new Line();
		//부모객체배열 요소에 자식 값 넣기 업캐스팅!
		
		for(int i=0;i<3;i++) {
			shapes[i].draw();
		}
	}

}

abstract class Shape{ 
	abstract void draw(); { // 추상메서드는 자식이 상속받을때 오버라이딩을 하기 때문
	}
}
class Rect extends Shape{
	void draw() {
		System.out.println("사각형을 그리다");
	}
}
class circle extends Shape{
	void draw() {
		System.out.println("원을 그리다");
	}
}
class Line extends Shape{
	void draw() {
		System.out.println("선을 그리다");
	}
}