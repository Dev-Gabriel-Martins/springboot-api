package com.example.springbootapi.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_PRODUCTS")
public class ProductModel implements Serializable {
    
    private static final long serialVersionUID = 1L;

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    /* UUID é um tipo especifico para chaves primarias
     * pensada em arq complexas onde id seguênciais pode haver conflitos com outros id
     */

    private UUID idProduct; 
    private String name;
    private BigDecimal value; //Tipo BigDecimal, mais recomendado para representar valores monetarios
    
    
    //Getters 
    
    public UUID getIdProduct() {
        return idProduct;
    }
    public void setIdProduct(UUID idProduct) {
        this.idProduct = idProduct;
    }
    public String getName() {
        return name;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public BigDecimal getValue() {
        return value;
    }
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    

}