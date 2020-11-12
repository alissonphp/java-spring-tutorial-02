package com.alissongomes.tutorial02.repositories;

import com.alissongomes.tutorial02.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
