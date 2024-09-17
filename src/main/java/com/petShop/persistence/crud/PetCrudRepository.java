package com.petShop.persistence.crud;

import com.petShop.persistence.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface PetCrudRepository extends JpaRepository<Pet, Integer> {

   Optional <List<Pet>> findBySpeciesOrderByNamePetAsc(String species);

    Optional <List<Pet>> findByAge(int age);

    Optional <List<Pet>> findByGender(String gender);

    List<Pet> findByNamePetAndSpecies(String namePet, String Species);

    List<Pet> findById(int idPet);

}
