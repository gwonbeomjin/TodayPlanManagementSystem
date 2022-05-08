package Plan;

import java.util.Scanner;

public interface PlanInput {
	//PlanInput interface�� ���� �����ϰ�, �����ؾ� �� method�� �����Ͽ����ϴ�.
	public int getPlannum();
	
	public void setPlannum(int plannum);
	
	public void setPlanname(String planname);
	
	public void setStarttime(String starttime);
	
	public void setFinishtime(String finishtime);
	
	public void setContents(String contents);
	
	public abstract void printInfo();
	
	public void getUserInput(Scanner input);
}
