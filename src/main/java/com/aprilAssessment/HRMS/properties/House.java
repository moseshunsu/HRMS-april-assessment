package com.aprilAssessment.HRMS.properties;

import com.aprilAssessment.HRMS.entity.Location;
import com.aprilAssessment.HRMS.entity.OccupiedStatus;
import com.aprilAssessment.HRMS.entity.Property;
import com.aprilAssessment.HRMS.util.PropertyCodeGenerator;
import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
public class House extends Property {
    private int numberOfFloors;
    private double yardSize;

    public House(Location location, int numberOfBedrooms, int numberOfBathrooms,
                 double rentPerMonth, OccupiedStatus occupiedStatus, int numberOfFloors, double yardSize) {
        super(location, numberOfBedrooms, numberOfBathrooms, rentPerMonth, occupiedStatus);
        propertyCode = PropertyCodeGenerator.generateCode("HOU");
    }

}
