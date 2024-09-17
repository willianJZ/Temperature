package com.petShop.persistence.crud;


import com.petShop.persistence.entity.Category;
import com.petShop.persistence.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoryCrudRepository extends CrudRepository<Category, Integer> {
    List<Category> findByName(String name);

    List<Category> findById(int id);

}
