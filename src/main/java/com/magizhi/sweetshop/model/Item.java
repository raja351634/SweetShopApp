package com.magizhi.sweetshop.model;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Item")
public class Item {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long Id;
    @Column
    private String description;
    @Column
    private BigDecimal price;

    public Item() {
    }

    public Item(String description, BigDecimal price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

}
