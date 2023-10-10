package proyect;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import dataBase.GetDataFromDB;
import dataBase.UpdateDataToDB;

public class Window extends JFrame {
	private ButtonBox buttonBox;
	private AppInterface appInterface;
	private GetDataFromDB getDataDB;
	private UpdateDataToDB updateDataDB;
	
	public Window() {
		 this.setSize(900,600);
	     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	     this.setLayout(new BorderLayout());
	     this.setResizable(false);
	     this.setTitle("School Grading App");
	            
	     appInterface = new AppInterface();
	     this.add(appInterface, BorderLayout.CENTER);
	     
	     getDataDB = new GetDataFromDB(appInterface);
	     updateDataDB = new UpdateDataToDB(); 
	       
	     buttonBox = new ButtonBox(appInterface,getDataDB,updateDataDB);
	     this.add(buttonBox, BorderLayout.SOUTH);
	        
	     this.setVisible(true);
	}
	
}
