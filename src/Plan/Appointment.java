package Plan;

import java.util.Scanner;

public class Appointment extends TodayPlan implements PlanInput{
	//planInput Interface의 method를 Appointment클래스에서 구현하도록 선언하였습니다.
	
	public Appointment(PlanKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		//PlanInput의 getUserInput을 Appointment클래스에 맞게 구현하였습니다.
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
			System.out.print("Is it an appointment with your family? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Contents : ");
				this.setContents("With Family");
				break;
			}
			//가족들과 함께 보내는 약속이면 Contents가 자동으로 With Family가 됩니다.
			else if (answer == 'n' || answer == 'N') {
				System.out.print("Contents : ");
				String contents = input.next();
				this.setContents(contents);
				break;
			}
			//그렇지 않은경우 사용자가 내용을 직접 입력하도록 합니다.
			else {
				
			}
		}
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
		System.out.println("Kind : " + skind + "/Num : " + plannum + "/Start Time : " + starttime + "/Finish Time : " + finishtime + "/Plan Name : " + planname + "/Contents : " + contents);
	}
	//abstract method인 printInfo() method를 구현하였습니다.
	
}
