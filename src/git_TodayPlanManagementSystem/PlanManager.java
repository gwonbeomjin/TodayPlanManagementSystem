package git_TodayPlanManagementSystem;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Plan.Appointment;
import Plan.Assignment;
import Plan.Exercise;
import Plan.PlanInput;
import Plan.PlanKind;
import Plan.Study;

public class PlanManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8218875799086054756L;
	ArrayList<PlanInput> todayplans = new ArrayList<PlanInput>();
	
	transient Scanner input;
	
	PlanManager(Scanner input) {
		this.input = input;
	}
	
	public void addPlan() {
		int kind = 0;
		PlanInput planInput;
		//PlanInput interface
		while (kind != 1 && kind != 2 && kind != 3 && kind != 4) {
			try { //try문 시작.
			System.out.println("1. Study");
			System.out.println("2. Assignment");
			System.out.println("3. Exercise");
			System.out.println("4. Appointment");
			System.out.println("Select num for Plan Kind : ");
			kind = input.nextInt();
			if (kind == 1) {
				planInput = new Study(PlanKind.Study);
				planInput.getUserInput(input);
				todayplans.add(planInput);
				break;
			}
			else if (kind == 2) {
				planInput = new Assignment(PlanKind.Assignment);
				planInput.getUserInput(input);
				todayplans.add(planInput);
				break;
			}
			else if (kind == 3) {
				planInput = new Exercise(PlanKind.Exercise);
				planInput.getUserInput(input);
				todayplans.add(planInput);
				break;
			}
			else if (kind == 4) {
				planInput = new Appointment(PlanKind.Appointment);
				planInput.getUserInput(input);
				todayplans.add(planInput);
				break;
			}
			//4를 입력하면 Appointment클래스타입의 Plan을 설정할 수 있습니다.
			else {
				System.out.print("Select num for Plan Kind : ");
			}
			} //try문 종료.
			catch (InputMismatchException e) {
				System.out.println("You must input integer between 1 and 4! ");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			} //try 안의 문장 실행과정에서 kind값을 잘못 입력받은경우 catch문의 코드가 실행됩니다.
		}
		
	}
	
	public void deletePlan() {
		System.out.print("Plan Number : ");
		int planNum = input.nextInt();
		int index = findIndex(planNum);
		removePlan(index, planNum);
	}
	
	public int removePlan(int index, int planNum) {
		if(index >= 0) {
			todayplans.remove(index);
			System.out.println("the plan " + planNum + "is deleted successfully.");
			return 1;
		}
		else {
			System.out.println("the Plan has not been registered");
			return -1;
		}
	}
	
	public int findIndex(int planNum) {
		int index = -1;
		for(int i = 0; i < todayplans.size(); i++) {
			if (todayplans.get(i).getPlannum() == planNum) {
				index = i;
				break;
			}
		}
		return index;
	} 

	public void editPlan() {
		System.out.print("Plan Number : ");
		int PlanNum = input.nextInt();
		for (int i = 0; i < todayplans.size(); i++) {
			PlanInput plan1 = todayplans.get(i);
			if (plan1.getPlannum() == PlanNum) {
				int num = -1;
				while (num != 5) {	
					showEditMenu();
					num = input.nextInt();
					
					switch(num) { //method화를 통해 간략하게 하였습니다.
					case 1:
						plan1.setPlanNum(input); 
						break;
					case 2:
						plan1.setPlanName(input);
						break;
					case 3:
						plan1.setPlanName(input);
						break;
					case 4:
						plan1.setFinishTime(input);
						break;
					case 5:
						plan1.setContents(input);
						break;
					default:
						continue;
					}//switch
					break;
				}//while
				
			}//if
		}//for
		 
		System.out.println("the Plan to be edited is " + PlanNum);
	}

	public void viewPlans() {
		for (int i = 0; i < todayplans.size(); i++) {
			 todayplans.get(i).printInfo();
		}
	}
	

	
	public void showEditMenu() {
		System.out.println("1. Edit Plan Number");
		System.out.println("2. Edit Plan Name");
		System.out.println("3. Edit Start Time");
		System.out.println("4. Edit Finish Time");
		System.out.println("5. Edit Contents");
		System.out.println("6. Exit");
		System.out.println("Select one number 1-6");
	}
	

	
}

