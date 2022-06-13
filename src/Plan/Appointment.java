package Plan;

import java.util.Scanner;

public class Appointment extends TodayPlan{
	
	public Appointment(PlanKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setPlanNum(input);
		setPlanName(input);
		setStartTime(input);
		setFinishTime(input);
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Is it an appointment with your family? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Contents : ");
				this.setContents("With Family");
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				setContents(input);
				break;
			}
			else {
			}
		}
	}
	public void printInfo() {
		String skind = getKindStr();
		System.out.println("Kind : " + skind + "/Num : " + plannum + "/Plan Name : " + planname + "/Start Time : " + starttime + "/Finish Time : " + finishtime + "/Contents : " + contents);
	}
	
}
