package fi.haagahelia.venekorjaamo.web;

import java.util.ArrayList;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fi.haagahelia.venekorjaamo.Dao.Dao_ekataulu;
import fi.haagahelia.venekorjaamo.Model.Ekataulu;

@Controller
public class HomeController {
	
	

	@GetMapping("/home")
	public String homeRedirect()
	{
		// Tää toimii.
		// Nyt yhteys tietokantaan.
	
	  	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
   	 
        Dao_ekataulu dao = (Dao_ekataulu) context.getBean("Dao_ekataulu");
		
		
		//Dao_ekataulu dao = new Dao_ekataulu();
		
		ArrayList<Ekataulu> ekataulut = new ArrayList<Ekataulu>();
	
		try {
		ekataulut = dao.listaaKaikki();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		for (int i=0; i<ekataulut.size();i++)
		{
			System.out.println(ekataulut.get(i));
			
		}
	
	
		
		
		
		return "home";
		
	}


}
