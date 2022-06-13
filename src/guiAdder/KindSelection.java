package guiAdder;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import git_TodayPlanManagementSystem.PlanManager;
import guiMenu.WindowFrame;
import listeners.PlanCancelListener;
import AddListener.StudyAddListener;

public class KindSelection extends JPanel{
	//��ȹ�� ������ �����ϴ� �г��� ����ϴ� Ŭ�����Դϴ�.
	WindowFrame frame;
	PlanManager planManager;

	public KindSelection(WindowFrame frame, PlanManager planManager) {
		this.frame = frame;
		this.planManager = planManager;
		this.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel(); 
		JLabel label = new JLabel("Select Number");
		
		JButton button1 = new JButton("1. Study");
		button1.addActionListener(new StudyAddListener(frame, planManager));
		
		JButton button2 = new JButton("2. Assignment");
		
		JButton button3 = new JButton("3. Exercise");
		
		JButton button4 = new JButton("4. Appointment");
		
		JButton button5 = new JButton("Cancel");
		button5.addActionListener(new PlanCancelListener(frame));
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		this.add(panel1, BorderLayout.NORTH);
		//panel1�� ������ ���ʿ� ��ġ�մϴ�.
		this.add(panel2, BorderLayout.CENTER);
		//panel2�� ������ �߰��ʿ� ��ġ�մϴ�.
		this.setVisible(true);
		//â�� ������ ȭ�鿡 ��Ÿ������ �մϴ�.
	}

}
