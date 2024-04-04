package EmailApp;

import java.util.Scanner;

public class EmailApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	
		System.out.println("Enter your first Name:");
		String firstname = scanner.next();
		System.out.println("Enter your last Name: ");
		String lastname = scanner.next();
		Email obj = new Email(firstname,lastname);
		obj.info();
		scanner.close();
		}
		
		// TODO Auto-generated method stub

	}


