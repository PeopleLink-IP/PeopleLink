package app.Link;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinkApplication.class, args);
	}

	@GetMapping("/hello")
	@CrossOrigin(origins = "http://localhost:5173")
	public String home() {
		return "Hello World";
	}
}
