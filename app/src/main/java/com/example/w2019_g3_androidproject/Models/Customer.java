package com.example.w2019_g3_androidproject.Models;

import java.util.ArrayList;

public class Customer extends User
{
    private String _custName;
    private String _address;
    private String _email;
    private String _creditCardInfo;
    private String _shippingInfo;
    public ArrayList<ShoppingCart> _shoppingCart;
    public ArrayList<Order> _orders;

/*
    public Customer(String _custName, String _address, String _email, String _creditCardInfo, String _shippingInfo, ArrayList<ShoppingCart> _shoppingCart, ArrayList<Order> _orders) {
        this._custName = _custName;
        this._address = _address;
        this._email = _email;
        this._creditCardInfo = _creditCardInfo;
        this._shippingInfo = _shippingInfo;
        this._shoppingCart = _shoppingCart;
        this._orders = _orders;
    }
*/

    public Customer(String _userId, String _password, String _loginStatus, String _custoName, String _address, String _email, String _creditCardInfo, String _shippingInfo, ArrayList<ShoppingCart> _shoppingCart, ArrayList<Order> _orders) {
        super(_userId, _password, _loginStatus);
        this._custName = _custoName;
        this._address = _address;
        this._email = _email;
        this._creditCardInfo = _creditCardInfo;
        this._shippingInfo = _shippingInfo;
        this._shoppingCart = _shoppingCart;
        this._orders = _orders;
    }


    public String get_custName() {
        return _custName;
    }

    public void set_custName(String _custName) {
        this._custName = _custName;
    }

    public String get_address() {
        return _address;
    }

    public void set_address(String _address) {
        this._address = _address;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public String get_creditCardInfo() {
        return _creditCardInfo;
    }

    public void set_creditCardInfo(String _creditCardInfo) {
        this._creditCardInfo = _creditCardInfo;
    }

    public String get_shippingInfo() {
        return _shippingInfo;
    }

    public void set_shippingInfo(String _shippingInfo) {
        this._shippingInfo = _shippingInfo;
    }

    public ArrayList<ShoppingCart> get_shoppingCart() {
        return _shoppingCart;
    }


    public ArrayList<Order> get_orders() {
        return _orders;
    }

    public void set_orders(ArrayList<Order> _orders) {
        this._orders = _orders;
    }

    public boolean register(String CustomerName, String Address, String eMail, String CreditCardInfo, String ShippingInfo, String userId, String password, String loginStatus)    {

        // Validations

        this._custName = CustomerName;
        this._address = Address;
        this._email = eMail;
        this._creditCardInfo = CreditCardInfo;
        this._shippingInfo = ShippingInfo;
        super.set_userId(userId);
        super.set_password(password);

        return true;
    }

    public boolean login()
    {


        return true;
    }

    public boolean updateProfile()
    {


        return true;
    }

    public boolean checkOut()
    {


        return true;
    }


}
