package com.diegolopmon.springbootcourse.exercices.webservices;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

@SpringBootApplication
@EnableAutoConfiguration
public class WebServicesApplication {

	@Bean
	public EmbeddedServletContainerCustomizer containerCustomizer(){
		return ( container -> {
			ErrorPage custom404Page = new ErrorPage(HttpStatus.NOT_FOUND,"/404");
			container.addErrorPages(custom404Page);
		});
	}

	public static void main(String[] args) {
		SpringApplication.run(WebServicesApplication.class, args);
	}
}
