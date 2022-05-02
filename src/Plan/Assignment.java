package Plan;

import java.util.Scanner;

public class Assignment extends TodayPlan {
	protected int problem;
	//Assignment 클래스에서 problem이라는 새로운 field를 만들었습니다.
	public int getProblem() {
		return problem;
	}
	public void setProblem(int problem) {
		this.problem = problem;
	}
	//problem에 대한 get, set method를 만들었습니다.

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
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Is the assignment due today? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				this.setFinishtime("11:59");
				break;
			}
			//과제 기한이 오늘까지 인지 물어보고 Yes일 경우 finishtime이 11:59로 설정되도록 합니다.
			else if (answer == 'n' || answer == 'N') {
				this.setFinishtime("");
				break;
			}
			else {
				
			}
		}
		System.out.print("Contents : ");
		String contents = input.next();
		this.setContents(contents);
		
		System.out.print("Number of Problems : ");
		problem = input.nextInt();
		this.setProblem(problem);
	}
	
	public void printInfo() {
		System.out.println("Kind : " + PlanKind.Assignment + "/Num : " + plannum + "/Start Time : " + starttime + "/Finish Time : " + finishtime + "/Plan Name : " + planname + "/Contents : " + contents + "/문제 개수 : " + problem + "개");
	}
	//Assignment class에서는 추가적으로 문제 개수를 표시하기로 하였으므로 printInfo() method를 수정하여 method overriding하도록 하였습니다.
}
