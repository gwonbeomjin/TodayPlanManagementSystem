package Plan;

import java.util.Scanner;

public class Study extends TodayPlan {
	
	protected int page;
	//page��� ���ο� field�� �����Ͽ����ϴ�
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	//page�� ���� get,set method�� �����Ͽ����ϴ�.
	
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
			//Y�� �Է¹����� Contents�� Dormitory�� �˴ϴ�.
			else if (answer == 'n' || answer == 'N') {
				System.out.print("Study Place : ");
				String contents = input.next();
				this.setContents(contents);
				break;
			}
			//N�� �Է¹����� ���� ��Ҹ� �Է¹޽��ϴ�.
			else {
				
			}
		}
		
		System.out.print("What page do you study first?"); 
		int page = input.nextInt();
		this.setPage(page);
		//studyŬ�������� �߰������� ���ʺ��� ������ ������ �Է¹޵��� �Ͽ����ϴ�.

		
	}
	public void printInfo() {
		System.out.println("Kind : " + PlanKind.Study + "/Num : " + plannum + "/Start Time : " + starttime + "/Finish Time : " + finishtime + "/Plan Name : " + planname + "/Contents : " + contents + "/page : " + page + "p");
	}
	//study Ŭ������ printInfo() method�� method overriding �Ǿ� �߰������� �� ���������� ������ ������ ��Ÿ�� ���Դϴ�.
}
