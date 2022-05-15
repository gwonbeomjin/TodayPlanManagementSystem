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
		//입력받는 부분을 부모클래스인 TodayPlan으로 옮겨 간략화 시켰습니다. 
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have detail Part? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				setContents(input);
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
		String skind = getKindStr();
		System.out.println("Kind : " + skind + "/Num : " + plannum + "Today : " + date + "/Start Time : " + starttime + "/Finish Time : " + finishtime + "/Plan Name : " + planname + "/Contents : " + contents);
	}
	//Exercise 클래스에서 구현된 printInfo() method입니다.
	
}
