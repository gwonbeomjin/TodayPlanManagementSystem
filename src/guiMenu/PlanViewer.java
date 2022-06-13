package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Plan.PlanInput;
import git_TodayPlanManagementSystem.PlanManager;

public class PlanViewer extends JPanel{
	
	WindowFrame frame;
	PlanManager planManager;
	
	public PlanViewer(WindowFrame frame, PlanManager planManager) {
		this.frame = frame;
		this.planManager = planManager;
		
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
		
		this.add(sp);
	}
}
