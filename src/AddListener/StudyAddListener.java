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
	//ActionListener�� ��ư�� ������ �� ����Ǵ� �̺�Ʈ�� ���õ� Ŭ�����Դϴ�.
	//AddPlan ��ư�� �������� �� PlanAdder �г��� ȭ�鿡 �����ֵ��� �ϴ� Ŭ�����Դϴ�.
	
	WindowFrame frame;
	PlanManager planManager;

	public StudyAddListener(WindowFrame frame, PlanManager planManager) {
		this.frame = frame;
		this.planManager = planManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		//��ư b�� ������ �� �����ϵ��� �մϴ�.
		StudyAdder sAdder = new StudyAdder(frame, planManager);
		//PlanAdder adder = frame.getPlanadder();
		frame.setupPanel(sAdder);
		//�����ӿ� PlanAdder�г��� ���̵��� �մϴ�.
	}

}
