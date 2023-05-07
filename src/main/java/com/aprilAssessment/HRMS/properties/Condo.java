package com.aprilAssessment.HRMS.properties;

import com.aprilAssessment.HRMS.entity.Location;
import com.aprilAssessment.HRMS.entity.OccupiedStatus;
import com.aprilAssessment.HRMS.entity.Property;
import com.aprilAssessment.HRMS.util.PropertyCodeGenerator;
import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
public class Condo extends Property {

    private int numberOfFloors;
    private String amenities;

    public Condo(Location location, int numberOfBedrooms, int numberOfBathrooms,
                 double rentPerMonth, OccupiedStatus occupiedStatus, int numberOfFloors, String amenities) {
        super(location, numberOfBedrooms, numberOfBathrooms, rentPerMonth, occupiedStatus);
        this.numberOfFloors = numberOfFloors;
        this.amenities = amenities;
        propertyCode = PropertyCodeGenerator.generateCode("CON");
    }

}
