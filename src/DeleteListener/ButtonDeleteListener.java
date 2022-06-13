package DeleteListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import guiAdder.KindSelection;
import guiAdder.StudyAdder;
import guiDelete.DeleteSelection;
import guiMenu.MenuSelection;
import guiMenu.WindowFrame;

public class ButtonDeleteListener implements ActionListener {
	//ActionListener�� ��ư�� ������ �� ����Ǵ� �̺�Ʈ�� ���õ� Ŭ�����Դϴ�.
	//AddPlan ��ư�� �������� �� PlanAdder �г��� ȭ�鿡 �����ֵ��� �ϴ� Ŭ�����Դϴ�.
	
	WindowFrame frame;

	public ButtonDeleteListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		//��ư b�� ������ �� �����ϵ��� �մϴ�.
		DeleteSelection deleteselection = frame.getDeleteselection();
		//PlanAdder adder = frame.getPlanadder();
		frame.setupPanel(deleteselection);
		//�����ӿ� PlanAdder�г��� ���̵��� �մϴ�.
	}

}
