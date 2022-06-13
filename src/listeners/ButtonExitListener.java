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
	//ActionListener�� ��ư�� ������ �� ����Ǵ� �̺�Ʈ�� ���õ� Ŭ�����Դϴ�.
	//AddPlan ��ư�� �������� �� PlanAdder �г��� ȭ�鿡 �����ֵ��� �ϴ� Ŭ�����Դϴ�.
	
	WindowFrame frame;

	public ButtonExitListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		//�����ư�� ������ ���α׷��� ����ǵ��� �մϴ�.
	}

}
