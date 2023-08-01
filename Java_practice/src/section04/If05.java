package section04;

import java.util.Scanner;

public class If05 {
	public static void main(String[] args) {
		//중첩 if문
	String id,password;
	Scanner input = new Scanner(System.in);
	System.out.println("아이디를 입력해 주세요");
	id = input.nextLine(); //띄어쓰기 까지 입력을 받기 위해서 nextLine
			//참일떄 안에 if문이 실행.
	if(id.equals("java")) {
		System.out.println("id 일치");
		System.out.println("비밀번호 입력해세요");
		password = input.nextLine();
		
		if(password.equals("abc123")) {
			System.out.println("비밀번호 일치");
			System.out.println("로그인 성공");
		}//바로 위 조건 부정 (password)
		else {
			System.out.println("비밀번호 불일치");
		}
	}//닫힌 if문 확인 id조건문을 부정.
	else {
		System.out.println("아이디 불일치");
	}
	}
}
