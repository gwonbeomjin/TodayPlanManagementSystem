package guiAdder;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import git_TodayPlanManagementSystem.PlanManager;
import guiMenu.SpringUtilities;
import guiMenu.WindowFrame;
import AddListener.PlanAdderListener;
import listeners.PlanCancelListener;

public class AppointmentAdder extends JPanel{
	
	WindowFrame frame;
	PlanManager planManager;
	
	public AppointmentAdder(WindowFrame frame, PlanManager planManager) {
		this.frame = frame;
		this.planManager = planManager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelNum = new JLabel("Plan Number : ", JLabel.TRAILING);
		JTextField fieldNum = new JTextField(10);
		labelNum.setLabelFor(fieldNum);
		panel.add(labelNum);
		panel.add(fieldNum);
		
		JLabel labelName = new JLabel("Name : ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelST = new JLabel("Start Time : ", JLabel.TRAILING);
		JTextField fieldST = new JTextField(10);
		labelST.setLabelFor(fieldST);
		panel.add(labelST);
		panel.add(fieldST);
		
		JLabel labelFT = new JLabel("Finish Time : ", JLabel.TRAILING);
		JTextField fieldFT = new JTextField(10);
		labelFT.setLabelFor(fieldFT);
		panel.add(labelFT);
		panel.add(fieldFT);
		
		JLabel labelContents = new JLabel("Contents : ", JLabel.TRAILING);
		JTextField fieldContents = new JTextField(10);
		labelContents.setLabelFor(fieldContents);
		
		JButton saveButton = new JButton("Save");
		saveButton.addActionListener(new PlanAdderListener(fieldNum, fieldName, fieldST, fieldFT, fieldContents, planManager));
		//저장버튼.
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new PlanCancelListener(frame));
		
		panel.add(labelContents);
		panel.add(fieldContents);
		
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 6, 2, 6, 6, 6, 6);

		this.setSize(300, 300);
		this.add(panel);
		this.setVisible(true);
	}
}
