package blockContact;
	import java.util.Scanner;
	
public class blockContact {
	//method to edit contact status
		public String contactStatus() {
		//block status by default is null signifying that the contact is currently not blocked
		String blockStatus = null ;
		
		Scanner sc = new Scanner(System.in);
		
		//Prompts user to input their name
		System.out.println("Enter Contact Name: ");
		
		//Scans and stores user's entered contact name as string value.
		String name = sc.nextLine();
		
		//Ask user if they'd like to block the contact name they just entered
		System.out.println("Would you like to block this contact? (yes/no) ");
		
		//Scans and stores user's choice
		String choice = sc.nextLine();
		
		//blocks entered contact if user's choice is yes and the value for name is not null
		if (choice.equals( "yes") && name != null) {
			System.out.println(name + " is now:");
			//sets block status to 'blocked'
			blockStatus = "blocked";
		}
		
		//displays to the user that the contact name entered was no blocked showing that no
		//no action was taken on the contact name's contact; same as exiting out of choice to block user
		if (choice.equals("no") && name != null) {
			System.out.println(name + " was set to:");

			//sets block status to null
			blockStatus = null;
		}
		
		//closes scanner
		sc.close();
		
		System.out.println(blockStatus);
		
		//returns block status
		return blockStatus;
		}
		
		
		}
		
		
	


