import java.util.Calendar;

public class Event {
    private String name;
    private Calendar date;
    private EventManager locationType;



    public String locationIs (){
        return locationType.display();
    }
    public void setLocation(EventManager location) {
        locationType = location;
    }
    public void setLZoom(EventManager zoom) {
        locationType = zoom;
    }
}
