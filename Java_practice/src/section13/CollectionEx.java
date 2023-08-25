package section13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
 * HashMap
 * 인터페이스의 한종류
 * Map의 모든 속성을 갖고 있으며 저장방식 동일
 * Key의 중복은 허용하지 않고 Value 는 허용
 * 
 * 사용자의 이름과 전화번호를 저장하는 전화번호 부 만들기
 * - 고객 저장,고객검색 ,전체보기,끝내기
 * - 모든 메서드에서 알아야 할 필드 : 클래스 영역 내에서 생성
 * -main은 static 영역이므로 main영역에서도 사용하기 위해 static 변수로 
 * 
 * HashMap 메서드
 * 
 * 생성
 * 삽입
 * 가져오기
 * Key 존재 확인 하기 
 * 
 * 
 */
public class CollectionEx {
	static HashMap<String, String> hm = new HashMap<String, String>();//메인에서 사용해야해서 전역변수 static
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//고객이 해당 넘버를 고른 후 정보를 보여지게 할 수 있게 
		int choice;
		while(true) { //무한반복
			System.out.println("[ 전화번호부 프로그램 ]");
			System.out.println("1.고객정보 저장");
			System.out.println("2.고객정보 검색");
			System.out.println("3.고객정보 출력");
			System.out.println("4.끝내기");
			System.out.print("해당 번호를 입력 : ");
			
			choice =sc.nextInt();
			if(choice==1) {
				System.out.println("---------- 고객정보 저장 -------------");
				insert();
			}
			else if(choice ==2) {
				System.out.println("---------- 고객정보 검색 -------------");
				search();
			}
			else if(choice ==3) {
				System.out.println("----------- 고객정보 출력 ------------");
				show();
			}
			else if(choice ==4) { //종료
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else { //해당 사항이 모두 없으면 출력
				System.out.println("잘못 입력 하셨습니다.");
			}
			
		}
	}
//출력해야할 정보 메서드 기입
	//1.고객정보 저장 부분 메서드
	public static void insert() {
		String name,phone; //입력받을 변수 만들기
		System.out.print("저장할 고객의 이름: ");
		name = sc.next();
		//name이 key이므로 중복허용 불가능
		if(hm.containsKey(name)) { //만약 포함된 네임이 있으면 
			System.out.println("이미 존재하는 이름입니다.");
			return;//종료
			
		}else { //포함되어있는 네임이 없다면
			System.out.println("저장할 고객의 번호 : ");
			phone = sc.next();
			hm.put(name, phone);
			System.out.println("저장완료!");
		}
		
	}//2.고객정보 검색 부분 메서드
	public static void search() {
		System.out.print("검색할 이름 : ");
		String searchName = sc.next();
		//searchName 이 hm에 존재해야 검색이 가능!
		if(hm.containsKey(searchName)) {
			System.out.println("검색완료!");
			System.out.println("검색된 전화번호 : " + hm.get(searchName)); //존재하면 hm에서 번호를 가지고 올수 있게
			
		}else {
			System.out.println("검색된 이름이 없습니다.");
		}
	//	3. 저장된 고객정보 모두 출력
		
		
	}
	public static void show() {
		Set<String>keyset = hm.keySet();
		Iterator<String> i = keyset.iterator() ;
		while(i.hasNext()) {
			String curName = (String) i.next();
			System.out.println("name : " + curName + "  phone :" + hm.get(curName) ) ;
		}
		
	}
}

