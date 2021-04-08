import java.util.Scanner;

public class AccountManager {
	
	Scanner sc = new Scanner(System.in);
	
	
	public void run() {
		 displayMenu();
		 int answer = sc.nextInt();
		 switch (answer) {
		 case 1: logIn();
		 break;
	 	 case 2: createAccount();
	 	 break;
	 	 case 3: resetPassword();
	 	 break;		
	 		
		 } 
		run();
	}
	
		 
		 
	
	 
	 public void displayMenu() {
		 
	 System.out.println("Press any number from the menu below to prosses through out the application.");
		 System.out.println("1.Log in.");
		 System.out.println("2.Create anaccount");
		 System.out.println("3.Reset password");
		 
	 }
	 
	 public void logIn() {
		 // connect the method with an account method and creat account as a user object with all atributes
	 }
	 
	 public void createAccount() {
		 
	 }
	 public void resetPassword() {
		 
	 }

	

} 

