package com.coursemanagement.CourseManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Controller;

@Configuration
@EnableWebSecurity
public class FormSecurityConfig  extends WebSecurityConfigurerAdapter{

@Autowired
protected void configureGlobal(AuthenticationManagerBuilder auth)throws Exception
{

auth.inMemoryAuthentication().withUser("veena").password("{noop}veena123")
.authorities("ROLE_USER").and().withUser("Madhuri").password("{noop}madhuri")
		.authorities("ROLE_ADMIN");

}
@Override
protected void configure(HttpSecurity http)throws Exception
{
	http.authorizeRequests().antMatchers("/").permitAll()
	.antMatchers("/admin")
	.hasRole("ADMIN").antMatchers("/student").hasRole("USER)")
	.anyRequest().authenticated().and().formLogin()
	.permitAll().and().logout().permitAll();
	http.csrf().disable();
			
}
}
