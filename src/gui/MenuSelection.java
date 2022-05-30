package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame{
	public MenuSelection() {
		this.setSize(300, 300); //â ũ�⸦ �����Ͽ����ϴ�.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		//â�� ������ ���α׷��� ����ǵ��� �մϴ�.
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel(); 
		JLabel label = new JLabel("Menu Selection");
		
		JButton button1 = new JButton("Add Plan");
		JButton button2 = new JButton("Delete Plan");
		JButton button3 = new JButton("Edit Plan");
		JButton button4 = new JButton("View Plan");
		JButton button5 = new JButton("Exit Program");
		//������ ����� �ϴ� ��ư���� �߰��մϴ�.
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		//�г�1, 2�� label�� button�� �߰��մϴ�.
		
		this.add(panel1, BorderLayout.NORTH);
		//panel1�� ������ ���ʿ� ��ġ�մϴ�.
		this.add(panel2, BorderLayout.CENTER);
		//panel2�� ������ �߰��ʿ� ��ġ�մϴ�.
		this.setVisible(true);
		//â�� ������ ȭ�鿡 ��Ÿ������ �մϴ�.
	}
}
