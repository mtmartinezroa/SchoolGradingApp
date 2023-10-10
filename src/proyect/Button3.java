package proyect;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import dataBase.UpdateDataToDB;

public class Button3 extends JButton implements ActionListener {
	AppInterface Interface;
	UpdateDataToDB updateDataDB;
	
	public Button3(String description, AppInterface appInterface, UpdateDataToDB updateDataDB) {
		super(description);
		this.addActionListener(this);
		this.Interface = appInterface;
		this.updateDataDB = updateDataDB; 
	}
	
	public void actionPerformed(ActionEvent ae) {
		String studentName = Interface.getText1();
		
        updateDataDB.eraseStudent(studentName);
	}
}
