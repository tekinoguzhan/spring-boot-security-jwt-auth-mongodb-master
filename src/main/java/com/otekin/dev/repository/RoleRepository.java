package com.otekin.dev.repository;

import com.otekin.dev.models.ERole;
import com.otekin.dev.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {

	Optional<Role> findByName(ERole name);
}
