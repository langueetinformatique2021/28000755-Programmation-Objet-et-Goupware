package devoir7;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class testCalendar2 {
	public static void main(String args[]){
		Date date = new Date();
		Calendar calendrier = new GregorianCalendar();
		Calendar2 a = new Calendar2(date,calendrier);
		
		/*
		int n = 0;
		while(n<1000000) {
			n += 1;
			System.out.println(n);
		}*/
		a.creation();
		a.afficher();
		a.duree();
		System.out.println(a.cours);
	}
}
