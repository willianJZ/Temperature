package com.petShop.persistence;

import com.petShop.persistence.crud.EmployeeCrudRepository;
import com.petShop.persistence.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {
    EmployeeCrudRepository employeeCrudRepository;

    public List<Employee> getAll() {
        return (List<Employee>) employeeCrudRepository.findAll();
    }
    public Employee save(Employee employee){
        return employeeCrudRepository.save(employee);
    }
    public void delete(int id){ employeeCrudRepository.deleteById(id);
    }
    public boolean existsEmploye(int id){ return employeeCrudRepository.existsById(id);
    }
    public long countAll(){
        return employeeCrudRepository.count();
    }
}

