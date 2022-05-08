package Plan;

import java.util.Scanner;

public interface PlanInput {
	//PlanInput interface를 새로 생성하고, 구현해야 할 method를 선언하였습니다.
	public int getPlannum();
	
	public void setPlannum(int plannum);
	
	public void setPlanname(String planname);
	
	public void setStarttime(String starttime);
	
	public void setFinishtime(String finishtime);
	
	public void setContents(String contents);
	
	public abstract void printInfo();
	
	public void getUserInput(Scanner input);
}
