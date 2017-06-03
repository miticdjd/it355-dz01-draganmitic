package com.it355.draganmitic.model;

/**
 * Hotel Room model
 */
public class HotelRoom {
    
    private Integer beds;
    private Integer space;
    private Boolean bathroom;
    private Boolean tv;
    private Boolean airConditioning;
    private Double pricePerDay;

    public HotelRoom() {
    }

    public HotelRoom(Integer beds, Integer space, Boolean bathroom, Boolean tv, Boolean airConditioning, Double pricePerDay) {
        this.beds = beds;
        this.space = space;
        this.bathroom = bathroom;
        this.tv = tv;
        this.airConditioning = airConditioning;
        this.pricePerDay = pricePerDay;
    }

    public Integer getBeds() {
        return beds;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public Integer getSpace() {
        return space;
    }

    public void setSpace(Integer space) {
        this.space = space;
    }

    public Boolean getBathroom() {
        return bathroom;
    }

    public void setBathroom(Boolean bathroom) {
        this.bathroom = bathroom;
    }

    public Boolean getTv() {
        return tv;
    }

    public void setTv(Boolean tv) {
        this.tv = tv;
    }

    public Boolean getAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(Boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
    
}
