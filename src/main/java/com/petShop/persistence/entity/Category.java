package com.petShop.persistence.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="categoria")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idcaegoria")
    private Integer id;
    public Integer getId() {
        return id;
    }

    @Column(name="nombre")
    private String name;
    public String getName() {
        return name;
    }

}
