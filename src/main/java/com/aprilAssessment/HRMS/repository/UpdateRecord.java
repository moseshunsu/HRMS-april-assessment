package com.aprilAssessment.HRMS.repository;

import com.aprilAssessment.HRMS.Database.Database;
import com.aprilAssessment.HRMS.entity.Property;
import com.aprilAssessment.HRMS.properties.Apartment;
import com.aprilAssessment.HRMS.properties.Condo;
import com.aprilAssessment.HRMS.properties.House;

public class UpdateRecord extends Database {

    public static Apartment updateApartment(String propertyCode) {
        Apartment updatedProperty = null;
        for (Property property: Database.properties) {
            try {
                if (property.getPropertyCode().equalsIgnoreCase(propertyCode)) {
                    updatedProperty = (Apartment) property;
                    System.out.println(property);
                    break;
                }
            } catch (NullPointerException ignored) {}
        }
        return updatedProperty;
    }

    public static Condo updateCondo(String propertyCode) {
        Condo updatedProperty = null;
        for (Property property: Database.properties) {
            try {
                if (property.getPropertyCode().equalsIgnoreCase(propertyCode)) {
                    updatedProperty = (Condo) property;
                    System.out.println(property);
                    break;
                }
            } catch (NullPointerException ignored) {}
        }
        return updatedProperty;
    }

    public static House updateHouse(String propertyCode) {
        House updatedProperty = null;
        for (Property property: Database.properties) {
            try {
                if (property.getPropertyCode().equalsIgnoreCase(propertyCode)) {
                    updatedProperty = (House) property;
                    System.out.println(property);
                    break;
                }
            } catch (NullPointerException ignored) {}
        }
        return updatedProperty;
    }
}
