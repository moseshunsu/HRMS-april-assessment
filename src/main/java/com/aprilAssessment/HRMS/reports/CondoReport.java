package com.aprilAssessment.HRMS.reports;

import com.aprilAssessment.HRMS.Database.Database;
import com.aprilAssessment.HRMS.entity.OccupiedStatus;
import com.aprilAssessment.HRMS.entity.Property;
import com.aprilAssessment.HRMS.properties.Condo;

public class CondoReport extends Database {

    public static void condoReport() {

        int condoCounter = 0, totalNumberOfBedrooms = 0;
        int totalNumberOfBathrooms = 0, totalMonthlyRentalIncome = 0;
        int totalNumberOccupied = 0, totalNumberOfOccupied = 0;

        for (Property property : Database.properties) {
            if (property == null) {
                break;
            } else if (property instanceof Condo) {
                condoCounter++;
                totalNumberOfBedrooms += property.getNumberOfBedrooms();
                totalNumberOfBathrooms += property.getNumberOfBathrooms();
                if (property.getOccupiedStatus() == OccupiedStatus.OCCUPIED) {
                    totalMonthlyRentalIncome += property.getRentPerMonth();
                    totalNumberOccupied++;
                } else if (property.getOccupiedStatus() == OccupiedStatus.NOT_OCCUPIED) {
                    totalNumberOfOccupied++;
                }
            }
        }

        System.out.println("Condo details as follow:");
        System.out.printf("Total Number of all Apartments: %d%n", condoCounter);
        System.out.printf("Total Number bedrooms: %d%n", totalNumberOfBedrooms);
        System.out.printf("Total Number bathrooms: %d%n", totalNumberOfBathrooms);
        System.out.printf("Total rental income per month: %d%n", totalMonthlyRentalIncome);
        System.out.printf("Total number occupied: %d%n", totalNumberOccupied);
        System.out.printf("Total number unoccupied: %d%n%n", totalNumberOfOccupied);
    }

}
