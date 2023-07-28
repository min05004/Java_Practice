package section03;

public class Class04 {
	public static void main(String[] args) {
		Member member1 = new Member();
		Member member2 = new Member();
		Member member3 = new Member();
		Member member4 = new Member();
		
		member1.name="김철수";
		member1.age= 28;
		member1.gender= "남";
		
		member2.name="이철수";
		member2.age= 28;
		member2.gender= "여";
		
		member3.name="심철수";
		member3.age= 28;
		member3.gender= "남";
		
		member4.name="사철수";
		member4.age= 28;
		member4.gender= "여";
		
		Member.centerName="bye"; //stactic 으로 만들어짐
		
		member1.info();
		member2.info();
		member3.info();
		member4.info();
		
		
		}
	}
	class Member{
		static String centerName = " hello"; // 동일한 내용을 가지고 있는 변수는 클래스 변수로 만들기.
		String name;
		int age;
		String gender;
		
		
		void info() {//각각의 값을 출력할 수 있게 해줌.
			System.out.println("centerName"+centerName);
			System.out.println("Name"+ name);
			System.out.println("age"+age);
			System.out.println("gender"+gender);
		}
		
}
