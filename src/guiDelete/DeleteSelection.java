package guiDelete;

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
import AddListener.StudyAddListener;

public class DeleteSelection extends JPanel{
	//�����ϴ� â�� ����ϴ� Ŭ�����Դϴ�.
	
	WindowFrame frame;
	PlanManager planManager;

	public DeleteSelection(WindowFrame frame, PlanManager planManager) {
		this.frame = frame;
		this.planManager = planManager;
		this.setLayout(new BorderLayout());
		this.removeAll();
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel(); 
		JLabel label = new JLabel("Select Number");
		
		JTextField fieldNum = new JTextField(10);
		label.setLabelFor(fieldNum);
		
		JButton button1 = new JButton("Delete");
		button1.addActionListener(new PlanDeleteListener(fieldNum, planManager));

		JButton button2 = new JButton("Cancel");
		button2.addActionListener(new PlanCancelListener(frame));
		
		panel1.add(label);
		panel1.add(fieldNum);
		panel2.add(button1);
		panel2.add(button2);
		
		this.add(panel1, BorderLayout.NORTH);
		//panel1�� ������ ���ʿ� ��ġ�մϴ�.
		this.add(panel2, BorderLayout.CENTER);
		//panel2�� ������ �߰��ʿ� ��ġ�մϴ�.

		
		this.setVisible(true);
		//â�� ������ ȭ�鿡 ��Ÿ������ �մϴ�.
	}

}
