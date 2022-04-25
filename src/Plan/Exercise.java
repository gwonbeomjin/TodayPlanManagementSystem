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
			//exercise Ŭ�������� contents�κ��� �������� ��κ� ������ �����
			//���� ��쿡 ������ ������� �Է� �޵��� �մϴ�.
			else if (answer == 'n' || answer == 'N') {
				this.setContents("");
				break;
			}
			else {
				
			}
		
		}
	}
}
