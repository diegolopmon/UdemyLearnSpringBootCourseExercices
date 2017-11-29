package com.diegolopmon.springbootcourse.exercices.security;

import com.diegolopmon.springbootcourse.exercices.security.domain.Role;
import com.diegolopmon.springbootcourse.exercices.security.domain.User;
import com.diegolopmon.springbootcourse.exercices.security.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.jws.soap.SOAPBinding;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SecurityApplication {

	@Autowired
	private void createAdminUser(UserServiceImpl userService) {
		Role adminRole = new Role();
		adminRole.setRole("ADMIN");
		Set<Role> adminRoles = new HashSet<>();
		adminRoles.add(adminRole);

		User admin = new User();
		admin.setEmail("admin@diegolopmon.com");
		admin.setFullName("Administrator");
		admin.setPassword("admin");
		admin.setRoles(adminRoles);
		userService.save(admin);
	}

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}
}
