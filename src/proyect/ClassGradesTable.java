package proyect;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import dataBase.GetDataFromDB;

public class ClassGradesTable extends JFrame {
	
	public ClassGradesTable(GetDataFromDB GetDataDB)throws SQLException {
		
        DefaultTableModel model = new DefaultTableModel(); 
        JTable table = new JTable(model);
        
        model.addColumn("Name"); 
        model.addColumn("Grade1"); 
        model.addColumn("Grade2"); 
        model.addColumn("Grade3");
        model.addColumn("Grade Average");
        
        ResultSet rs = GetDataDB.TableData(); 
        
        while (rs.next()) {
        	Object [] row = new Object[5]; 
        	
        	for (int i=0;i<5;i++) {
        		row[i] = rs.getObject(i+1); 
        	}
        	
        	model.addRow(row);
        }
        
        table.setBounds(30,40,200,300);          
        JScrollPane sp = new JScrollPane(table);    
        
        this.add(sp);          
        this.setSize(700,400); 
        this.setTitle("Class Grades");
        this.setVisible(true); 
	}

}
