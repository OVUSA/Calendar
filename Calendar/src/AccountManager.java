import java.util.Scanner;

public class AccountManager {
	
	private Scanner sc = new Scanner (System.in);
	private LinkedList<Account> accountsList= new LinkedList<>();
	EmailCheck emailCheck ;
	Account account ;

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
	}
	
	 public void displayMenu() {
		 
	 System.out.println("Press any number from the menu below to prosses through out the application.");
		 System.out.println("1.Log in.");
		 System.out.println("2.Create an account");
		 System.out.println("3.Reset password"); 
	 }
	 
	 
	 public void logIn() {
		 
		Scanner sr = new Scanner (System.in);
		System.out.println(" Enter email.");
		String email =  sr.next();
		
		//emailCheck.checkEmail(email);
		 
		System.out.println("Enter you password.");
		String password = sr.next();
		
		account = findByEmail(email);
		 
		if (account.getPassword().equals(password)) {
			 // displays user account
			account.toString();
		}		
	 }
	 
	 public void createAccount() {
		 System.out.print(" Enter your full name.\n");
		 String fullName = sc.next();
		 		 
		 System.out.print(" Enter your email.");
		 sc.nextLine();
			
		 String email= sc.next();
		 
		 System.out.println();
		//emailCheck.checkEmail(email);
		 System.out.print(" Enter your password.");
		 String password = sc.next();
		 
		 
		 Account ac = new Account (fullName,email,password);
		 accountsList.add(ac); 
		 System.out.println( ac.toString());
		 System.out.println();


		 run();
	 }
	 
	 public void resetPassword() {
		 System.out.println("Enter you email.");
		 String email = sc.next();
		 
		 System.out.println("Enter your new password");
		 String newPassoword = sc.next();
	 
	 }		 
	 
	 
	Account findByEmail(String email) {
		  return accountsList.stream().filter(account -> email.equals(account.getEmail())).findFirst().orElse(null);
	} 
	
}

