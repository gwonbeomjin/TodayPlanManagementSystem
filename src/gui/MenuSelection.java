package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listeners.ButtonAddListener;
import listeners.ButtonViewListener;

public class MenuSelection extends JPanel{
	
	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) {
		this.frame = frame;
		
		this.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel(); 
		JLabel label = new JLabel("Menu Selection");
		
		JButton button1 = new JButton("Add Plan");
		JButton button2 = new JButton("Delete Plan");
		JButton button3 = new JButton("Edit Plan");
		JButton button4 = new JButton("View Plan");
		JButton button5 = new JButton("Exit Program");
		//각각의 기능을 하는 버튼들을 추가합니다.
		
		button1.addActionListener(new ButtonAddListener(frame));
		//button1을 클릭시 ButtonAddListener가 동작하도록 추가합니다.
		button4.addActionListener(new ButtonViewListener(frame));
		//button4을 클릭시 ButtonViewListener가 동작하도록 추가합니다.
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		//패널1, 2에 label과 button을 추가합니다.
		
		this.add(panel1, BorderLayout.NORTH);
		//panel1을 프레임 위쪽에 배치합니다.
		this.add(panel2, BorderLayout.CENTER);
		//panel2를 프레임 중간쪽에 배치합니다.
		this.setVisible(true);
		//창이 윈도우 화면에 나타나도록 합니다.
	}
}
