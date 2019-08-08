package com.baizhi.entity;

public class Product {
    private  Integer  id;
    private  String  productname;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productname='" + productname + '\'' +
                '}';
    }
}
