package edu.photoapp.api.users.repository;

import edu.photoapp.api.users.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}