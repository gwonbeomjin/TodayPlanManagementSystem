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
	//ActionListener�� ��ư�� ������ �� ����Ǵ� �̺�Ʈ�� ���õ� Ŭ�����Դϴ�.
	//AddPlan ��ư�� �������� �� PlanAdder �г��� ȭ�鿡 �����ֵ��� �ϴ� Ŭ�����Դϴ�.
	
	WindowFrame frame;

	public ButtonEditListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		//��ư b�� ������ �� �����ϵ��� �մϴ�.
		EditKindSelection editkindselection = frame.getEditkindselection();
		//PlanAdder adder = frame.getPlanadder();
		frame.setupPanel(editkindselection);
		//�����ӿ� PlanAdder�г��� ���̵��� �մϴ�.
	}

}
