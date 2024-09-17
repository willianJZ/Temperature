package com.petShop.persistence.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="ventas")
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="codigoFactura")
    private Integer codeBill;
    public Integer getCodeBill() {
        return codeBill;
    }
    public void setCodeBill(Integer codeBill) {
        this.codeBill = codeBill;
    }

    @Column(name="cantidadMascotas")
    private Integer cuantityPets;
    public Integer getCuantityPets() {
        return cuantityPets;
    }
    public void setCuantityPets(Integer cuantityPets) {
        this.cuantityPets = cuantityPets;
    }

    @Column(name="cantidadProductos")
    private Integer cuantityProducts;
    public Integer getCuantityProducts() {
        return cuantityProducts;
    }
    public void setCuantityProducts(Integer cuantityProducts) {
        this.cuantityProducts = cuantityProducts;
    }

    @Column(name="totalPagar")
    private Integer totalPay;
    public Integer getTotalPay() {
        return totalPay;
    }
    public void setTotalPay(Integer totalPay) {
        this.totalPay = totalPay;
    }
}
