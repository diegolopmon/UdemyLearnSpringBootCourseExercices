package com.diegolopmon.springbootcourse.exercices.dataaccess.repository;

import com.diegolopmon.springbootcourse.exercices.dataaccess.domain.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Long> {

}
