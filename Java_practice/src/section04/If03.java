package section04;

public class If03 {
	public static void main(String[] args) {
		int age = 15;
		
		if(age>19) {
			System.out.print("성인입니다.");
			System.out.println("성인요금이 적용됩니다.");
			//else는 항상 바로 위에 오는 if문의 조건식만!! 부정한다.
		} else { //age <=19
			System.out.println("청소년 입니다.");
			System.out.println("청소년 요금이 적용 됩니다.");
		}
		System.out.println("결제를 진행해 주세요");
	}

}
