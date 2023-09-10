package springboothsecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
public class SecurityConfiguration {

	/*
	 * @Bean public UserDetailsService
	 * userDetailsService(AuthenticationManagerBuilder auth) throws Exception {
	 * InMemoryUserDetailsManager userDetailsService = new
	 * InMemoryUserDetailsManager(); //UserDetails user =
	 * User.withUsername("foo").password("foo").authorities("read").build();
	 * UserDetails user =
	 * User.withUsername("foo").password(getPasswordEncoder().encode("foo")).
	 * authorities("read").build(); userDetailsService.createUser(user); return
	 * userDetailsService; }
	 */

	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		// http.httpBasic();
		http.formLogin();

		http.authorizeHttpRequests().anyRequest().authenticated();
		// http.authorizeHttpRequests().requestMatchers("/home").authenticated();
		// http.addFilterBefore(new SecurityConfiguration(),
		// BasicAuthenticationFilter.class);

		http.addFilterBefore(new MySecurityFilter(), BasicAuthenticationFilter.class);

		return http.build();
	}
}
