package guiMenu;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import git_TodayPlanManagementSystem.PlanManager;
import guiAdder.KindSelection;
import guiAdder.StudyAdder;
import guiDelete.DeleteSelection;
import guiEdit.EditKindSelection;

import guiView.PlanViewer;

public class WindowFrame extends JFrame{
	
	PlanManager planManager;
	MenuSelection menuselection;
	KindSelection kindselection;
	StudyAdder studyadder;
	PlanViewer planviewer;
	DeleteSelection deleteselection;
	JTextField fieldNum;

	EditKindSelection editkindselection;

	public WindowFrame(PlanManager planManager) {
		
		this.planManager = planManager;
		this.menuselection = new MenuSelection(this);
		this.kindselection = new KindSelection(this, this.planManager);
		this.studyadder = new StudyAdder(this, this.planManager);
		this.planviewer = new PlanViewer(this, this.planManager);
		this.deleteselection = new DeleteSelection(this, this.planManager);
		this.editkindselection = new EditKindSelection(this, this.planManager);
		this.setSize(500, 550);
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

	public StudyAdder getStudyadder() {
		return studyadder;
	}

	public void setPlanadder(StudyAdder studyadder) {
		this.studyadder = studyadder;
	}

	public PlanViewer getPlanviewer() {
		return planviewer;
	}

	public void setPlanviewer(PlanViewer planviewer) {
		this.planviewer = planviewer;
	}
	
	public KindSelection getKindselection() {
		return kindselection;
	}

	public void setKindselection(KindSelection kindselection) {
		this.kindselection = kindselection;
	}
	
	public DeleteSelection getDeleteselection() {
		return deleteselection;
	}

	public void setDeleteselection(DeleteSelection deleteselection) {
		this.deleteselection = deleteselection;
	}

	
	public EditKindSelection getEditkindselection() {
		return editkindselection;
	}

	public void setEditkindselection(EditKindSelection editkindselection) {
		this.editkindselection = editkindselection;
	}

	public void setStudyadder(StudyAdder studyadder) {
		this.studyadder = studyadder;
	}
	
	public PlanManager getPlanManager() {
		return planManager;
	}

	public void setPlanManager(PlanManager planManager) {
		this.planManager = planManager;
	}

	

}
