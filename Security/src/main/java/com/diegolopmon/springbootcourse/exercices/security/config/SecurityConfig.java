package com.diegolopmon.springbootcourse.exercices.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.HttpSecurityBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureAuth(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception{
        authenticationManagerBuilder
                .inMemoryAuthentication()
                .withUser("inmemory").password("password").roles("inmemory")
        .and()
                .withUser("diego").password("diegopassword").roles("user")
        .and()
                .withUser("admin").password("admin").roles("admin");
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.
            authorizeRequests()
                .antMatchers("/admin/**").hasRole("admin")
                .antMatchers("/").permitAll()
                .anyRequest().authenticated()
                .and()
             .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
             .logout()
                .logoutSuccessUrl("/login?logout")
                .permitAll();
    }
}
