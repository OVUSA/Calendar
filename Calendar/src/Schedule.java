import java.util.ArrayList;
import java.util.List;

ublic class Schedule  {
	ScheduleManager scheduleManager;
	private Availability time;
	private HashMap<Time, Events> events = new HashMap<>();
	
	public Schedule() {
		
	}
	
	
	
	
	public HashMap<Time, Events> getEvents() {
		return events;
	}



	public void setEvents(HashMap<Time, Events> events) {
		this.events = events;
	}


	public Availability getTime() {
		return time;
	}



	public void setTime(Availability time) {
		this.time = time;
	}
