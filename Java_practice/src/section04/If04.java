package section04;

import java.util.Scanner;

public class If04 {
	public static void main(String[] args) {
		//if else if 문 : 1조건이 참 실행,1조건이 거짓이고 2조건이 참일때 실행
		Scanner sc = new Scanner(System.in);
		
		int age;
		System.out.print("나이");
		age = sc.nextInt();//정수형으로 값을 받아서 출력
		
		if(age>19) {
			System.out.println("성인");
			System.out.println("성인요금");
		}
		else if (age>13) { //13< age <=19
			System.out.println("청소년");
			System.out.println("청소년 요금");
		}
		else if (age>8) { //8< age <=13
			System.out.println("어린이");
			System.out.println("어린이 요금");
		}else //age <=8
		System.out.println("유아");
		System.out.println("유아요금");
		System.out.println("결제 진행");	
	}
	}
		



