package Plan;

import java.util.Scanner;

import Exception.TimeFormatException;

public abstract class University extends TodayPlan {
	//Study클래스와 Assignment클래스를 묶어서 관리할 수 있도록 TodayPlan을 상속받는 부모클래스 University를 생성하였습니다.
	public University(PlanKind kind) {
		super(kind);
	}
	
	public abstract void getUserInput(Scanner input);
	
	public void printInfo() {
		String skind = getKindStr();
		System.out.println("Kind : " + skind + "/Num : " + plannum + "/Start Time : " + starttime + "/Finish Time : " + finishtime + "/Plan Name : " + planname + "/장소 : " + contents);
	}
	
	public void setDueYN(Scanner input) throws TimeFormatException { //기존의 y/n을 입력받던 실행문을 method화 시켰습니다.
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
		//기존의 study클래스에서 Contents를 정하던 부분을 University클래스로 옮겨와 상속받도록 하였습니다.
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
