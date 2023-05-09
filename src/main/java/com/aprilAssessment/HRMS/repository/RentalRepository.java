package com.aprilAssessment.HRMS.repository;

import com.aprilAssessment.HRMS.Database.Database;
import com.aprilAssessment.HRMS.entity.Property;

public class RentalRepository extends Database {

    public static void addProperty(Property property) {
            if (Database.counter < Database.properties.length) {
                Database.properties[Database.counter++] = property;
            } else System.out.println("Database maximum limit reached, kindly delete some records data and try again");
        }

    public static void deleteProperty(String propertyCode) {
        for (int i = 0; i < Database.counter; i++) {
            if (Database.properties[i].getPropertyCode().equalsIgnoreCase(propertyCode)) {
                Database.properties[i] = null;
                for (int j = i; j < Database.counter; j++) {
                    Database.properties[j] = Database.properties[j + 1];
                }
                Database.properties[i + 1] = null;
                break;
            }
        }
        Database.counter--;
    }

}
