package section08;
/*
 * 다형성
 * 한가지 타입의 여러가지 형태의 인스턴스를 가질수 있는것.
 * 
 * [형변환]
 * 업캐스팅 - 자식이 부모클래스의 참조변수로 형변환 되는것
 * 
 * 다운캐스팅 - 
 * 
 */
public class Object02 {
	public static void main(String[] args) {
		Student st1 =new Student("가길동",17,"게임하기",3);
		st1.info();
		st1.study();
		//업캐스팅 - 값은 자식값으로 채우고 공간은 부모 클래스로 만들어진 공간.
		Human h1 = new Student("나길동",17,"롤하기",3);
		h1.info();
		
	}

}
class Human {
	String name;
	int age;
	String hobby;
	public Human(String name, int age, String hobby) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
	

void info() {
	System.out.println("name : "+ name);
	System.out.println("age : "+ age);
	System.out.println("hobby : "+ hobby);
}
}
class Student extends Human{
	int grade; //학생만의 매개변수
	public Student(String name,int age,String hobby,int grade){
		super(name,age,hobby);//부모클래스의 매개변수 생성을 호출하겠다.
		this.grade=grade;
	
	}
	void info() {
		super.info();
		System.out.println("grade : "+grade);
		
	}
	void study() {
		System.out.println("공부하기");
	}
}
