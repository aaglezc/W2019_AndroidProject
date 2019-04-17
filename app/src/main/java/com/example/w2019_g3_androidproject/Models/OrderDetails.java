package com.example.w2019_g3_androidproject.Models;

public class OrderDetails
{
    private Integer _orderId;
    private Integer _productId;
    private String _productName;
    private Integer _quantity;
    private Double _unitCost;
    private Double _subTotal;
   // {
   //     return (this._unitCost * this._quantity);
   // }


    public OrderDetails()
    {

    }

    public OrderDetails(Integer _orderId, Integer _productId, String _productName, Integer _quantity, Double _unitCost, Double _subTotal) {
        this._orderId = _orderId;
        this._productId = _productId;
        this._productName = _productName;
        this._quantity = _quantity;
        this._unitCost = _unitCost;
        this._subTotal = _subTotal;
    }

    public Integer get_orderId() {
        return _orderId;
    }

    public void set_orderId(Integer _orderId) {
        this._orderId = _orderId;
    }

    public Integer get_productId() {
        return _productId;
    }

    public void set_productId(Integer _productId) {
        this._productId = _productId;
    }

    public String get_productName() {
        return _productName;
    }

    public void set_productName(String _productName) {
        this._productName = _productName;
    }

    public Integer get_quantity() {
        return _quantity;
    }

    public void set_quantity(Integer _quantity) {
        this._quantity = _quantity;
    }

    public Double get_unitCost() {
        return _unitCost;
    }

    public void set_unitCost(Double _unitCost) {
        this._unitCost = _unitCost;
    }

    public Double get_subTotal() {
        return _subTotal;
    }

    public void set_subTotal(Double _subTotal) {
        this._subTotal = _subTotal;
    }
}
