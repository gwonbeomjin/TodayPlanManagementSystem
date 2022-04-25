package Plan;

import java.util.Scanner;

public class TodayPlan {
	protected PlanKind kind = PlanKind.Study;
	protected int plannum;
	protected String planname;
	protected String starttime;
	protected String finishtime;
	protected String contents;
	
	public TodayPlan() {
	}
	
	public TodayPlan(int plannum, String planname) {
		this.plannum = plannum;
		this.planname = planname;
	}
	
	public TodayPlan(int plannum, String planname, String starttime, String finishtime, String contents) {
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
	//생성자의 각각의 field에 대하여 getter, setter를 설정하였습니다. 
	
	public void printInfo() {
		System.out.println("Num : " + plannum + "/Start Time : " + starttime + "/Finish Time : " + finishtime + "/Plan Name : " + planname + "/Contents : " + contents);
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
	//getUserInput method를 생성하여 사용자가 입력한 값을 저장하도록 하였습니다.
	
}
