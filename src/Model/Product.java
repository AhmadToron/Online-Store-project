package Model;

import Controller.DBController;

public class Product {
    private String productName;
    private int productQuantity;
    private int productPrice;
    private String productSupplier;
    private DBController dbController;

    public Product(String productName, int productQuantity, int productPrice, String productSupplier, DBController dbController) {
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
        this.productSupplier = productSupplier;
        this.dbController = dbController;
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public int getProductQuantity() {
        return productQuantity;
    }
    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
    public int getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
    public String getProductSupplier() {
        return productSupplier;
    }
    public void setProductSupplier(String productSupplier) {
        this.productSupplier = productSupplier;
    }

}