package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import guiAdder.KindSelection;
import guiAdder.StudyAdder;
import guiDelete.DeleteSelection;
import guiMenu.MenuSelection;
import guiMenu.WindowFrame;

public class ButtonExitListener implements ActionListener {
	//ActionListener는 버튼을 눌렀을 때 실행되는 이벤트와 관련된 클래스입니다.
	//AddPlan 버튼을 실행했을 때 PlanAdder 패널을 화면에 보여주도록 하는 클래스입니다.
	
	WindowFrame frame;

	public ButtonExitListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		//종료버튼을 누르면 프로그램이 종료되도록 합니다.
	}

}
