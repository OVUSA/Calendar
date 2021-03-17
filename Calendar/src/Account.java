import java.util.Calendar;

public class Account {
    private String name;
    private String password;
    private String email;
    Schedule personalSchedule;
    Calendar personalCalendar;




     Account (String name,String email,String password){
         this.name = name;
         this.password = password;
         this.email = email;

    }


    public String checkEmail (String email){
         if ( email.contains("@")){
             return email;

         }else {
             return null;
         }
    }
}
