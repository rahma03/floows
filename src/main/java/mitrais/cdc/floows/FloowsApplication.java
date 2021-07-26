package mitrais.cdc.floows;

import mitrais.cdc.floows.properties.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EntityScan("mitrais.cdc.floows.model")
@SpringBootApplication
@EnableConfigurationProperties({
		FileStorageProperties.class
})
public class FloowsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FloowsApplication.class, args);
	}

}
