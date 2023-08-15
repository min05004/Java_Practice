package section12;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calender01 {
	public static void main(String[] args) {
		Calendar a = Calendar.getInstance();
		Calendar b = new GregorianCalendar();
		System.out.println(a.toString());
		System.out.println(b.toString());
		//생성되는 인스턴스는 같다
		
	}

}
