package proyect;
import javax.swing.JPanel;
import dataBase.GetDataFromDB;
import dataBase.UpdateDataToDB;

public class ButtonBox extends JPanel {
	private Button1 button1;
	private Button2 button2;
	private Button3 button3;
	
	public ButtonBox(AppInterface appInterface,GetDataFromDB getDataDB,UpdateDataToDB updateDataDB) {
		
		button1 = new Button1("Check Students Grades",appInterface,getDataDB); 
		button2 = new Button2("Add Student",appInterface,updateDataDB);
		button3 = new Button3("Erase Student",appInterface,updateDataDB);
		
		this.add(button1); 
		this.add(button2);
		this.add(button3);
		
	}
	

}
