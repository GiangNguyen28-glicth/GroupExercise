package com.group.Exercise.Week4;

import java.text.NumberFormat;

public class LineItem {
      private  ProductModel product;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private int quantity;

    public ProductModel getProduct() {
        return product;
    }

    public void setProduct(ProductModel product) {
        this.product = product;
    }
    public double getTotal(){
        return product.getPrice()*quantity;
    }
    public LineItem(){

    }
//    private ProductModel product;
//    private int quantity;
//
//    public LineItem() {
//    }
//
//    public void setProduct(ProductModel p) {
//        product = p;
//    }
//
//    public ProductModel getProduct() {
//        return product;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//

//
    public String getTotalCurrencyFormat() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(this.getTotal());
    }
}
