package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.PlanAdder;
import gui.WindowFrame;

public class ButtonAddListener implements ActionListener {
	//ActionListener는 버튼을 눌렀을 때 실행되는 이벤트와 관련된 클래스입니다.
	//AddPlan 버튼을 실행했을 때 PlanAdder 패널을 화면에 보여주도록 하는 클래스입니다.
	
	WindowFrame frame;

	public ButtonAddListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		//버튼 b를 눌렀을 때 동작하도록 합니다.
		PlanAdder adder = frame.getPlanadder();
		frame.setupPanel(adder);
		//프레임에 PlanAdder패널이 보이도록 합니다.
	}

}
