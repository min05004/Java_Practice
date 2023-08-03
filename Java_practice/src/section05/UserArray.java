package section05;

import java.util.Scanner;

public class UserArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User user[] =new User[4]; //객체배열 만들기
		for(int i=0; i<4;i++) {
			user[i] = new User(); //객체 값을 채워주기
			
		} //알맞은 값을 넣어주기
		for(int i=0;i<4;i++) {
			System.out.println(" name : ");
			user[i].name=sc.next();
			System.out.println(" phone : ");
			user[i].phone =sc.next();
			System.out.println(" age : ");
			user[i].age =sc.nextInt();
			System.out.println(" gender : ");
			user[i].gender =sc.next();
		}
		for(int i=0;i<4;i++) {
			user[i].info();
		}
	}

}
class User{
	String name;
	String phone;
	String gender;
	int age;
	
	void info() {
		System.out.println("name :" + name);
		System.out.println("phone :" + phone);
		System.out.println("gender :" + gender);
		System.out.println("age :" + age);
	}
	
}