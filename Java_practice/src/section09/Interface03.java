package section09;

public class Interface03 {
	public static void main(String[] args) {
		Mycellphon phone1 = new Mycellphon();
		Camera Phone2 = new Mycellphon();
		Call Phone3 = new Mycellphon();
		Clock Phone4 = new Mycellphon();
		Memo Phone5 = new Mycellphon();
		
		PhoneUser user1 =new PhoneUser();
		user1.call(phone1); // call 인터페이스를 구현
	//	user1.call(Phone2); //call 인터페이스와 다른 값이 들어감
		user1.call(Phone3); //call 이라는 인터페이스의 업캐스팅
	//	user1.call(Phone4);
	//	user1.call(Phone5);
		
	}

}
interface Camera{
	void photo();
}
interface Call{
	void calling();
	
}
interface Memo{
	void write();
	
}
interface Clock{
	void clock();
	
}
class Mycellphon implements Camera,Call,Clock,Memo{ //다중 가능.

	@Override
	public void clock() {
		System.out.println("시간 입니다.");
	}

	@Override
	public void calling() {
		System.out.println("전화 입니다.");
	}

	@Override
	public void photo() {
		System.out.println("사진 입니다.");
		
	}

	@Override
	public void write() {
		System.out.println("메모 입니다.");
		
	}}
	

class PhoneUser{
	void call(Call c) { //폰 유저의 반환값 call에 인터페이스 Call의 변수값이 들어감
		System.out.println("전화를 걸었습니다.");
	}
}