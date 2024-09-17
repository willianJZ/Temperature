package com.petShop.persistence;

import com.petShop.persistence.crud.CategoryCrudRepository;
import com.petShop.persistence.crud.EmployeeCrudRepository;
import com.petShop.persistence.entity.Category;
import com.petShop.persistence.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryRepository {

    CategoryCrudRepository categoryCrudRepository;

    public List<Category> getAll() {
        return (List<Category>) categoryCrudRepository.findAll();
    }
    public Category save(Category category){
        return categoryCrudRepository.save(category);
    }
    public void delete(int id){ categoryCrudRepository.deleteById(id);
    }
    public boolean existsCategory(int id){ return categoryCrudRepository.existsById(id);
    }
    public long countAll(){
        return categoryCrudRepository.count();
    }
}

