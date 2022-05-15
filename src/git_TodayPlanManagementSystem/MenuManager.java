package git_TodayPlanManagementSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {

		System.out.println("-------Today Plan Manager Menu-------");
		Scanner input = new Scanner(System.in);
		PlanManager planManager = new PlanManager(input);
		selectMenu(input, planManager);
	}
	
	public static void selectMenu(Scanner input, PlanManager planManager) {
		int num = 0;
		while (num != 5) {	
			try { //try�� ����.
				showMenu();
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
					planManager.viewPlans();
					break;
				default:
					continue;
				}
			} //try�� ����.
			catch (InputMismatchException e) {
				System.out.println("Please input integer between 1 and 4! ");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			} //try������ num���� �߸� �Է¹޴� ��� catch���� ������ ����˴ϴ�.

		}
	}
	
	public static void showMenu() {
		System.out.println("1. Add Plan");
		System.out.println("2. Delete Plan");
		System.out.println("3. Edit Plan");
		System.out.println("4. View Plan");
		System.out.println("5. Exit");
		System.out.println("Select one number 1-5");
	}
}