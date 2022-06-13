package EditListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import git_TodayPlanManagementSystem.PlanManager;
import guiAdder.KindSelection;
import guiAdder.StudyAdder;
import guiEdit.EditPlannum;
import guiMenu.MenuSelection;
import guiMenu.WindowFrame;

public class ButtonEditPlannumListener implements ActionListener {
	
	WindowFrame frame;
	PlanManager planManager;
	JTextField fieldNum;


	public ButtonEditPlannumListener(WindowFrame frame, JTextField fieldNum, PlanManager planManager) {
		this.frame = frame;
		this.planManager = planManager;
		this.fieldNum = fieldNum;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		EditPlannum editplannum = new EditPlannum(frame, fieldNum, planManager);
		frame.setupPanel(editplannum);
		//editplannum패널이 보이도록합니다.	
	}

}
