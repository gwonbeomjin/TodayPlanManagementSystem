package guiEdit;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import git_TodayPlanManagementSystem.PlanManager;
import guiMenu.WindowFrame;
import EditListener.ButtonEditPlannumListener;
import listeners.PlanCancelListener;
import AddListener.StudyAddListener;

public class EditKindSelection extends JPanel{
	
	WindowFrame frame;
	PlanManager planManager;

	public EditKindSelection(WindowFrame frame, PlanManager planManager) {
		this.frame = frame;
		this.planManager = planManager;
		this.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel(); 
		JPanel panel3 = new JPanel(); 
		JLabel label = new JLabel("Select");
		
		JTextField fieldNum = new JTextField(10);
		label.setLabelFor(fieldNum);
		
		JButton button1 = new JButton("Edit Plan Number");
		button1.addActionListener(new ButtonEditPlannumListener(frame, fieldNum, planManager));
		
		JButton button6 = new JButton("Cancel");
		button6.addActionListener(new PlanCancelListener(frame));
		
		panel1.add(label);
		panel1.add(fieldNum);
		panel2.add(button1);
		panel3.add(button6);
		
		this.add(panel1, BorderLayout.NORTH);
		//panel1을 프레임 위쪽에 배치합니다.
		this.add(panel2, BorderLayout.CENTER);
		//panel2를 프레임 중간쪽에 배치합니다.
		this.add(panel3, BorderLayout.SOUTH);
		this.setVisible(true);
		//창이 윈도우 화면에 나타나도록 합니다.
	}

}
