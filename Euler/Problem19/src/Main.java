import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		LocalDate date;
		LocalDate startDate = LocalDate.of(1901, 1, 1);
		LocalDate endDate = LocalDate.of(2001, 1, 1);
		int counter = 0;
		
		System.out.println(startDate + " - " + endDate);
		//find first Sunday
		while(startDate.getDayOfWeek() != DayOfWeek.SUNDAY){
			startDate = startDate.plusDays(1);
		}
		date = startDate;
		System.out.println(date);
		while(date.isBefore(endDate)){
			
			if(date.getDayOfMonth() == 1) {
				System.out.println(date + " " + date.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.ENGLISH));
				counter++;
			}
			date = date.plusDays(7);
		}
		System.out.println("Liczba niedziel pierwszego dnia miesiaca: " + counter);
	}

}
