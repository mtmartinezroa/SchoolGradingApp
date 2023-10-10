package dataBase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateDataToDB {
	
	public UpdateDataToDB() {	
	}
	
	public void addStudent(String studentName, float grade1, float grade2, float grade3) {
		float gradeaverage = (grade1+grade2+grade3)/3;
        String sql = "INSERT INTO classgrades VALUES"+"('"+studentName+"',"+grade1+","+grade2+","+grade3+","+gradeaverage+")"; 
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_SchoolGradingApp","root","");
            Statement count = con.createStatement();
            count.executeUpdate(sql);
            System.out.println("Student added to database");
        } catch ( Exception e ) {
            System.out.println(e.getMessage());
        }	
	}
	
	public void eraseStudent(String studentName) {
		String sqlb = "delete from classgrades where student='"+studentName+"'";
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_SchoolGradingApp","root","");
			Statement count = con.createStatement();
			count.executeUpdate(sqlb); 
			System.out.println("Student erased from database");
		} catch ( Exception e ) {
			System.out.println(e.getMessage());
		}
	}	
}


