package com.aprilAssessment.HRMS.entity;

import lombok.*;

@Getter
@Setter
@ToString
public abstract class Property {
    @Setter(AccessLevel.NONE)
    protected String propertyCode;
    private Location location;
    private int numberOfBedrooms;
    private int numberOfBathrooms;
    private double rentPerMonth;
    private OccupiedStatus occupiedStatus;


    public Property(Location location, int numberOfBedrooms, int numberOfBathrooms, double rentPerMonth,
                    OccupiedStatus occupiedStatus) {
        this.location = location;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.rentPerMonth = rentPerMonth;
        this.occupiedStatus = occupiedStatus;
    }

}
