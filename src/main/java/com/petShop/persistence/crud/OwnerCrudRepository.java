package com.petShop.persistence.crud;

import com.petShop.persistence.entity.Owner;
import com.petShop.persistence.entity.Pet;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OwnerCrudRepository extends CrudRepository<Owner, Integer> {
    List<Owner> findByNameOwnerOrderByNameOwnerAsc(String species);

    List<Owner> findByAddress(String address);

    List<Owner> findByCell(int cell);

    List<Owner> findByAddressAndCell(String address, int cell);

    List<Owner> findByIdOwner(int idOwner);

    List<Owner> findByNameOwnerAndLastName (String nameOwner, String lastName);


}



