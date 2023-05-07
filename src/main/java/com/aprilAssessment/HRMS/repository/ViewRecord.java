package com.aprilAssessment.HRMS.repository;

import com.aprilAssessment.HRMS.Database.Database;
import com.aprilAssessment.HRMS.entity.Location;
import com.aprilAssessment.HRMS.entity.OccupiedStatus;
import com.aprilAssessment.HRMS.entity.Property;
import com.aprilAssessment.HRMS.properties.Apartment;
import com.aprilAssessment.HRMS.properties.Condo;
import com.aprilAssessment.HRMS.properties.House;

public class ViewRecord extends Database{

    public static void viewByApartments() {
        for (Property property: Database.properties){
            if (property instanceof Apartment) {
                System.out.println(property);
            }
        }
    }

    public static void viewByHouses() {
        for (Property property: Database.properties){
            if (property instanceof House) {
                System.out.println(property);
            }
        }
    }

    public static void viewByCondos() {
        for (Property property: Database.properties){
            if (property instanceof Condo) {
                System.out.println(property);
            }
        }
    }

    public static void viewAllProperties() {
        for (Property property: Database.properties) {
            System.out.println(property);
        }
    }

    public static void viewByOccupiedStatus(OccupiedStatus occupiedStatus) {
        for (Property property: Database.properties) {
            try {
                if (property.getOccupiedStatus() == occupiedStatus) {
                    System.out.println(property);
                }
            } catch (NullPointerException ignored) {}
        }
    }

    public static void viewByLocation(Location location) {
        for (Property property: Database.properties) {
            try {
                if (property.getLocation() == location) {
                    System.out.println(property);
                }
            } catch (NullPointerException ignored) {}
        }
    }

    public static void viewByPropertyCode(PropertyCodes codePrefix) {
        for (Property property: Database.properties) {
            try {
                if (property.getPropertyCode().contains(String.valueOf(codePrefix))) {
                    System.out.println(property);
                }
            } catch (NullPointerException ignored) {}
        }
    }

}
