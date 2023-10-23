package nl.yc2309.javahotel.filter;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import nl.yc2309.javahotel.domein.Account;
import nl.yc2309.javahotel.persistence.AccountService;

@Component
public class LoginFilter extends OncePerRequestFilter {

	@Autowired
	private AccountService accountService;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// Haal de request header op die in de frontend is gezet
		String authorizationToken = request.getHeader("Authorization");

		// Is de token wel ingevuld en niet leeg
		if (authorizationToken != null && !authorizationToken.isBlank()) {
			// Vind de token in de database
			Optional<? extends Account> optionalAccount = accountService.findByToken(authorizationToken.substring(7));

			// Als de account wel gevonden is
			if (optionalAccount.isPresent()) {
				// Haal de user op uit de optional
				Account account = optionalAccount.get();

				// Plaats de user in de request
				request.setAttribute("YC_USER", account);
			}
		}

		filterChain.doFilter(request, response);
	}

}