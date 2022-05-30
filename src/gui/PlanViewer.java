package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PlanViewer extends JFrame{
	public PlanViewer() {
		DefaultTableModel model = new DefaultTableModel();
		//DefaultTableModel클래스.
		model.addColumn("Plan Number");
		model.addColumn("Plan Name");
		model.addColumn("Start Time");
		model.addColumn("Finish Time");
		model.addColumn("Contents");
		
		JTable table = new JTable(model);
		//table에 model이 들어갑니다.
		JScrollPane sp = new JScrollPane(table);
		//sp에 table이 들어갑니다.
		
		this.add(sp);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
