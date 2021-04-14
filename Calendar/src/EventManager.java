import java.util.Scanner;
import java.time.LocalDate;
import java.util.Calendar;

public class EventManager {
	Events event ;
	Scanner sc;
	
	public void setDuration(Duration duration) {
		// take any amount of time of Duration subclass
	}
	
	public void createSingleEvent() { // or might need to return EVENT
		System.out.println("Enter the name of the event you are initiating.");
		String eventName = sc.nextLine();
		
		System.out.println("Enter the date and time you for you event.");
		LocalDate eventDate = new LocalDate(2, 0, 0)
		
	}
	
	

}
