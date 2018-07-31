package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String deptName;
	private int mailboxCapacity=500;
	private String alternateEmail;
	private int defaultPasswordLength=10;
	private String defaultCompanyName="therapbd";
	private String email;
	
	//constructor to recieve firstname and lastname
	
	public Email(String firstName,String lastName) {
		this.firstName= firstName;
		this.lastName= lastName;
		
		
		//call a method that ask for a department and return desired department name
		this.deptName = setDepartment();

		
		//call a method that create a random password
		this.password = randomPassword(defaultPasswordLength);
		//System.out.println("Your Password is:"+this.password);
		
		//combine element to generate password
		this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + deptName + defaultCompanyName + ".com";
		System.out.println("Your Email address:"+this.email);
		System.out.println("Your Password is:"+this.password);
		System.out.println("Your mailbox capacity is "+this.mailboxCapacity+"mb");
	}
	
	//set the department
	private String setDepartment () {
		System.out.println("Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department Code:");
		Scanner sc=new Scanner(System.in);
		int depChoice = sc.nextInt();
		if(depChoice==1) { return "sales"; }
		else if(depChoice==2) { return "dev"; }
		else if(depChoice==3) { return "acc"; }
		else { return ""; }
		
	}
	
	//method that creates random password
	private String randomPassword(int length){
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789%$@?&"; //42
		char[] password=new char[length];
		for(int i=0;i<length;i++){
			int rand=(int) (Math.random() * passwordSet.length() );
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//set the mailbox capacity
	public void setMailboxCapacity(int capacity){
		this.mailboxCapacity=capacity;
	}
	
	//method to set alternate Email
	public void setAlternateEmail(char firstLetter,char lastLetter){
		
		this.alternateEmail= (Character.toString(firstLetter)).toLowerCase() + (Character.toString(lastLetter)).toLowerCase() + "@gmail.com" ;
	}
	public int getMailboxCapacity() { return mailboxCapacity; }
	public String getAlternateEmail() {return alternateEmail; }

}
