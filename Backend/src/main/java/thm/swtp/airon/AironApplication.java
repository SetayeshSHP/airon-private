package thm.swtp.airon;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/** Represent a Main Application for run the program.
 * @author Mohammed....
 * @version 1.0
 * @since 1.0
 */

@SpringBootApplication
@OpenAPIDefinition
public class AironApplication {

	public static void main(String[] args) {
		SpringApplication.run(AironApplication.class, args);
	}
}
