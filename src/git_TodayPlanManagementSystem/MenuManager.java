package git_TodayPlanManagementSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;
import Log.EventLogger;
import guiMenu.WindowFrame;

public class MenuManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	transient Scanner input;
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		PlanManager planManager = getObject("planmanager.ser");
		if (planManager == null) {
			planManager = new PlanManager(input);
		}
		else {
			planManager.input = input;
		}
		
		WindowFrame frame = new WindowFrame(planManager);
		//창을 연동하기 위하여 WindowFrame클래스의 객체 frame을 만들었습니다.
		selectMenu(input, planManager);
		putObject(planManager, "planmanager.ser");
	}
	
	public static void selectMenu(Scanner input, PlanManager planManager) {
		int num = 0;
		while (num != 5) {	
			try { 
				showMenu();
				num = input.nextInt();
				
				switch(num) {
				case 1:
					planManager.addPlan();
					logger.log("Add a plan.");
					break;
				case 2:
					planManager.deletePlan();
					logger.log("Delete a plan.");
					break;
				case 3:
					planManager.editPlan();
					logger.log("Edit a plan.");
					break;
				case 4:
					planManager.viewPlans();
					logger.log("View all of plan.");
					break;
				default:
					continue;
				}
			}
			catch (InputMismatchException e) {
				System.out.println("Please input integer between 1 and 4! ");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			} 
		}
	}
	
	public static void showMenu() {
		System.out.println("-------Today Plan Manager Menu-------");
		System.out.println("1. Add Plan");
		System.out.println("2. Delete Plan");
		System.out.println("3. Edit Plan");
		System.out.println("4. View Plan");
		System.out.println("5. Exit");
		System.out.println("Select one number 1-5");
	}
	
	public static PlanManager getObject(String filename) {
		PlanManager planManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			planManager = (PlanManager)in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return planManager;
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		
		return planManager;
	}
	
	public static void putObject(PlanManager planManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(planManager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}