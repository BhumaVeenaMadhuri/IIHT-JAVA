package com.coursemanagement.CourseManagement;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//@Configuration
//@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("veena").password("{noop}veena").roles("USER");
		auth.inMemoryAuthentication().withUser("madhuri").password("{noop}madhuri").roles("USER");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic().and()
		.authorizeRequests()
		.antMatchers(HttpMethod.GET,"/homepage").hasRole("USER")
		.antMatchers(HttpMethod.GET,"/admin").hasRole("ADMIN")
		.and()
		.csrf().disable()
		.formLogin().disable();
	}
	

}
