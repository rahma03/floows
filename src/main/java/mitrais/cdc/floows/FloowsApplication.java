package mitrais.cdc.floows;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("mitrais.cdc.floows.repository")
@EntityScan("mitrais.cdc.floows.model")
@SpringBootApplication
public class FloowsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FloowsApplication.class, args);
	}

}
