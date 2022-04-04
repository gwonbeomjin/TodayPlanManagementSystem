package git_TodayPlanManagementSystem;

import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {

		System.out.println("-------Today Plan Manager Menu-------");
		int num = 0;
		Scanner input = new Scanner(System.in);
		PlanManager planManager = new PlanManager(input);
		
		while (num != 5) {	
			System.out.println("1. Add Plan");
			System.out.println("2. Delete Plan");
			System.out.println("3. Edit Plan");
			System.out.println("4. View Plan");
			System.out.println("5. Exit");
			System.out.println("Select one number 1-5");
			num = input.nextInt();
			
			switch(num) {
			case 1:
				planManager.addPlan();
				break;
			case 2:
				planManager.deletePlan();
				break;
			case 3:
				planManager.editPlan();
				break;
			case 4:
				planManager.viewPlan();
				break;
			case 5:
				continue;
			 
			}

		}

	}

	
}
//Menu출력에 관련한 것들만 있도록 수정했습니다.