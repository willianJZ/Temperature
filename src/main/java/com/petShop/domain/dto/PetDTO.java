package com.petShop.domain.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PetDTO {
    private Integer idPet;
    private String namePet;
    private String species;
    private Integer age;
    private String gender;
    private Integer propietarios_id;

}