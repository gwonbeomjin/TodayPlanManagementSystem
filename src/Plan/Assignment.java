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
		} //setDueYN의 예외처리를 위해 try catch문을 사용하였습니다.
		setContents(input);
		setProblemStr(input);
		//입력받는 부분을 TodayPlan에서 구현하여 상속받거나 method로 하여 간략화 시켰습니다.
	}
	
	public void printInfo() {
		String skind = getKindStr();
		System.out.println("Kind : " + skind + "/Num : " + plannum + "/Start Time : " + starttime + "/Finish Time : " + finishtime + "/Plan Name : " + planname + "/Contents : " + contents + "/문제 개수 : " + problem + "개");
	}
	//Assignment class에서는 추가적으로 문제 개수를 표시하기로 하였으므로 printInfo() method를 수정하여 method overriding하도록 하였습니다.
}
