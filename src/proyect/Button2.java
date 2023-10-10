package proyect;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import dataBase.UpdateDataToDB;

public class Button2 extends JButton implements ActionListener {
	AppInterface Interface;
	UpdateDataToDB updateDataDB;
	
	public Button2(String description, AppInterface appInterface, UpdateDataToDB updateDataDB) {
		super(description);
		this.addActionListener(this);
		this.Interface = appInterface;
		this.updateDataDB = updateDataDB; 
	}
	
	public void actionPerformed(ActionEvent ae) {
        String studentName = Interface.getText1();
        String g1 = Interface.getText2();
        float grade1 = Float.parseFloat(g1);
        String g2 = Interface.getText3();
        float grade2 = Float.parseFloat(g2);
        String g3 = Interface.getText4();
        float grade3 = Float.parseFloat(g3);
        
        updateDataDB.addStudent(studentName, grade1, grade2, grade3);
	}

}
