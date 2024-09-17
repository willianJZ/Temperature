package com.petShop.persistence;

import com.petShop.persistence.crud.OwnerCrudRepository;
import com.petShop.persistence.entity.Owner;
import com.petShop.persistence.entity.Pet;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;


@Repository
public class OwnerRepository {
    OwnerCrudRepository ownerCrudRepository;

    /*public List<Owner> getAllOwners() {
        return (List<Owner>) ownerCrudRepository.findAll();
        //SELECT * FROM propietarios*/
    public List<Owner> getAll() {
        return (List<Owner>) ownerCrudRepository.findAll();
    }
    public Owner save(Owner owner){
        return ownerCrudRepository.save(owner);
    }
    public void delete(int id){ ownerCrudRepository.deleteById(id);
    }
    public boolean existsOwner(int id){ return ownerCrudRepository.existsById(id);
    }
    public long countAll(){
        return ownerCrudRepository.count();
    }
}

