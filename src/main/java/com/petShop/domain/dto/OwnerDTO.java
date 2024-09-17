package com.petShop.domain.dto;

import java.util.List;

public class OwnerDTO {
    private Integer idOwner;
    private String name;
    private String lastName;
    private String email;
    private int cell;
    private String address;
    private Integer petId;


    public Integer getIdOwner() {
        return idOwner;
    }
    public void setIdOwner(Integer getIdOwner) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setEmail(String email) {
        this.email = email;
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

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }
}

