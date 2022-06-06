package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import git_TodayPlanManagementSystem.PlanManager;

public class WindowFrame extends JFrame{
	
	PlanManager planManager;
	MenuSelection menuselection;
	PlanAdder planadder;
	PlanViewer planviewer;


	public WindowFrame(PlanManager planManager) {
		//WindowFrame이 PlanManager와 연동될 수 있도록 매개변수로 planManager를 받도록 합니다.
		
		this.planManager = planManager;
		this.menuselection = new MenuSelection(this);
		this.planadder = new PlanAdder(this);
		this.planviewer = new PlanViewer(this, this.planManager);

		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setupPanel(menuselection);
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public PlanAdder getPlanadder() {
		return planadder;
	}

	public void setPlanadder(PlanAdder planadder) {
		this.planadder = planadder;
	}

	public PlanViewer getPlanviewer() {
		return planviewer;
	}

	public void setPlanviewer(PlanViewer planviewer) {
		this.planviewer = planviewer;
	}

}
