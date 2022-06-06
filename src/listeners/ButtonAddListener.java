package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.PlanAdder;
import gui.WindowFrame;

public class ButtonAddListener implements ActionListener {
	//ActionListener�� ��ư�� ������ �� ����Ǵ� �̺�Ʈ�� ���õ� Ŭ�����Դϴ�.
	//AddPlan ��ư�� �������� �� PlanAdder �г��� ȭ�鿡 �����ֵ��� �ϴ� Ŭ�����Դϴ�.
	
	WindowFrame frame;

	public ButtonAddListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		//��ư b�� ������ �� �����ϵ��� �մϴ�.
		PlanAdder adder = frame.getPlanadder();
		frame.setupPanel(adder);
		//�����ӿ� PlanAdder�г��� ���̵��� �մϴ�.
	}

}
