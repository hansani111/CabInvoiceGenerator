package com.bridgelabz;

public class CabInvoice {

    static final double COST_PER_KM = 10;
    static final double COST_PER_MIN = 1;
    static final double MINIMUM_FARE = 5;

    public double calculateFare(double distance, double time) {
        double fare = distance * COST_PER_KM + time * COST_PER_MIN;
        if (fare < MINIMUM_FARE)
            fare = MINIMUM_FARE;

        return fare;
    }
}
