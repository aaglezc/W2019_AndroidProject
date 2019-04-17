package com.example.w2019_g3_androidproject.Models;

import java.io.Serializable;

public class Product implements Serializable
{
    private Integer _productId;
    private String _productName;
    private Double _price;
    private String _author;
    private Integer _year;
    private String _imgCover;
    private String _mp3;

    public Product()
    {

    }

    public Product(Integer _productId, String _productName, Double _price, String _author, Integer _year, String _imgCover, String _mp3) {
        this._productId = _productId;
        this._productName = _productName;
        this._price = _price;
        this._author = _author;
        this._year = _year;
        this._imgCover = _imgCover;
        this._mp3 = _mp3;
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

    public Double get_price() {
        return _price;
    }

    public void set_price(Double _price) {
        this._price = _price;
    }

    public String get_author() {
        return _author;
    }

    public void set_author(String _author) {
        this._author = _author;
    }

    public Integer get_year() {
        return _year;
    }

    public void set_year(Integer _year) {
        this._year = _year;
    }

    public String get_imgCover() {
        return _imgCover;
    }

    public void set_imgCover(String _imgCover) {
        this._imgCover = _imgCover;
    }

    public String get_mp3() {
        return _mp3;
    }

    public void set_mp3(String _mp3) {
        this._mp3 = _mp3;
    }
}
