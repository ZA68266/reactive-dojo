package com.example.reactivedojo.models;

public class Cart {
    private int id;
    private int productId;

    public Cart(int id, int productId) {
        this.id = id;
        this.productId = productId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
