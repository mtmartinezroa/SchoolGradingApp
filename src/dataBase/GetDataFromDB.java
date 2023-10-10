package dataBase;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import proyect.AppInterface;

public class GetDataFromDB {
	AppInterface Interface;
	
	public GetDataFromDB(AppInterface appInterface) {
		this.Interface = appInterface; 
	}
	
	public void getStudentDataDB(String studentName) {
        String sql = "SELECT * FROM classgrades where student ='"+studentName+"'";
        String sqlx = "SELECT grade1 FROM classgrades where student ='"+studentName+"'";
        String sqlz = "SELECT grade2 FROM classgrades where student ='"+studentName+"'";
        String sqly = "SELECT grade3 FROM classgrades where student ='"+studentName+"'";
        String sqlp = "SELECT (grade1+grade2+grade3)/3 from classgrades where student = '"+studentName+"'";
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_SchoolGradingApp","root","");
            Statement count = con.createStatement();
            ResultSet ct = count.executeQuery(sql);
            while(ct.next()){ 
                String name = ct.getString(1); 
                System.out.println(name);
            }
            count.close();
        	} catch ( Exception e ) {
        		System.out.println(e.getMessage());
        	}
        
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_SchoolGradingApp","root","");
            Statement count = con.createStatement();
            ResultSet ct = count.executeQuery(sqlx);
            while(ct.next()){ 
                String grade1 = ct.getString(1); 
                System.out.println(grade1);
            }
            count.close();
        	} catch ( Exception e ) {
        		System.out.println(e.getMessage());
        	}
        
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_SchoolGradingApp","root","");
            Statement count = con.createStatement();
            ResultSet ct = count.executeQuery(sqlz);
            while(ct.next()){
                String grade2 = ct.getString(1);
                System.out.println(grade2);
            }
            count.close();
        	} catch ( Exception e ) {
        		System.out.println(e.getMessage());
        	}
        
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_SchoolGradingApp","root","");
            Statement count = con.createStatement();
            ResultSet ct = count.executeQuery(sqly);
            while(ct.next()){ 
                String grade3 = ct.getString(1); 
            }
            count.close();
        	} catch ( Exception e ) {
        		System.out.println(e.getMessage());
        	}
              
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_SchoolGradingApp","root","");
            Statement count = con.createStatement();
            ResultSet ct = count.executeQuery(sqlp);
            while(ct.next()) { 
                String gradeaverage = ct.getString(1); 
                System.out.println(gradeaverage);
            }
            count.close();
         	} catch ( Exception e ) {
         		System.out.println(e.getMessage());
         	}      
    }

    public ResultSet TableData() {
        ResultSet rs = null;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_SchoolGradingApp","root","");
            Statement s = con.createStatement();
            rs = s.executeQuery("select * from classgrades");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }
}

