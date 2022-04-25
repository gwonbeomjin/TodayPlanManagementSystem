package git_TodayPlanManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

import Plan.Appointment;
import Plan.Assignment;
import Plan.Exercise;
import Plan.Study;
import Plan.TodayPlan;

public class PlanManager {
	ArrayList<TodayPlan> todayplans = new ArrayList<TodayPlan>();
	//todayplans��ü�� ArrayList���·� �����Ͽ����ϴ�.
	Scanner input;
	
	PlanManager(Scanner input) {
		this.input = input;
	}
	
	public void addPlan() {
		int kind = 0;
		TodayPlan todayplan;
		while (kind != 1 && kind != 2 && kind != 3 && kind != 4) {
			System.out.println("1. Study");
			System.out.println("2. Assignment");
			System.out.println("3. Exercise");
			System.out.println("4. Appointment");
			System.out.println("Select num for Plan Kind : ");
			kind = input.nextInt();
			if (kind == 1) {
				todayplan = new Study();
				todayplan.getUserInput(input);
				todayplans.add(todayplan);
				break;
			}
			//1�� �Է��ϸ� StudyŬ����Ÿ���� Plan�� ������ �� �ֽ��ϴ�.
			else if (kind == 2) {
				todayplan = new Assignment();
				todayplan.getUserInput(input);
				todayplans.add(todayplan);
				break;
			}
			//2�� �Է��ϸ� AssignmentŬ����Ÿ���� Plan�� ������ �� �ֽ��ϴ�.
			else if (kind == 3) {
				todayplan = new Exercise();
				todayplan.getUserInput(input);
				todayplans.add(todayplan);
				break;
			}
			//3�� �Է��ϸ� ExerciseŬ����Ÿ���� Plan�� ������ �� �ֽ��ϴ�.
			else if (kind == 4) {
				todayplan = new Appointment();
				todayplan.getUserInput(input);
				todayplans.add(todayplan);
				break;
			}
			//4�� �Է��ϸ� AppointmentŬ����Ÿ���� Plan�� ������ �� �ֽ��ϴ�.
			else {
				System.out.print("Select num for Plan Kind : ");
			}
		}
		
	}
	//arrayList�� �°� �Է¹��� ������ todayplan�̶�� array��
	//addPlan�� Method�� TodayPlan Class�� addin Method�� ȣ���Ͽ� ���� �Է¹޵��� �߽��ϴ�.
	
	public void deletePlan() {
		System.out.print("Plan Number : ");
		int planNum = input.nextInt();
		int index = -1;
		for(int i = 0; i < todayplans.size(); i++) {
			if (todayplans.get(i).getPlannum() == planNum) {
				index = i;
				break;
			}
		}
		if(index >= 0) {
			todayplans.remove(index);
			System.out.println("the plan " + planNum + "is deleted successfully.");
		}
		else {
			System.out.println("the Plan has not been registered");
			return;
		}
	}

	public void editPlan() {
		System.out.print("Plan Number : ");
		int PlanNum = input.nextInt();
		for (int i = 0; i < todayplans.size(); i++) {
			TodayPlan todayplan = todayplans.get(i);
			if (todayplan.getPlannum() == PlanNum) {
				int num = -1;
				while (num != 5) {	
					System.out.println("1. Edit Plan Number");
					System.out.println("2. Edit Plan Name");
					System.out.println("3. Edit Start Time");
					System.out.println("4. Edit Finish Time");
					System.out.println("5. Edit Contents");
					System.out.println("6. Exit");
					System.out.println("Select one number 1-6");
					num = input.nextInt();
					
					switch(num) {
					case 1:
						System.out.print("Plan Number : ");
						int plannum = input.nextInt();
						todayplan.setPlannum(plannum);
						//
						break;
					case 2:
						System.out.print("Plan Name : ");
						String planname = input.next();
						todayplan.setPlanname(planname);
						//
						break;
					case 3:
						System.out.print("Start Time : ");
						String starttime = input.next();
						todayplan.setStarttime(starttime);
						//
						break;
					case 4:
						System.out.print("Finish Time : ");
						String finishtime = input.next();
						todayplan.setFinishtime(finishtime);
						break;
						//
					case 5:
						System.out.print("Contents : ");
						String contents = input.next();
						todayplan.setContents(contents);
						//
						break;
					case 6:
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
}

