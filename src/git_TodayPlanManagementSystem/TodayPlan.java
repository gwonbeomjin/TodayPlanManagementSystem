package git_TodayPlanManagementSystem;

import java.util.Scanner;

public class TodayPlan {

	int plannum;
	String planname;
	String starttime;
	String finishtime;
	String contents;

	
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
	
	void printInfo() {
		System.out.println("Num : " + plannum + "/Start Time : " + starttime + "/Finish Time : " + finishtime + "/Plan Name : " + planname + "/Contents : " + contents);
	}
	
	public int getnum() {
		return plannum;
	}
	//getnum method는 다른 클래스에서도 plannum을 이용할 수 있도록 합니다.
	
	public void setnum(int plannum) {
		this.plannum = plannum;
	}
	//setnum method는 다른 클래스에서 변수의 값을 바꿀 수 있습니다.

	public String getname() {
		return planname;
	}

	public void setname(String planname) {
		this.planname = planname;
	}

	public String getstart() {
		return starttime;
	}

	public void setStart(String starttime) {
		this.starttime = starttime;
	}

	public String getFinish() {
		return finishtime;
	}

	public void setFinish(String finishtime) {
		this.finishtime = finishtime;
	}
	
	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
	
	void addin(Scanner input) {
		System.out.print("Plan Number : ");
		int plannum = input.nextInt();
		this.setnum(plannum);
		
		System.out.print("Plan Name : ");
		String planname = input.next();
		this.setname(planname);
		
		System.out.print("Start time : "); 
		String starttime = input.next();
		this.setStart(starttime);
		
		System.out.print("finish time : ");
		String finishtime = input.next();
		this.setFinish(finishtime);
		
		System.out.print("Contents : ");
		String contents = input.next();
		this.setContents(contents);
	}
	//addin method는 사용자가 직접 입력하여 객체의 값을 각각 입력받고 저장합니다.
	//원래 PlanManager의 addPlan method를 TodayPlan Class로 옮겨왔습니다.
	
}
