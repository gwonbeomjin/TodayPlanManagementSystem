package git_TodayPlanManagementSystem;

import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		System.out.println("-------Today Plan Manager Menu-------");
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {	
			//while���� ����Ͽ� num�� 6�� �ƴ� ��� ���� ������� �ݺ��ϵ��� �߽��ϴ�.
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
			//switch������ ����Ͽ� 1�� �Է¹��� ��� ��ȹ�� ����, �̸�, ���۽ð�, ���ð�, ������ �Է¹޵��� �մϴ�.
			case 2:
				System.out.print("Plan Number : ");
				int PlanNum2 = input.nextInt();
				break;
				//2���� �Է��ϸ� Plan Number�� �Է¹ް� �� Number�� �ش��ϴ� Plan�� �����ϴ� �ڵ�� �����ϰڽ��ϴ�.
			case 3:
				System.out.print("Plan Number : ");
				int PlanNum3 = input.nextInt();
				break;
				//3���� �Է��ϸ� Plan Number�� �Է¹ް� �� Number�� �ش��ϴ� Plan�� �����ϴ� �ڵ�� �����ϰڽ��ϴ�.
			case 4:
				System.out.print("Plan Number : ");
				int PlanNum4 = input.nextInt();
				break;
				//4���� �Է��ϸ� ����Ǿ��ִ� ��� Plan�� �����ְ�, Plan Number�� �Է¹޾� �� Plan�� ���۽ð�, ���ð�, ������ �����ִ� �ڵ�� �����ϰڽ��ϴ�.
			case 5:
				continue;
			//5�� �Է��ϸ� continue�� ���Ͽ� switch���� ���� �������� ���ư� �޴��� �ٽ� �����ݴϴ�.
			 
			}

		}

	}
}
