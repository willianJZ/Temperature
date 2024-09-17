package com.petShop.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="propietarios")
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer idOwner;

    //@OneToMany(mappedBy = "idPet", cascade = CascadeType.ALL)
    //private Set<Pet> pet;


    @Column(name = "nombre")
    private String nameOwner;

    @Column(name="apellido")
    private String lastName;

    @Column(name = "correo")
    private String email;

    @Column(name = "telefono")
    private Integer cell;

    @Column(name = "direccion")
    private String address;

    @Column(name = "mascotas_id")
    private Integer petId;

    //@OneToMany(mappedBy = "propietarios_id")
    //private List<Pet> pet;

    public Integer getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(Integer idOwner) {
        this.idOwner = idOwner;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {this.email = email;
    }

    public Integer getCell() {
        return cell;
    }

    public void setCell(Integer cell) {
        this.cell = cell;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {this.address = address;
    }

    public Integer getPetid() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }
}
