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
	//addPlan�� Method�� TodayPlan Class�� addin Method�� ȣ���Ͽ� ���� �Է¹޵��� �߽��ϴ�.
	
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
		//deletePlan Method�� ��ü�� PlanNum���� �Է¹޾� �����ϴ� �Լ��Դϴ�.
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
		//TodayPlanŬ������ printInfo Method�� ȣ���Ͽ� ���ݱ��� �Է¹��� ��ü���� �����մϴ�.
	}
	

}

