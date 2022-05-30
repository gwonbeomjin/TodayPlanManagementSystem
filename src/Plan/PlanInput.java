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
	
	public void setPlanNum(Scanner input);
	
	public void setPlanName(Scanner input);
	
	public void setStartTime(Scanner input);
	
	public void setFinishTime(Scanner input);
	
	public void setContents(Scanner input);
}
