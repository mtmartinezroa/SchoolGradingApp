package proyect;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.TextField;
import javax.swing.JPanel;

public class AppInterface extends JPanel {
	private TextField text1; 
	private TextField text2; 
	private TextField text3; 
	private TextField text4; 
	
	public AppInterface() {
		this.setBackground(Color.cyan);
		
		text1 = new TextField(85);
		this.add(text1); 
		
		text2 = new TextField(85);
		this.add(text2);
		
		text3 = new TextField(85);
		this.add(text3);
		
		text4 = new TextField(85);
		this.add(text4);
		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.red);
	
		g.fillRect(100, 270, 700, 100);
		g.setColor(Color.black);
		g.setFont(new Font("default", Font.BOLD, 20));
		g.drawString("Instructions:", 100, 190);
		g.setFont(new Font("default", Font.BOLD, 16));
		g.drawString("To add student : Write the name and grades of the student, then press 'Add Student' ", 100, 210);
		g.drawString("To erase student : Write the name of the student, then press 'Erase Student' ", 100, 230);
		g.drawString("To check all student grades : Press 'Check Students Grades' ", 100, 250);
		g.setFont(new Font("default", Font.BOLD, 16));
		g.drawString("Name", 30, 20);
		g.drawString("Grade1", 30, 47);
		g.drawString("Grade2", 30, 75);
		g.drawString("Grade3", 30, 102);
			
	}
	
	public String getText1() {
		return text1.getText();	
	}
	public String getText2() {
		return text2.getText();
	}
	public String getText3() {
		return text3.getText();
	}
	public String getText4() {
		return text4.getText();
	}
	
}
