package emailapp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your firstname:");
		String fName=sc.next();
		System.out.println("Enter your lastname:");
		String lName=sc.next();
		Email em1 = new Email(fName,lName);
		
		char firsLetter = fName.charAt(0);
		char lastLetter = lName.charAt(0);
		em1.setAlternateEmail(firsLetter,lastLetter);
		System.out.println("Your alternative email is:"+em1.getAlternateEmail());
		

	}

}
