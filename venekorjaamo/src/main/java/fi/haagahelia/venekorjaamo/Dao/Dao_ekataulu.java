package fi.haagahelia.venekorjaamo.Dao;


import java.util.ArrayList;

import javax.sql.DataSource;

import fi.haagahelia.venekorjaamo.Model.Ekataulu;




public class Dao_ekataulu extends Dao {
	
	
	
	public ArrayList<Ekataulu> listaaKaikki() throws Exception{
		ArrayList<Ekataulu> ekataulut = new ArrayList<Ekataulu>();
		sql = "SELECT * FROM ekataulu"; 		
		con=yhdista();
		if(con!=null){ //jos yhteys onnistui
			stmtPrep = con.prepareStatement(sql);        		
    		rs = stmtPrep.executeQuery();   
			if(rs!=null){ //jos kysely onnistui									
				while(rs.next()){
					Ekataulu ekataulu = new Ekataulu();
					ekataulu.setId(rs.getInt("Id"));
					ekataulu.setNimi(rs.getString("Nimi"));
					ekataulut.add(ekataulu);
				}					
			}
			con.close();
		}			
		return ekataulut;
	}

}
