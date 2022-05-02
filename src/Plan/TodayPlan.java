package Plan;

import java.util.Scanner;

public class TodayPlan {
	protected PlanKind kind = PlanKind.Study;
	protected int plannum;
	protected String planname;
	protected String starttime;
	protected String finishtime;
	protected String contents;
	
	//�Ķ���� 0��.
	public TodayPlan() {
	}
	
	//�Ķ���� 1��.
	public TodayPlan(PlanKind kind) {
		this.kind = kind;
	}
	public TodayPlan(int plannum) {
		this.plannum = plannum;
	}
	public TodayPlan(String planname) {
		this.planname = planname;
	}

	//�Ķ���� 2��.
	public TodayPlan(int plannum, String planname) {
		this.plannum = plannum;
		this.planname = planname;
	}
	
	//�Ķ���� 3��.
	public TodayPlan(PlanKind kind, int plannum, String planname) {
		this.kind = kind;
		this.plannum = plannum;
		this.planname = planname;
	}

	
	//�Ķ���� 4��
	public TodayPlan(PlanKind kind, int plannum, String planname, String starttime) {
		this.kind = kind;
		this.plannum = plannum;
		this.planname = planname;
		this.starttime = starttime;
	}
	
	//�Ķ���� 5��.
	public TodayPlan(int plannum, String planname, String starttime, String finishtime, String contents) {
		this.plannum = plannum;
		this.planname = planname;
		this.starttime = starttime;
		this.finishtime = finishtime;
		this.contents = contents;
	}
	
	//�Ķ���� 6��.
	public TodayPlan(PlanKind kind, int plannum, String planname, String starttime, String finishtime, String contents) {
		this.kind = kind;
		this.plannum = plannum;
		this.planname = planname;
		this.starttime = starttime;
		this.finishtime = finishtime;
		this.contents = contents;
	}
	
	public PlanKind getKind() {
		return kind;
	}

	public void setKind(PlanKind kind) {
		this.kind = kind;
	}

	public int getPlannum() {
		return plannum;
	}

	public void setPlannum(int plannum) {
		this.plannum = plannum;
	}

	public String getPlanname() {
		return planname;
	}

	public void setPlanname(String planname) {
		this.planname = planname;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getFinishtime() {
		return finishtime;
	}

	public void setFinishtime(String finishtime) {
		this.finishtime = finishtime;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
	//�������� ������ field�� ���Ͽ� getter, setter�� �����Ͽ����ϴ�. 
	
	
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
		System.out.println("Kind : " + skind + "Num : " + plannum + "/Start Time : " + starttime + "/Finish Time : " + finishtime + "/Plan Name : " + planname + "/Contents : " + contents);
	}
	
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
		
		System.out.print("Contents : ");
		String contents = input.next();
		this.setContents(contents);
	}
	
	

}
