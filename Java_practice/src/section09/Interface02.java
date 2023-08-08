package section09;

public class Interface02 { 
	public static void main(String[] args) {
		TourGuide guide = new TourGuide();
		guide.leisureSports();
		guide.sightseeing();
		guide.food();
	}

}

interface Privodable{ //관광지라면 필수로 들어가야하는 값(규격)
	void leisureSports();
	void sightseeing();
	void food();
	
}
class KoreaTour implements Privodable{

	@Override
	public void leisureSports() {
		System.out.println("수상스키 투어");
	}

	@Override
	public void sightseeing() {
		System.out.println("경복궁 관람 투어");
	}

	@Override
	public void food() {
		System.out.println("전주 비빔밥 투어");
		
	}
	
}

class TourGuide{
//	private Privodable tour = new KoreaTour(); // 업캐스팅 동적바인딩 코드 수정이 용이함.
	private Privodable tour = new JapanTour();
	
	public void leisureSports() {
		tour.leisureSports();
	}
	
	public void sightseeing() {
	tour.sightseeing();
}
	public void food() {
	tour.food();
}

}

class JapanTour implements Privodable{ //일본투어를 추가
@Override
public void leisureSports() {
	System.out.println("도쿄타워 번지점프 투어");
}
	


@Override
public void sightseeing() {
	System.out.println("오사카 관람 투어");
}
	


@Override
public void food() {
	System.out.println("초밥 투어");
}
	
}