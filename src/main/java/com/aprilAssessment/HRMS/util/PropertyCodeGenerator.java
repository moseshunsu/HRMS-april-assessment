package com.aprilAssessment.HRMS.util;

public class PropertyCodeGenerator {
    private static int houseCounter, condoCounter, apartmentCounter = 0;


    public static String generateCode(String prefix) {

        return switch (prefix) {
            case "APA" -> prefix + String.format("%03d", ++apartmentCounter);
            case "CON" -> prefix + String.format("%03d", ++condoCounter);
            case "HOU" -> prefix + String.format("%03d", ++houseCounter);
            default -> "";
        };
    }
}
