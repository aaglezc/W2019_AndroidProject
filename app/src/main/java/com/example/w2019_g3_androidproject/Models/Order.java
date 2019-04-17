package com.example.w2019_g3_androidproject.Models;

import java.util.ArrayList;
import java.util.Date;

public class Order
{
    private Integer _orderId;
    private Date _dateCreated;
    private Date _dateShipped;
    private String _customerName;
    private String _customerId;
    private String _status;
    private ShippingInfo _shippingInfo;
    private ArrayList<OrderDetails> _orderDetails;


    public Order(Integer _orderId, Date _dateCreated, Date _dateShipped, String _customerName, String _customerId, String _status) {
        this._orderId = _orderId;
        this._dateCreated = _dateCreated;
        this._dateShipped = _dateShipped;
        this._customerName = _customerName;
        this._customerId = _customerId;
        this._status = _status;
        this._shippingInfo = new ShippingInfo();
        this._orderDetails = new ArrayList<>();
    }

    public Integer get_orderId() {
        return _orderId;
    }

    public void set_orderId(Integer _orderId) {
        this._orderId = _orderId;
    }

    public Date get_dateCreated() {
        return _dateCreated;
    }

    public void set_dateCreated(Date _dateCreated) {
        this._dateCreated = _dateCreated;
    }

    public Date get_dateShipped() {
        return _dateShipped;
    }

    public void set_dateShipped(Date _dateShipped) {
        this._dateShipped = _dateShipped;
    }

    public String get_customerName() {
        return _customerName;
    }

    public void set_customerName(String _customerName) {
        this._customerName = _customerName;
    }

    public String get_customerId() {
        return _customerId;
    }

    public void set_customerId(String _customerId) {
        this._customerId = _customerId;
    }

    public String get_status() {
        return _status;
    }

    public void set_status(String _status) {
        this._status = _status;
    }

    public ShippingInfo get_shippingInfo() {
        return _shippingInfo;
    }

    public void set_shippingInfo(ShippingInfo _shippingInfo) {
        this._shippingInfo = _shippingInfo;
    }

    public ArrayList<OrderDetails> get_orderDetails() {
        return _orderDetails;
    }

    public void set_orderDetails(ArrayList<OrderDetails> _orderDetails) {
        this._orderDetails = _orderDetails;
    }


    public boolean placeOrder()
    {


        return true;
    }

    public boolean grandTotal()
    {


        return true;
    }



}
