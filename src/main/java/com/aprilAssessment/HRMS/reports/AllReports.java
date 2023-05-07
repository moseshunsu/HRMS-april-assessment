package com.aprilAssessment.HRMS.reports;

import com.aprilAssessment.HRMS.Database.Database;

public class AllReports extends Database {

    public static void allReports() {
        System.out.printf("Total Number of all properties: %d%n%n", Database.counter);
        ApartmentReport.apartmentReport();
        CondoReport.condoReport();
        HouseReport.houseReport();
    }

}
