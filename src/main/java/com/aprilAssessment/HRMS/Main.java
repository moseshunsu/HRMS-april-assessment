package com.aprilAssessment.HRMS;

import com.aprilAssessment.HRMS.entity.Location;
import com.aprilAssessment.HRMS.entity.OccupiedStatus;
import com.aprilAssessment.HRMS.properties.Apartment;
import com.aprilAssessment.HRMS.properties.Condo;
import com.aprilAssessment.HRMS.properties.House;
import com.aprilAssessment.HRMS.reports.ApartmentReport;
import com.aprilAssessment.HRMS.reports.AllReports;
import com.aprilAssessment.HRMS.repository.*;

public class Main {

    public static void main(String[] args) {
//        RentalRepository.addProperty(new House(Location.ABUJA, ));
        RentalRepository.addProperty((new House(Location.ABUJA,9, 5, 10000, OccupiedStatus.NOT_OCCUPIED, 3, 500)));

        RentalRepository.addProperty((new Condo(Location.LAGOS,4, 3,
                5000, OccupiedStatus.OCCUPIED, 1, "pool")));

        RentalRepository.addProperty((new Condo(Location.PORT_HARCOURT, 4,3,
                5000, OccupiedStatus.NOT_OCCUPIED, 1, "gym")));

        RentalRepository.addProperty((new Condo(Location.LAGOS,4, 3,
                5000, OccupiedStatus.NOT_OCCUPIED, 1, "pool, gym")));

//        ViewRecord.viewAllProperties();
        System.out.println();
        ViewRecord.viewByApartments();
        System.out.println();
        ViewRecord.viewByHouses();
        System.out.println();
        ViewRecord.viewByCondos();
        System.out.println();
        System.out.println();
        ViewRecord.viewByLocation(Location.LAGOS);
        System.out.println();
        ViewRecord.viewByLocation(Location.ABUJA);
        System.out.println();
        ViewRecord.viewByLocation(Location.PORT_HARCOURT);
        System.out.println();
        ViewRecord.viewByPropertyCode(PropertyCodes.CON);
        System.out.println();
        ViewRecord.viewByPropertyCode(PropertyCodes.APA);
        System.out.println();
        ViewRecord.viewByPropertyCode(PropertyCodes.HOU);
        System.out.println();
        ViewRecord.viewByOccupiedStatus(OccupiedStatus.NOT_OCCUPIED);
        System.out.println();
        ViewRecord.viewByOccupiedStatus(OccupiedStatus.OCCUPIED);
        System.out.printf("%n%n%n%n%n");
        UpdateRecord.updateCondo("cOn003").setAmenities("pool test");
        UpdateRecord.updateCondo("cOn003");
//        UpdateRecord.updateCondoRecord("Apa001").setLocation(Location.ABUJA);
        System.out.printf("%n%n%n");
        RentalRepository.deleteProperty("coN002");
        ViewRecord.viewAllProperties();
        RentalRepository.addProperty(new Apartment(Location.PORT_HARCOURT, 5,
                2, 2000, OccupiedStatus.OCCUPIED, 3));
        RentalRepository.addProperty(new Apartment(Location.PORT_HARCOURT, 5,
                2, 2000, OccupiedStatus.NOT_OCCUPIED, 3));
        RentalRepository.addProperty(new Apartment(Location.PORT_HARCOURT, 5,
                2, 2000, OccupiedStatus.NOT_OCCUPIED, 3));
        System.out.printf("%n%n%n");
        ViewRecord.viewAllProperties();
        System.out.printf("%n%n%n");
        AllReports.allReports();

        ApartmentReport.apartmentReport();

        ViewRecord.viewByCondos();

    }

}
