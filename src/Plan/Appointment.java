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
		//입력받는 부분을 부모클래스인 TodayPlan으로 옮겨 간략화 시켰습니다. 
		
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
		System.out.println("Kind : " + skind + "/Num : " + plannum + "/Start Time : " + starttime + "/Finish Time : " + finishtime + "/Plan Name : " + planname + "/Contents : " + contents);
	}
	
}
