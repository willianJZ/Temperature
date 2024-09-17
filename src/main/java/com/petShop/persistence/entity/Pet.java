package com.petShop.persistence.entity;

import jakarta.persistence.*;
import com.petShop.persistence.entity.Owner;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "mascotas")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idPet;

    @ManyToOne
    private Owner owner;

    //ManyToOne
    //@JoinColumn(name ="id")
    //private Owner Pet;


    @Column(name = "nombre")
    private String namePet;

    @Column(name = "especie")
    private String species;

    @Column(name = "edad")
    private int age;

    @Column(name = "genero")
    private String gender;


    @Column(name="propietarios_id")
    private Integer propietarios_id;



}
