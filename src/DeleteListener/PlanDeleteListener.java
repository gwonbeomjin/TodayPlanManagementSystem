package DeleteListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Exception.TimeFormatException;
import Plan.PlanInput;
import Plan.PlanKind;
import Plan.Study;
import git_TodayPlanManagementSystem.PlanManager;

public class PlanDeleteListener implements ActionListener {
	JTextField fieldNum;
	JTextField fieldContents;
	PlanManager planManager;
	
	public PlanDeleteListener(
			JTextField fieldNum, PlanManager planManager) {
		this.fieldNum = fieldNum;
		this.planManager = planManager;
		//TodayPlan에서 입력받는 값들을 인자로하는 생성자입니다.
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		PlanInput plan = new Study(PlanKind.Study);
		plan.setPlannum(Integer.parseInt(fieldNum.getText()));

		planManager.deletePlan(plan);
		putObject(planManager, "planmanager.ser");
		System.out.println("Plan" + plan.getPlannum() +" Deleted.");
		
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
