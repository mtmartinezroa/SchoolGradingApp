package proyect;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import dataBase.GetDataFromDB;

public class Button1 extends JButton implements ActionListener {
	AppInterface Interface;
	GetDataFromDB getDataDB; 
	
	public Button1(String description, AppInterface appInterface, GetDataFromDB getDataDB) {
		super(description);
		this.addActionListener(this);
		this.Interface = appInterface;
		this.getDataDB = getDataDB; 
	}
	
	public void actionPerformed(ActionEvent ae) {
        String StudentName = Interface.getText1();
        getDataDB.getStudentDataDB(StudentName);
        
        try {
            ClassGradesTable gradesTable = new ClassGradesTable(getDataDB);
        } catch (SQLException ex) {
            Logger.getLogger(Button1.class.getName()).log(Level.SEVERE, null, ex);
        }
	}
}
