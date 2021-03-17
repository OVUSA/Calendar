import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountManager {

    List<Account> users = new ArrayList();
    public void run() {

        System.out.println("Menu:");
        System.out.println("Here we create an account");
        Scanner sc = new Scanner (System.in);

        System.out.println("In order to create an account you need to enter following info :n/" +
                "1.Your full name,");
         String name = sc.next();

         System.out.println( "2. Email address,");
         String email = checkEmail(sc.next());

         System.out.println( "3. Set a password");
         String password = sc.next();
         createAccount(name,email,password);

    }

    public void createAccount(String name , String email, String password){
        Account newUser = new Account(name,email, password);
        users.add(newUser);
    }

    public String checkEmail (String email){
        if ( email.contains("@")){
            return email;

        }else {
            return "Wrong email, try again!";
        }
    }

}
