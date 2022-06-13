package AddListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import git_TodayPlanManagementSystem.PlanManager;
import guiAdder.KindSelection;
import guiAdder.StudyAdder;
import guiMenu.MenuSelection;
import guiMenu.WindowFrame;

public class StudyAddListener implements ActionListener {
	//ActionListener는 버튼을 눌렀을 때 실행되는 이벤트와 관련된 클래스입니다.
	//AddPlan 버튼을 실행했을 때 PlanAdder 패널을 화면에 보여주도록 하는 클래스입니다.
	
	WindowFrame frame;
	PlanManager planManager;

	public StudyAddListener(WindowFrame frame, PlanManager planManager) {
		this.frame = frame;
		this.planManager = planManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		//버튼 b를 눌렀을 때 동작하도록 합니다.
		StudyAdder sAdder = new StudyAdder(frame, planManager);
		//PlanAdder adder = frame.getPlanadder();
		frame.setupPanel(sAdder);
		//프레임에 PlanAdder패널이 보이도록 합니다.
	}

}
