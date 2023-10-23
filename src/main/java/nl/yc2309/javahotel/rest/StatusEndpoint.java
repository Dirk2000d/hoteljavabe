package nl.yc2309.javahotel.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusEndpoint {

	@GetMapping("status")
	public String status() {
		return "OK";
	}
	
}
