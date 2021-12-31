package com.restapi.crud.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Brand")
public class BrandModel {

    @Id
    @GeneratedValue
    private int id;
    private String brandName;
    private int qnty;

    public BrandModel(int id, String brandName, int qnty) {
        this.id = id;
        this.brandName = brandName;
        this.qnty = qnty;
    }

    public BrandModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getQnty() {
        return qnty;
    }

    public void setQnty(int qnty) {
        this.qnty = qnty;
    }
}
