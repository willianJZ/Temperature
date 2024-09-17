package com.petShop.domain;

import lombok.Data;

@Data
public class OwnerDomain {
    private Integer idOwner;
    private String name;
    private String lastName;
    private String email;
    private int cell;
    private String address;
    private Integer petId;
}
