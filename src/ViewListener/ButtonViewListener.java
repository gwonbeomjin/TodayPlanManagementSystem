package ViewListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import git_TodayPlanManagementSystem.PlanManager;
import guiMenu.WindowFrame;
import guiView.PlanViewer;

public class ButtonViewListener implements ActionListener {
	//ActionListener클래스를 상속받습니다.
	//ViewPlan 버튼을 실행했을 때 PlanViewer 패널을 화면에 보여주도록 하는 클래스입니다.
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		PlanViewer planViewer = frame.getPlanviewer();
		PlanManager planManager = getObject("planmanager.ser");
		planViewer.setPlanManager(planManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(planViewer);
		frame.revalidate();
		frame.repaint();
		
	}

	public static PlanManager getObject(String filename) {
		//ViewPlan을 하기 위해서 getObject메소드를 가져왔습니다.
		PlanManager planManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			planManager = (PlanManager)in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return planManager;
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		
		return planManager;
	}
	
}
