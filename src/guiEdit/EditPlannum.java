package guiEdit;

import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Plan.PlanInput;
import git_TodayPlanManagementSystem.PlanManager;
import guiMenu.WindowFrame;
import listeners.PlanCancelListener;
import DeleteListener.PlanDeleteListener;
import EditListener.PlannumEditListener;

public class EditPlannum extends JPanel{
	
	WindowFrame frame;
	PlanManager planManager;
	JTextField fieldNum;

	public EditPlannum(WindowFrame frame, JTextField fieldNum, PlanManager planManager) {
		this.frame = frame;
		this.fieldNum = fieldNum;
		this.planManager = planManager;
		
		this.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel(); 
		JLabel label = new JLabel("Plan Number to Edit.");
		
		JTextField fieldNum2 = new JTextField(10);
		label.setLabelFor(fieldNum2);
		
		JButton button1 = new JButton("Edit");
		button1.addActionListener(new PlannumEditListener(fieldNum, fieldNum2, planManager));

		JButton button2 = new JButton("Cancel");
		button2.addActionListener(new PlanCancelListener(frame));
		
		panel1.add(label);
		panel1.add(fieldNum);
		panel2.add(button1);
		panel2.add(button2);
		
		this.add(panel1, BorderLayout.NORTH);
		//panel1을 프레임 위쪽에 배치합니다.
		this.add(panel2, BorderLayout.CENTER);
		//panel2를 프레임 중간쪽에 배치합니다.
		
		this.setVisible(true);
		//창이 윈도우 화면에 나타나도록 합니다.
		
	}

}
