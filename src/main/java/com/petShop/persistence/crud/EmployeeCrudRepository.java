package com.petShop.persistence.crud;

import com.petShop.persistence.entity.Employee;
import com.petShop.persistence.entity.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeCrudRepository extends CrudRepository<Employee, Integer> {

    List<Employee> findByName(String name);

    List<Employee> findByEmail(String email);

    List<Employee> findByLastName(String lastName);

    List<Employee> findByNameAndLastName(String name, String lastName);

    List<Employee> findById(int id);


}
