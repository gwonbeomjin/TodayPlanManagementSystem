package guiView;

import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Plan.PlanInput;
import git_TodayPlanManagementSystem.PlanManager;
import guiMenu.WindowFrame;
import listeners.PlanCancelListener;

public class PlanViewer extends JPanel{
	
	WindowFrame frame;
	PlanManager planManager;
	
	public PlanManager getPlanManager() {
		return planManager;
	}

	public void setPlanManager(PlanManager planManager) {
		this.planManager = planManager;
	}

	public PlanViewer(WindowFrame frame, PlanManager planManager) {
		JPanel panel = new JPanel();
		this.frame = frame;
		this.planManager = planManager;
		this.removeAll();
		
		System.out.println("***" + planManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		//DefaultTableModel클래스.
		model.addColumn("Plan Number");
		model.addColumn("Plan Name");
		model.addColumn("Start Time");
		model.addColumn("Finish Time");
		model.addColumn("Contents");
		
		for(int i = 0; i < planManager.size(); i++) {
			Vector row = new Vector();
			PlanInput pi = planManager.get(i);
			row.add(pi.getPlannum());
			row.add(pi.getPlanname());
			row.add(pi.getStarttime());
			row.add(pi.getFinishtime());
			row.add(pi.getContents());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		//table에 model이 들어갑니다.
		JScrollPane sp = new JScrollPane(table);
		//sp에 table이 들어갑니다.
		
		this.add(sp, BorderLayout.CENTER);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new PlanCancelListener(frame));
		
		panel.add(cancelButton);
		
		this.add(panel, BorderLayout.SOUTH);
		this.setVisible(true);
		
	}
}
