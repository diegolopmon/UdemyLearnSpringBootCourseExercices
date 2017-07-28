package com.diegolopmon.springbootcourse.exercices.dataaccess;


import com.diegolopmon.springbootcourse.exercices.dataaccess.service.DataLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class DataAccessApplication {

	private DataLoader dataLoader;

	@Autowired
	private void setDataLoader( DataLoader dataLoader ) {
		this.dataLoader = dataLoader;
	}

	public static void main(String[] args) {
		SpringApplication.run(DataAccessApplication.class, args);
	}


}
