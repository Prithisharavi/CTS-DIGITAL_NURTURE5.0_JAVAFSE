package com.cognizant.inventoryservice.model;

public class Inventory {

    private int productId;
    private String productName;
    private int availableStock;

    public Inventory() {
    }

    public Inventory(int productId, String productName, int availableStock) {
        this.productId = productId;
        this.productName = productName;
        this.availableStock = availableStock;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getAvailableStock() {
        return availableStock;
    }

    public void setAvailableStock(int availableStock) {
        this.availableStock = availableStock;
    }
}