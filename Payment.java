package e_commerce;
import java.util.*;
abstract class payments{
	
	void upi() {}
	void card() {}
	void cod() {}
	
}

public class Payment extends payments {
	
	public Payment() {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println(" This is a abstract class: this is implemented because to hide the payment details "+"\n");
		
		System.out.println(" In order to access these abstract class we have to create inheritence which can be achieved through extend keyword "+"\n");
		
		System.out.println("enter your mode of payement: ----- 'upi'----- 'card' ----- 'cod' ----"+"\n");
		
		String mode=sc.nextLine();
		
		if(mode.equals("upi")) {
			
			System.out.println("enter you upi id:");
			
			sc.nextLine();
			
			System.out.println("thanks for the payment wait you are redirecting to home page"+"\n");
			
			new Store();
		}
		
		else if(mode.equals("card")) {
			
			System.out.println("enter your card details:");
			
			sc.nextLine();
			
			System.out.println("enter your card number:");
			
			sc.nextLine();
			
			System.out.println("enter your card cvv:");
			
			sc.nextLine();
			
			System.out.println("thanks for the payment wait you are redirecting to home page"+"\n");
			
			new Store();
			
		}
		
		else if(mode.equals("cod")) {
			
			System.out.println("thanks for your visit, wait you are redirecting to home page"+"\n");
			
			new Store();
		}
			
		sc.close();
		
	}
}
