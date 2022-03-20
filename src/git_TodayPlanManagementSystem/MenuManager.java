package git_TodayPlanManagementSystem;

import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		System.out.println("-------Today Plan Manager Menu-------");
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {	
			//while문을 사용하여 num이 6이 아닐 경우 밑의 내용들을 반복하도록 했습니다.
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
				break;
			//switch구문을 사용하여 1을 입력받을 경우 계획의 숫자, 이름, 시작시간, 끝시간, 내용을 입력받도록 합니다.
			case 2:
				System.out.print("Plan Number : ");
				int PlanNum2 = input.nextInt();
				break;
				//2번을 입력하면 Plan Number를 입력받고 그 Number에 해당하는 Plan을 삭제하는 코드로 구상하겠습니다.
			case 3:
				System.out.print("Plan Number : ");
				int PlanNum3 = input.nextInt();
				break;
				//3번을 입력하면 Plan Number를 입력받고 그 Number에 해당하는 Plan을 수정하는 코드로 구상하겠습니다.
			case 4:
				System.out.print("Plan Number : ");
				int PlanNum4 = input.nextInt();
				break;
				//4번을 입력하면 저장되어있는 모든 Plan을 보여주고, Plan Number를 입력받아 그 Plan의 시작시간, 끝시간, 내용을 보여주는 코드로 구상하겠습니다.
			case 5:
				continue;
			//5를 입력하면 continue로 인하여 switch구문 위의 내용으로 돌아가 메뉴를 다시 보여줍니다.
			 
			}

		}

	}
}
