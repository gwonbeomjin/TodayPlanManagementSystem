package Plan;

import java.util.Scanner;

public class Study extends TodayPlan {
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
			System.out.print("Do you study in the dormitory? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				this.setContents("Dormitory");
				break;
			}
			//Y를 입력받으면 Contents가 Dormitory가 됩니다.
			else if (answer == 'n' || answer == 'N') {
				System.out.print("Study Place : ");
				String contents = input.next();
				this.setContents(contents);
				break;
			}
			//N을 입력받으면 직접 장소를 입력받습니다.
			else {
				
			}
		}
	}
}
