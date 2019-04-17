package com.example.w2019_g3_androidproject.Models;

public class ShippingInfo
{
    private Integer _shippingId;
    private String _shippingType;
    private Double _shippingCost;
    private Integer _shippingRegionId;

    public ShippingInfo()
    {

    }

    public ShippingInfo(Integer _shippingId, String _shippingType, Double _shippingCost, Integer _shippingRegionId) {
        this._shippingId = _shippingId;
        this._shippingType = _shippingType;
        this._shippingCost = _shippingCost;
        this._shippingRegionId = _shippingRegionId;
    }

    public Integer get_shippingId() {
        return _shippingId;
    }

    public void set_shippingId(Integer _shippingId) {
        this._shippingId = _shippingId;
    }

    public String get_shippingType() {
        return _shippingType;
    }

    public void set_shippingType(String _shippingType) {
        this._shippingType = _shippingType;
    }

    public Double get_shippingCost() {
        return _shippingCost;
    }

    public void set_shippingCost(Double _shippingCost) {
        this._shippingCost = _shippingCost;
    }

    public Integer get_shippingRegionId() {
        return _shippingRegionId;
    }

    public void set_shippingRegionId(Integer _shippingRegionId) {
        this._shippingRegionId = _shippingRegionId;
    }


    public boolean updateShippingInfo()
    {


        return true;
    }


}
