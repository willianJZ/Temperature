package com.petShop.persistence;

import com.petShop.persistence.crud.EmployeeCrudRepository;
import com.petShop.persistence.crud.SalesCrudRepository;
import com.petShop.persistence.entity.Employee;
import com.petShop.persistence.entity.Sales;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SalesRepository {
    SalesCrudRepository salesCrudRepository;

    public List<Sales> getAll() {
        return (List<Sales>) salesCrudRepository.findAll();
    }
    public Sales save(Sales sales){
        return salesCrudRepository.save(sales);
    }
    public void delete(int id){ salesCrudRepository.deleteById(id);
    }
    public boolean existsSales(int id){ return salesCrudRepository.existsById(id);
    }
    public long countAll(){
        return salesCrudRepository.count();
    }
}

