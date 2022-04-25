package Plan;

import java.util.Scanner;

public class Exercise extends TodayPlan {
	public void getUserInput(Scanner input) {
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
			System.out.print("Do you have detail? (Y/N)");
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
}
