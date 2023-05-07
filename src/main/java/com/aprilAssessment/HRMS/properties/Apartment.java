package com.aprilAssessment.HRMS.properties;

import com.aprilAssessment.HRMS.entity.Location;
import com.aprilAssessment.HRMS.entity.OccupiedStatus;
import com.aprilAssessment.HRMS.entity.Property;
import com.aprilAssessment.HRMS.util.PropertyCodeGenerator;
import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
public class Apartment extends Property {

    private double floorNumber;

    public Apartment(Location location, int numberOfBedrooms, int numberOfBathrooms,
                     double rentPerMonth, OccupiedStatus occupiedStatus, double floorNumber) {
        super(location, numberOfBedrooms, numberOfBathrooms, rentPerMonth, occupiedStatus);
        this.floorNumber = floorNumber;
        propertyCode = PropertyCodeGenerator.generateCode("APA");
    }

}
