package section05;

public class ObjectArray {
	public static void main(String[] args) {
		//클래스명 객체 배열명 [] = new클래스명[크기];
		Aclass ar[]= new Aclass[3];
		ar[0]= new Aclass(); //ar[0]번째에 새로운 객체값을 저장해야 호출이 가능함.
		//클래스명을 통해 꼭 객체를 생성해야만 객체 내 필드 접근 가능.
		ar[0].x =100;
		ar[0].f1();
		System.out.println(ar[0].x);
		
	}

}

class Aclass{
	int x;
	void f1() {
		System.out.println("f1()");
	}
}