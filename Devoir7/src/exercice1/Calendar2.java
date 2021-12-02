package exercice1;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Calendar2 extends Calendar{
	protected boolean cours = false;
	protected Date date_;
	protected Calendar calendar_;
	protected Calendar new_calendar_;
	protected int duree_;
	
	public Calendar2(Date date, Calendar calendar) {
		date_ = date;
		calendar_ = calendar;
		new_calendar_ = calendar;
		String dayWeekText = new SimpleDateFormat("EEEE").format(date);
		System.out.println(dayWeekText);
		if(calendar.get(Calendar.HOUR_OF_DAY) <= 12 && calendar.get(Calendar.HOUR_OF_DAY) >= 9 && calendar.get(Calendar.MINUTE) >= 30 
			/*&& "jeudi" == dayWeekText*/) {
			cours = true;
		};
	}
	
	public void creation(){
		System.out.println("Date de création: "+calendar_.get(GregorianCalendar.DATE)+"/"
				+(calendar_.get(GregorianCalendar.MONTH)+1)+"/"
				+calendar_.get(GregorianCalendar.YEAR)+" "
				+calendar_.get(GregorianCalendar.HOUR)+":"
				+calendar_.get(GregorianCalendar.MINUTE)+":"
				+calendar_.get(GregorianCalendar.SECOND));
	}
	
	public void afficher(){
		new_calendar_ = new GregorianCalendar();
		System.out.println("Date actuelle: "+new_calendar_.get(GregorianCalendar.DATE)+"/"
				+(new_calendar_.get(GregorianCalendar.MONTH)+1)+"/"
				+new_calendar_.get(GregorianCalendar.YEAR)+" "
				+new_calendar_.get(GregorianCalendar.HOUR)+":"
				+new_calendar_.get(GregorianCalendar.MINUTE)+":"
				+new_calendar_.get(GregorianCalendar.SECOND));
	}
	
	public void duree(){
		System.out.println("Durée: "+(new_calendar_.get(GregorianCalendar.SECOND)-calendar_.get(GregorianCalendar.SECOND))+" secondes");
	}
	
	////////////////////////////////////////////////
	//Squelettes de fonctions héritées de Calendar//
	////////////////////////////////////////////////
	
	public int getMaximum(int nb){
		return nb;
	}
	
	public int getMinimum(int nb){
		return nb;
	}
	
	public int getLeastMaximum(int nb){
		return nb;
	}
	
	public int getGreatestMinimum(int nb){
		return nb;
	}
	
	public void add(int nb1, int nb2){
	}
	
	public void roll(int nb, boolean bool){
	}
	
	public void computeTime(){
		
	}
	
	public void computeFields(){
		
	}

	public void getGreatestMinimum(){
	
	}
}
