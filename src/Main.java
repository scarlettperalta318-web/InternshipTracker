import java.time.LocalDate;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		ApplicationTracker tracker = new ApplicationTracker();
		int choice = 0; 
	
		while(choice!=4) {
		
		System.out.println("===Application Tracker===");
		System.out.println("1 : Add Internship Application");
		System.out.println("2: Display All The Applications");
		System.out.println("3: View Total Applications");
		System.out.println("4: Exit");
		
		System.out.print("\nEnter Your Choice:");
		choice = in.nextInt();
		in.nextLine();
		
		switch(choice) {
		
		case 1: 
			System.out.print("Enter Company Name");
			String company = in.nextLine();
			System.out.print("Enter position");
			String position = in.nextLine();
			System.out.print("Enter location: ");
			String location = in.nextLine();
			System.out.print("Enter application date(YYYY-MM-DD) : ");
			LocalDate date = LocalDate.parse(in.nextLine());
			System.out.print("Enter status");
			String status = in.nextLine();
			System.out.print("Enter salary: ");
			double salary = in.nextDouble();
			
			Internship it = new Internship(company,position,location, status,date, salary);
			
			tracker.addApplication(it);
			System.out.println("\nApplication added successfully");
			break; 
			
		case 2: 
			tracker.displayApplication();
			break; 
			
		case 3: 
			System.out.println("Total applications: "+tracker.getApplicationsCount());
			
		case 4: 
			System.out.println("Thank you for using tracker!");
			break; 
			
			default: 
				System.out.println("Invalid option,try again");
		}
		
	
		}
	
		
		
	
		

	}

}
