package Plan;

import java.util.Scanner;

public class Study extends University{
	protected int page;
	
	public Study(PlanKind kind) {
		super(kind);
	}
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	public void setPage(Scanner input) {
		System.out.print("What page do you study first?"); 
		int page = input.nextInt();
		this.setPage(page);
	}
	
	public void getUserInput(Scanner input) {
		setPlanNum(input);
		setPlanName(input);
		setStartTime(input);
		setFinishTime(input);
		 
		setPlaceYN(input);
		setPage(input);
	}
}
