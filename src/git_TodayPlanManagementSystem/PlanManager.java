package git_TodayPlanManagementSystem;

import java.util.Scanner;

public class PlanManager {
	TodayPlan todayplan;
	
	Scanner input;
	
	PlanManager(Scanner input) {
		this.input = input;
	}
	
	public void addPlan() {
		todayplan = new TodayPlan();
		todayplan.addin(input);
		
	}
	//addPlan의 Method는 TodayPlan Class의 addin Method를 호출하여 값을 입력받도록 했습니다.
	
	public void deletePlan() {
		System.out.print("Plan Number : ");
		int PlanNum = input.nextInt();
		if (todayplan == null) {
			System.out.println("the Plan has not been registered");
			return;
		}

		if (todayplan.plannum == PlanNum) {
			todayplan = null;
			System.out.println("the plan is deleted successfully.");
		}
		//deletePlan Method는 객체의 PlanNum값을 입력받아 삭제하는 함수입니다.
	}

	public void editPlan() {
		System.out.print("Plan Number : ");
		int PlanNum = input.nextInt();
		if (todayplan.plannum == PlanNum) {
			System.out.println("the Plan to be edited is " + PlanNum);
			
		}
	}

	public void viewPlan() {
		System.out.print("Plan Number : ");
		int PlanNum = input.nextInt();
		if (todayplan.plannum == PlanNum) {
			todayplan.printInfo();
		}
		//TodayPlan클래스의 printInfo Method를 호출하여 지금까지 입력받은 객체들을 나열합니다.
	}
	

}

