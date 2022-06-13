package AddListener;

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

public class PlanAdderListener implements ActionListener {
	JTextField fieldNum;
	JTextField fieldName;
	JTextField fieldST;
	JTextField fieldFT;
	JTextField fieldContents;
	PlanManager planManager;
	
	public PlanAdderListener(
			JTextField fieldNum, 
			JTextField fieldName, 
			JTextField fieldST, 
			JTextField fieldFT,
			JTextField fieldContents,
			PlanManager planManager) {
		this.fieldNum = fieldNum;
		this.fieldName = fieldName;
		this.fieldST = fieldST;
		this.fieldFT = fieldFT;
		this.fieldContents = fieldContents;
		this.planManager = planManager;
		//TodayPlan���� �Է¹޴� ������ ���ڷ��ϴ� �������Դϴ�.
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		PlanInput plan = new Study(PlanKind.Study);
		try {
			plan.setPlannum(Integer.parseInt(fieldNum.getText()));
			plan.setPlanname(fieldName.getText());
			plan.setStarttime(fieldST.getText());
			plan.setFinishtime(fieldFT.getText());
			plan.setContents(fieldContents.getText());
			planManager.addPlan(plan);
			putObject(planManager, "planmanager.ser");
			System.out.println("Plan" + plan.getPlannum() +" Registered.");

		} catch (TimeFormatException e2) {
			e2.printStackTrace();
		}
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
