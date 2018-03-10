package com.example.demo.model;

import javax.persistence.*;
import javax.validation.Valid;

@Entity
@Table(name = "products")
public class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, updatable = false)
    private long id;

    @Column(name = "name", nullable = true, unique = false, updatable = false)
    private String name;

    @Column(name = "amount", nullable = false, updatable = true)
    private int amount;

    @Column(name = "price", nullable = false, updatable = true)
    private int price;

    @Column(name = "description", nullable = true, unique = false, updatable = false)
    private String description;

    @Column(name = "image", nullable = true, unique = false, updatable = false)
    private String image;

    @Column(name = "producer", nullable = true, unique = false, updatable = false)
    private String producer;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }
    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }
}
