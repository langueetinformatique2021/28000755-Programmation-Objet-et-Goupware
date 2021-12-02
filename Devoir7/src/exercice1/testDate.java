package exercice1;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

public class testDate {
	public static void main(String[] args) {
		Date date = new Date();
		Calendar calendrier = new GregorianCalendar();
		calendrier.setTime(date);
		System.out.println(date);
		System.out.println(calendrier.get(GregorianCalendar.DATE)+"/"
							+(calendrier.get(GregorianCalendar.MONTH)+1)+"/"
							+calendrier.get(GregorianCalendar.YEAR)+" "
							+calendrier.get(GregorianCalendar.HOUR)+":"
							+calendrier.get(GregorianCalendar.MINUTE)+":"
							+calendrier.get(GregorianCalendar.SECOND));
	}
}
