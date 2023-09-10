package springboothsecurity.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HomeResourceController {

	@GetMapping("/")
	public String home() {
		return ("<h1>Welocme to Spring security learning!</h1>");
	}
	

	@GetMapping("/home")
	public String newHome() {
		return ("<h1>Welocme to New Spring security learning!</h1>");
	}
}
