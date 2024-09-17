package com.petShop.domain;

import lombok.Data;

@Data
public class PetDomain {
    private Integer idPet;
    private String namePet;
    private String species;
    private Integer age;
    private String gender;
    private Integer propietarios_id;
    private OwnerDomain ownerDomain;
}
