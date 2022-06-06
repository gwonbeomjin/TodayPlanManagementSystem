package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.PlanViewer;
import gui.WindowFrame;

public class ButtonViewListener implements ActionListener {
	//ActionListenerŬ������ ��ӹ޽��ϴ�.
	//ViewPlan ��ư�� �������� �� PlanViewer �г��� ȭ�鿡 �����ֵ��� �ϴ� Ŭ�����Դϴ�.
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		//��ư b�� ������ �� �����ϵ��� �մϴ�.
		PlanViewer viewer = frame.getPlanviewer();
		frame.setupPanel(viewer);
		//�����ӿ� PlanViewer�г��� ���̵��� �մϴ�.
	}

}
