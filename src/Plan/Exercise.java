package Plan;

import java.util.Scanner;

public class Exercise extends TodayPlan{
	
	protected String date;
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public Exercise(PlanKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		System.out.print("Today is : ");
		today(input);
		
		setPlanNum(input);
		setPlanName(input);
		setStartTime(input);
		setFinishTime(input); 
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have detail Part? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				setContents(input);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setContents("");
				break;
			}
			else {
			}
		}
	}
	
	public void today(Scanner input) {
		String date = input.next();
		this.setDate(date);
	}
	
	public void today() {
		System.out.println("01/01");
	}
	
	public void printInfo() {
		String skind = getKindStr();
		System.out.println("Kind : " + skind + "/Num : " + plannum + "/Plan Name : " + planname + "/Today : " + date + "/Start Time : " + starttime + "/Finish Time : " + finishtime + "/Contents : " + contents);
	}
	
}
