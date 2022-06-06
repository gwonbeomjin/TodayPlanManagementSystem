package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.PlanViewer;
import gui.WindowFrame;

public class ButtonViewListener implements ActionListener {
	//ActionListener클래스를 상속받습니다.
	//ViewPlan 버튼을 실행했을 때 PlanViewer 패널을 화면에 보여주도록 하는 클래스입니다.
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		//버튼 b를 눌렀을 때 동작하도록 합니다.
		PlanViewer viewer = frame.getPlanviewer();
		frame.setupPanel(viewer);
		//프레임에 PlanViewer패널이 보이도록 합니다.
	}

}
