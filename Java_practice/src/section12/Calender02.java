package section12;

import java.util.Calendar;

public class Calender02 {
	public static void main(String[] args) {
	Calendar a = Calendar.getInstance();
	
	int year = a.get(Calendar.YEAR);
	int moth = a.get(Calendar.MONTH);
	int date = a.get(Calendar.DATE);

	
	System.out.println(year + "년"+moth+"월"+date + "일");
	System.out.print("오늘은 이번주에서 몇 일째 인가? : ");
	System.out.println(a.get(Calendar.DAY_OF_WEEK));
	
	
	System.out.print("이번 년도에서 오늘이 몇 일 때 인가 :");
	System.out.println(a.get(Calendar.DAY_OF_WEEK));
	
	System.out.print("이번달은 며칠까지 있는가 :");
	System.out.println(a.get(Calendar.DATE));
	}

}
