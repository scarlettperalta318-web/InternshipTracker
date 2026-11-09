import java.util.*;
public class ApplicationTracker {
	
	private ArrayList<Internship> interns;
	
	public ApplicationTracker() {
		interns = new ArrayList();
	}
	
	public void addApplication(Internship internship) {
		interns.add(internship);
	}
	
	public void displayApplication() {
		
		if(interns.isEmpty()) {
			System.out.println("No application found");
		}
		else {
			System.out.println("=== APPLICATIONS ===");
			for(int i = 0;i<interns.size();i++) {
				System.out.println(interns);
			}
		}
		
	}
	public int getApplicationsCount() {
		return interns.size();
	}

}
