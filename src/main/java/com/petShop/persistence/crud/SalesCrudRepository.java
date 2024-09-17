package com.petShop.persistence.crud;

import com.petShop.persistence.entity.Employee;
import com.petShop.persistence.entity.Sales;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface SalesCrudRepository extends CrudRepository<Sales, Integer> {
    Optional <List<Sales>> findByCuantityPets(int cuantityPets);

    Optional <List<Sales>> findByCuantityProducts(int cuantityProducts);

    List<Sales> findByCodeBill(int codeBill);
}
