package fi.haagahelia.venekorjaamo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class VenekorjaamoApplication {

	public static void main(String[] args) {
		SpringApplication.run(VenekorjaamoApplication.class, args);
	}

}
