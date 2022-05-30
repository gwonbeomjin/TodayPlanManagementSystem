package Plan;

import java.io.Serializable;
import java.util.Scanner;

import Exception.TimeFormatException;

public abstract class TodayPlan implements PlanInput, Serializable{

	private static final long serialVersionUID = -5213170210190589959L;
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

	public void setStarttime(String starttime) throws TimeFormatException{
		if (!starttime.contains(":") && !starttime.equals("")) {
			throw new TimeFormatException();
		}
		this.starttime = starttime;
	}

	public String getFinishtime() {
		return finishtime;
	}

	public void setFinishtime(String finishtime) throws TimeFormatException{
		if (!finishtime.contains(":") && !finishtime.equals("")) {
			throw new TimeFormatException();
		}
		this.finishtime = finishtime;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	} 
	
	public abstract void printInfo();
	
	public void setPlanNum(Scanner input) {
		System.out.print("Plan Number : ");
		int plannum = input.nextInt();
		this.setPlannum(plannum);
	}
	
	public void setPlanName(Scanner input) {
		System.out.print("Plan Name : ");
		String planname = input.next();
		this.setPlanname(planname);
	}
	
	public void setStartTime(Scanner input) {
		String starttime = "";
		while (!starttime.contains(":")) {
			try {
				System.out.print("Start Time : ");
				starttime = input.next();
				this.setStarttime(starttime);
			} 
			catch (TimeFormatException e) {
				System.out.println("Incorrect Time Format. Please include ':'");
			} 
		}
	}
	
	public void setFinishTime(Scanner input) {
		String finishtime = "";
		while (!finishtime.contains(":")) {
			try {
				System.out.print("Finish Time : ");
				finishtime = input.next();
				this.setFinishtime(finishtime);
			} 
			catch (TimeFormatException e) {
				System.out.println("Incorrect Time Format. Please include ':'");
			}
		}
	}
	
	public void setContents(Scanner input) {
		System.out.print("Contents : ");
		String contents = input.next();
		this.setContents(contents);
	}
	
	public String getKindStr() {
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
		return skind;
	}

}
