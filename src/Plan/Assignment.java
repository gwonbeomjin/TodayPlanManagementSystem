package Plan;

import java.util.Scanner;

import Exception.TimeFormatException;

public class Assignment extends University{
	
	protected int problem;
	
	public int getProblem() {
		return problem;
	}
	public void setProblem(int problem) {
		this.problem = problem;
	}
	
	public void setProblemStr(Scanner input) {
		System.out.print("Number of Problems : ");
		problem = input.nextInt();
		this.setProblem(problem);
	}
	
	public Assignment(PlanKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setPlanNum(input);
		setPlanName(input);
		setStartTime(input);
		try {
			setDueYN(input);
		} catch (TimeFormatException e) {

			e.printStackTrace();
		}
		setContents(input);
		setProblemStr(input);
	}
	
	public void printInfo() {
		String skind = getKindStr();
		System.out.println("Kind : " + skind + "/Num : " + plannum + "/Start Time : " + starttime + "/Finish Time : " + finishtime + "/Plan Name : " + planname + "/Contents : " + contents + "/문제 개수 : " + problem + "개");
	}
}
