package EditListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import guiAdder.KindSelection;
import guiAdder.StudyAdder;
import guiDelete.DeleteSelection;
import guiEdit.EditKindSelection;
import guiMenu.MenuSelection;
import guiMenu.WindowFrame;

public class ButtonEditListener implements ActionListener {
	//ActionListener는 버튼을 눌렀을 때 실행되는 이벤트와 관련된 클래스입니다.
	//AddPlan 버튼을 실행했을 때 PlanAdder 패널을 화면에 보여주도록 하는 클래스입니다.
	
	WindowFrame frame;

	public ButtonEditListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		//버튼 b를 눌렀을 때 동작하도록 합니다.
		EditKindSelection editkindselection = frame.getEditkindselection();
		//PlanAdder adder = frame.getPlanadder();
		frame.setupPanel(editkindselection);
		//프레임에 PlanAdder패널이 보이도록 합니다.
	}

}
