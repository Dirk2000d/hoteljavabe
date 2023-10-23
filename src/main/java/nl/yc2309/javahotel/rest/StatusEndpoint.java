package nl.yc2309.javahotel.rest;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.yc2309.javahotel.domein.Account;

@RestController
public class StatusEndpoint {

	@GetMapping("status")
	public String status(HttpServletRequest request) {
		Account account = (Account)request.getAttribute("YC_USER");

		return "OK. Ingelogd: " + (account != null);
	}

	// Dit endpoint laat ons zien wie is ingelogd met een bepaalde token
	@GetMapping("ingelogd")
	public Account ingelogd(HttpServletRequest request) {
		return (Account)request.getAttribute("YC_USER");
	}

}
