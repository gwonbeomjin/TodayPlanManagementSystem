package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import guiAdder.StudyAdder;
import guiMenu.WindowFrame;

public class PlanCancelListener implements ActionListener {
	//누르면 초기화면으로 돌아가도록 작동하는 클래스입니다.
	
	WindowFrame frame;

	public PlanCancelListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint(); 
	}

}
