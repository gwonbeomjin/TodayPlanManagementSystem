package Plan;

import java.util.Scanner;

import Exception.TimeFormatException;

public abstract class University extends TodayPlan {
	//StudyŬ������ AssignmentŬ������ ��� ������ �� �ֵ��� TodayPlan�� ��ӹ޴� �θ�Ŭ���� University�� �����Ͽ����ϴ�.
	public University(PlanKind kind) {
		super(kind);
	}
	
	public abstract void getUserInput(Scanner input);
	
	public void printInfo() {
		String skind = getKindStr();
		System.out.println("Kind : " + skind + "/Num : " + plannum + "/Start Time : " + starttime + "/Finish Time : " + finishtime + "/Plan Name : " + planname + "/��� : " + contents);
	}
	
	public void setDueYN(Scanner input) throws TimeFormatException { //������ y/n�� �Է¹޴� ���๮�� methodȭ ���׽��ϴ�.
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Is the assignment due today? (Y/N)");
			answer = input.next().charAt(0);
			try {
				if(answer == 'y' || answer == 'Y') {
					this.setFinishtime("11:59");
					break;
				}
				else if (answer == 'n' || answer == 'N') {
					setFinishTime(input);
					break;
				}
				else {
					
				}
			}
			catch (TimeFormatException e){
				System.out.println("Incorrect Time Format. Please include ':'");
			}
		}
	}
	public void setPlaceYN(Scanner input) { 
		//������ studyŬ�������� Contents�� ���ϴ� �κ��� UniversityŬ������ �Űܿ� ��ӹ޵��� �Ͽ����ϴ�.
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you study in the dormitory? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				this.setContents("Dormitory");
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				setContents(input);
				break;
			}
			else {
			}
		}
	}
	
}
