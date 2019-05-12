package fi.haagahelia.venekorjaamo.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dao { 
	

	public Connection con=null;
	public ResultSet rs = null;
	public PreparedStatement stmtPrep=null; 
	public String sql;
	
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	
	public Connection yhdista() throws Exception{
    	Connection con = null;    	        	
    	//String JDBCAjuri = "org.mysql.jdbc.Driver";
    	//String url = "jdbc:mariadb://localhost:3306/a1700415";
    	//String url = "jdbc:mysql://localhost:3306/testing123";
   	    // Portti 3306 toinen vaihtoehto
    	//Class.forName(JDBCAjuri);
	    //con = DriverManager.getConnection(url,"mysqluser", "JuuseriHaaga!9");	      
	    con = dataSource.getConnection();
	    // mysqluser
	    //Salasana: JuuseriHaaga!9

	    return con;	    
	}
	
	public void sulje() throws Exception{
		if(con!=null){			
			con.close();			
		}		
	}		
}