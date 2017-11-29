package com.diegolopmon.springbootcourse.exercices.security.service;

import com.diegolopmon.springbootcourse.exercices.security.domain.User;

public interface UserService {
    User findByEmail(String email);
    void save(User user);
}
