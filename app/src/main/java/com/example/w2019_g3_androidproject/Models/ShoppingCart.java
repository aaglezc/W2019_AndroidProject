package com.example.w2019_g3_androidproject.Models;

import java.util.Date;

public class ShoppingCart
{
    private Integer _cartId;
    private Product _productId;
    private Integer _quantity;
    private Date _dateAdded;


    public ShoppingCart()
    {

    }

    public ShoppingCart(Integer _cartId, Product _productId, Integer _quantity, Date _dateAdded) {
        this._cartId = _cartId;
        this._productId = _productId;
        this._quantity = _quantity;
        this._dateAdded = _dateAdded;
    }

    public Integer get_cartId() {
        return _cartId;
    }

    public void set_cartId(Integer _cartId) {
        this._cartId = _cartId;
    }

    public Product get_productId() {
        return _productId;
    }

    public void set_productId(Product _productId) {
        this._productId = _productId;
    }

    public Integer get_quantity() {
        return _quantity;
    }

    public void set_quantity(Integer _quantity) {
        this._quantity = _quantity;
    }

    public Date get_dateAdded() {
        return _dateAdded;
    }

    public void set_dateAdded(Date _dateAdded) {
        this._dateAdded = _dateAdded;
    }

    public void addCartItem(Customer customer)
    {
        ShoppingCart dd = new ShoppingCart(this._cartId,this._productId,this._quantity,this._dateAdded);
        customer._shoppingCart.add(dd);


    }


}

