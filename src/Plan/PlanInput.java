package Plan;

import java.util.Scanner;

import Exception.TimeFormatException;

public interface PlanInput {
	public int getPlannum();
	
	public void setPlannum(int plannum);
	
	public void setPlanname(String planname);
	
	public void setStarttime(String starttime) throws TimeFormatException;
	
	public void setFinishtime(String finishtime) throws TimeFormatException;
	
	public void setContents(String contents);
	
	public abstract void printInfo();
	
	public void getUserInput(Scanner input);
	
	
	//PlanManager 클래스에 사용되던 method들이 TodayPlan의 자식클래스에서도 적용되기 떄문에 
	//공통적으로 사용하기 위하여 signature를 추가하였습니다. 
	public void setPlanNum(Scanner input);
	
	public void setPlanName(Scanner input);
	
	public void setStartTime(Scanner input);
	
	public void setFinishTime(Scanner input);
	
	public void setContents(Scanner input);
}
