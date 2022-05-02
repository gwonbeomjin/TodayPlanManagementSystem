package Plan;

import java.util.Scanner;

public class Assignment extends TodayPlan {
	protected int problem;
	//Assignment Ŭ�������� problem�̶�� ���ο� field�� ��������ϴ�.
	public int getProblem() {
		return problem;
	}
	public void setProblem(int problem) {
		this.problem = problem;
	}
	//problem�� ���� get, set method�� ��������ϴ�.

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
			//���� ������ ���ñ��� ���� ����� Yes�� ��� finishtime�� 11:59�� �����ǵ��� �մϴ�.
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
		System.out.println("Kind : " + PlanKind.Assignment + "/Num : " + plannum + "/Start Time : " + starttime + "/Finish Time : " + finishtime + "/Plan Name : " + planname + "/Contents : " + contents + "/���� ���� : " + problem + "��");
	}
	//Assignment class������ �߰������� ���� ������ ǥ���ϱ�� �Ͽ����Ƿ� printInfo() method�� �����Ͽ� method overriding�ϵ��� �Ͽ����ϴ�.
}
