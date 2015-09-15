package com.example;

public class main {
    public static void main(String args[])
    {
    final int METERS = 28;
    final int KILOMETERS = 168;
    final int CENTIMETERS = 47;
    final int KILOMETERS_PER_HOUR = 27;
    final int LITERS = 92;
    final int KILOGRAMS = 200;

    final double YARDS_PER_METER = 1.09361;
    final double MILES_PER_KILOMETER = 0.621371;
    final double INCHES_PER_CENTIMETER = 0.393701;
    final double FEET_PER_KILOMETER = 3280.84;
    final double SECONDS_PER_HOUR = 3600;
    final double GALLONS_PER_LITER = 0.264172;
    final double POUNDS_PER_KILOGRAM = 2.20462;

    double metersToYards;
    double kilometersToMiles;
    double centimetersToInches;
    double kmPerHourToFeetPerSecond;
    double litersToGallons;
    double kilogramsToPounds;

    //Math time

    metersToYards = METERS * YARDS_PER_METER;
    kilometersToMiles = KILOMETERS * MILES_PER_KILOMETER;
    centimetersToInches = CENTIMETERS * INCHES_PER_CENTIMETER;
    kmPerHourToFeetPerSecond = (KILOMETERS_PER_HOUR * FEET_PER_KILOMETER) / (SECONDS_PER_HOUR);
    litersToGallons = LITERS * GALLONS_PER_LITER;
    kilogramsToPounds = KILOGRAMS * POUNDS_PER_KILOGRAM;

    //Display Results
    System.out.println(METERS + " meters is equal to " + metersToYards + " yards");
    System.out.println(KILOMETERS + " kilometers is equal to " + kilometersToMiles + " miles");
    System.out.println(CENTIMETERS + " centimeters is equal to " + centimetersToInches + " in.");
    System.out.println(KILOMETERS_PER_HOUR + " kilometers/hr is equal to " + kmPerHourToFeetPerSecond + " feet/sec");
    System.out.println(LITERS + " liters is equal to " + litersToGallons + " gallons");
    System.out.println(KILOGRAMS + " kilograms is equal to " + kilogramsToPounds + " pounds");

    }
}
