package com.diegolopmon.springbootcourse.exercices.security.repository;

import com.diegolopmon.springbootcourse.exercices.security.domain.User;
import org.springframework.data.repository.CrudRepository;

import javax.jws.soap.SOAPBinding;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);
}
