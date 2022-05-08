package Plan;

import java.util.Scanner;

public class Study extends TodayPlan implements PlanInput{
	//planInput Interface의 method를 Study클래스에서 구현하도록 선언하였습니다.
	
	public Study(PlanKind kind) {
		super(kind);
	}
	
	protected int page;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	public void getUserInput(Scanner input) {
		//Study 클래스에 맞게 getUserInput method를 구현하였습니다.
		System.out.print("Plan Number : ");
		int plannum = input.nextInt();
		this.setPlannum(plannum);
		
		System.out.print("Plan Name : ");
		String planname = input.next();
		this.setPlanname(planname);
	
		System.out.print("Start time : "); 
		String starttime = input.next();
		this.setStarttime(starttime);
		
		System.out.print("finish time : "); 
		String finishtime = input.next();
		this.setFinishtime(finishtime);
		
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you study in the dormitory? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				this.setContents("Dormitory");
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				System.out.print("Study Place : ");
				String contents = input.next();
				this.setContents(contents);
				break;
			}
			else {
				
			}
		}
		
		System.out.print("What page do you study first?"); 
		int page = input.nextInt();
		this.setPage(page);
		
	}
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Study:
			skind = "Study";
			break;
		case Assignment:
			skind = "Assignment";
			break;
		case Exercise:
			skind = "Exercise";
			break;
		case Appointment:
			skind = "Appointment";
			break;
		default:
		}
		System.out.println("Kind : " + skind + "/Num : " + plannum + "/Start Time : " + starttime + "/Finish Time : " + finishtime + "/Plan Name : " + planname + "/Contents : " + contents + "/page : " + page + "p");
	}
	//study 클래스에서 구현된 printInfo() method입니다.
}
