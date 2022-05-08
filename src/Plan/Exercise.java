package Plan;

import java.util.Scanner;

public class Exercise extends TodayPlan implements PlanInput{
	//PlanInput interface의 method를 구현하도록 선언합니다.
	
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
		
		today();
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
			System.out.print("Do you have detail Part? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Today's workout part : ");
				String contents = input.next();
				this.setContents(contents);
				break;
			}
			//exercise 클래스에서 contents부분을 세부적인 운동부분 유무를 물어보고
			//있을 경우에 오늘의 운동부위를 입력 받도록 합니다.
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
		System.out.println("Kind : " + skind + "/Num : " + plannum + "Today : " + date + "/Start Time : " + starttime + "/Finish Time : " + finishtime + "/Plan Name : " + planname + "/Contents : " + contents);
	}
	//Exercise 클래스에서 구현된 printInfo() method입니다.
}
