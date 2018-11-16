package io.github.tubean.myspringcrud.repository;

import io.github.tubean.myspringcrud.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}
