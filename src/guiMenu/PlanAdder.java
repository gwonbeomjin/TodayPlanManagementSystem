package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class PlanAdder extends JPanel{
	
	WindowFrame frame;
	
	public PlanAdder(WindowFrame frame) {
		this.frame = frame;
		
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
		panel.add(labelContents);
		panel.add(fieldContents);
		
		panel.add(new JButton("Save"));
		panel.add(new JButton("Cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 6, 2, 6, 6, 6, 6);

		this.setSize(300, 300);
		this.add(panel);
		this.setVisible(true);
	}
}
