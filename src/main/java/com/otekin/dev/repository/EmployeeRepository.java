package com.otekin.dev.repository;

import com.otekin.dev.models.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

	Optional<Employee> findByEmployeename(String employeename);

	Boolean existsByEmployeename(String employeename);

	Boolean existsByEmail(String email);
}
