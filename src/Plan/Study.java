package Plan;

import java.util.Scanner;

public class Study extends TodayPlan {
	
	protected int page;
	//page라는 새로운 field를 생성하였습니다
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	//page에 대한 get,set method를 생성하였습니다.
	
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
		
		System.out.print("What page do you study first?"); 
		int page = input.nextInt();
		this.setPage(page);
		//study클래스에서 추가적으로 몇쪽부터 공부할 것인지 입력받도록 하였습니다.

		
	}
	public void printInfo() {
		System.out.println("Kind : " + PlanKind.Study + "/Num : " + plannum + "/Start Time : " + starttime + "/Finish Time : " + finishtime + "/Plan Name : " + planname + "/Contents : " + contents + "/page : " + page + "p");
	}
	//study 클래스의 printInfo() method는 method overriding 되어 추가적으로 몇 페이지까지 공부할 것인지 나타낼 것입니다.
}
