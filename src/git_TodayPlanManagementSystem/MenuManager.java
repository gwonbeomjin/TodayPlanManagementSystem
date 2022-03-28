package git_TodayPlanManagementSystem;

import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		System.out.println("-------Today Plan Manager Menu-------");
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {	
			System.out.println("1. Add Plan");
			System.out.println("2. Delete Plan");
			System.out.println("3. Edit Plan");
			System.out.println("4. View Plan");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.println("Select one number 1-6");
			num = input.nextInt();
			
			switch(num) {
			case 1:
				addPlan();
				break;
			case 2:
				deletePlan();
				break;
			case 3:
				editPlan();
				break;
			case 4:
				viewPlan();
				break;
			case 5:
				continue;
			 
			}

		}

	}
	public static void addPlan() {
		Scanner input = new Scanner(System.in);
		System.out.print("Plan Number : ");
		int PlanNum = input.nextInt();
		System.out.print("Plan Name : ");
		String Name = input.next();
		System.out.print("Start time : ");
		String time1 = input.next();
		System.out.print("finish time : ");
		String time2 = input.next();
		System.out.print("Contents : ");
		String Contents = input.next();
	}
	
	public static void deletePlan() {
		Scanner input = new Scanner(System.in);
		System.out.print("Plan Number : ");
		int PlanNum = input.nextInt();
	}

	public static void editPlan() {
		Scanner input = new Scanner(System.in);
		System.out.print("Plan Number : ");
		int PlanNum = input.nextInt();
	}

	public static void viewPlan() {
		Scanner input = new Scanner(System.in);
		System.out.print("Plan Number : ");
		int PlanNum = input.nextInt();
	}
	
}
