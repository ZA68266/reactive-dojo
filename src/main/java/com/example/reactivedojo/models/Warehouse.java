package com.example.reactivedojo.models;

public class Warehouse {
    private int id;
    private int productId;
    private int count;

    public Warehouse(int id, int productId, int count) {
        this.id = id;
        this.productId = productId;
        this.count = count;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
