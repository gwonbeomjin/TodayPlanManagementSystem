package Plan;

import java.util.Scanner;

public abstract class TodayPlan {
	//부모클래스인 TodayPlan을 abstract class로 선언하였습니다.
	protected PlanKind kind = PlanKind.Study;
	protected int plannum;
	protected String planname;
	protected String starttime;
	protected String finishtime;
	protected String contents;
	
	public TodayPlan() {
	}
	
	public TodayPlan(PlanKind kind) {
		this.kind = kind;
	}
	public TodayPlan(int plannum) {
		this.plannum = plannum;
	}
	public TodayPlan(String planname) {
		this.planname = planname;
	}

	public TodayPlan(int plannum, String planname) {
		this.plannum = plannum;
		this.planname = planname;
	}
	
	public TodayPlan(PlanKind kind, int plannum, String planname) {
		this.kind = kind;
		this.plannum = plannum;
		this.planname = planname;
	}

	public TodayPlan(PlanKind kind, int plannum, String planname, String starttime) {
		this.kind = kind;
		this.plannum = plannum;
		this.planname = planname;
		this.starttime = starttime;
	}
	
	public TodayPlan(int plannum, String planname, String starttime, String finishtime, String contents) {
		this.plannum = plannum;
		this.planname = planname;
		this.starttime = starttime;
		this.finishtime = finishtime;
		this.contents = contents;
	}
	
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
	
	public abstract void printInfo();
	//printInfo를 abstract method로 설정하여, 자식클래스에서 구현하도록 하였습니다.

}
