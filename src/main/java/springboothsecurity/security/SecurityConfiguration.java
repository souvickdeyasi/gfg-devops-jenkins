package springboothsecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfiguration {

	/*
	 * @Bean public void filterChain(AuthenticationManagerBuilder auth) throws
	 * Exception { auth .inMemoryAuthentication() .withUser("foo") .password("foo")
	 * .roles("USER"); }
	 */
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
